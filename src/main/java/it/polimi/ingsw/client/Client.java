package it.polimi.ingsw.client;


import it.polimi.ingsw.client.view.CLI;
import it.polimi.ingsw.client.view.gui.controllers.GUIController;
import it.polimi.ingsw.message.*;
import it.polimi.ingsw.model.Game;
import it.polimi.ingsw.model.player.Player;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Client {

    /**
     * name of the player lost
     */
    private String namePLayerLost;

    /**
     * Keep the reference to the socket
     */
    private Socket socket;

    /**
     * Keep the reference to InputStream
     */
    private ObjectInputStream socketIn;

    /**
     * Keep the ip port
     */
    private String ip;

    /**
     *Keep the reference to the port
     */
    private int port;

    /**
     * Keep the reference to the game
     */
    private Game game;

    /**
     * Keep the reference to the Scanner
     */
    private Scanner stdin;

    /**
     * Keep the reference to the namePlayer
     */
    private String namePlayer;

    /**
     * It's a semaphore needed to synchronized with the output
     */
    private Object inputObject;

    /**
     * Keeps the reference to the CLI CLIController
     */
    private CLIController cliController;

    /**
     * Keep the reference to the OutputStream
     */
    private ObjectOutputStream socketOut;

    /**
     * Set if the player is active to read or not
     */
    private Boolean active = true;

    /**
     * States if the view is CLI (false) or GUI (true)
     */
    private Boolean isCli = true;

    /**
     * The ip address and the port
     * @param ip String
     * @param port Integer
     */
    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    /**
     * Get the active variable
     * @return active
     */
    public synchronized boolean isActive() {
        return active;
    }

    /**
     * Set the active variable
     * @param active Boolean
     */
    public synchronized void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * semaphore
     */
    private Semaphore semaphore = new Semaphore(0);

    /**
     * @param socketIn The inputStream
     * @return Thread  Return the thread who will keep read and once he read it will run the CLIController and wait for his termination
     */
    public Thread asyncReadFromSocket(final ObjectInputStream socketIn) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        while (isActive()) {
                            inputObject = socketIn.readObject();
                            if (!isCli) {
                                if (inputObject instanceof ConnectionLost) {
                                    GUIController.getInstance().setClientState(ClientState.CONNECTIONLOST);
                                    GUIController.getInstance().chooseScene();
                                }else if (inputObject instanceof ClientLost) {
                                    namePLayerLost = ((ClientLost) inputObject).getNamePlayerLost();
                                    GUIController.getInstance().setClientState(ClientState.CLIENTLOST);
                                    GUIController.getInstance().chooseScene();
                                }else if (inputObject instanceof SetUp) {
                                    GUIController.getInstance().setClientState(ClientState.LOGIN);
                                    new Thread(GUIController.getInstance().chooseScene());
                                }else if (inputObject instanceof LoadGame) {
                                    GUIController.getInstance().setClientState(ClientState.LOAD);
                                    GUIController.getInstance().chooseScene();
                                }else if (inputObject instanceof EqualName) {
                                    GUIController.getInstance().setClientState(ClientState.EQUALNAME);
                                    GUIController.getInstance().chooseScene();
                                }else if (inputObject instanceof PlayerIsPlus) {
                                    GUIController.getInstance().setClientState(ClientState.PLAYERPLUS);
                                    GUIController.getInstance().chooseScene();
                                }else if (inputObject instanceof IsFirst) {
                                    GUIController.getInstance().setClientState(ClientState.ISFIRST);
                                    new Thread(GUIController.getInstance().chooseScene());
                                } else if (inputObject instanceof SetName) {
                                    namePlayer = ((SetName) inputObject).getName();
                                } else if (inputObject instanceof Game) {
                                    game = (Game) inputObject;
                                    for (Player p : game.getPlayerList()) {
                                        if (p.getIsWinner()) {
                                            GUIController.getInstance().setClientState(ClientState.WINNER);
                                            GUIController.getInstance().chooseScene();
                                            return;
                                        }
                                    }
                                    if (game.getCurrentPlayer().getName().equals(namePlayer)) {
                                        GUIController.getInstance().setClientState(ClientState.PLAYING);
                                        GUIController.getInstance().chooseScene();
                                    }
                                }
                            } else {
                                if (inputObject instanceof ConnectionLost) {
                                   cliController.setClientState(ClientState.CONNECTIONLOST);
                                   cliController.run();
                                }else if (inputObject instanceof PlayerIsPlus) {
                                    cliController.setClientState(ClientState.PLAYERPLUS);
                                    cliController.run();
                                }else if (inputObject instanceof String) {
                                    System.out.println((String) inputObject);
                                } else if (inputObject instanceof Game) {
                                    game = (Game) inputObject;
                                    for (Player p : game.getPlayerList()) {
                                        if (p.getIsWinner()) {
                                            cliController.setClientState(ClientState.WINNER);
                                            cliController.run();
                                            return;
                                        }
                                    }
                                    if (game.getCurrentPlayer().getName().equals(namePlayer) && cliController.getClientState()!=ClientState.WINNER) {
                                        cliController.setClientState(ClientState.PLAYING);
                                        cliController.run();
                                    }
                                } else if (inputObject instanceof SetUp) {
                                    cliController.setClientState(ClientState.LOGIN);
                                    cliController.run();
                                } else if (inputObject instanceof EqualName) {
                                    cliController.setClientState(ClientState.EQUALNAME);
                                    cliController.run();
                                }else if (inputObject instanceof LoadGame) {
                                    cliController.setClientState(ClientState.LOAD);
                                    cliController.run();
                                } else if (inputObject instanceof SetName) {
                                    namePlayer = ((SetName) inputObject).getName();
                                } else if (inputObject instanceof IsFirst) {
                                    cliController.setClientState(ClientState.ISFIRST);
                                    cliController.run();
                                } else if (inputObject instanceof PlayerIsPlus) {
                                    cliController.setClientState(ClientState.PLAYERPLUS);
                                    cliController.run();
                                } else if (inputObject instanceof ClientLost) {
                                    namePLayerLost = ((ClientLost) inputObject).getNamePlayerLost();
                                    cliController.setClientState(ClientState.CLIENTLOST);
                                    cliController.run();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    } catch (Exception e) {
                        setActive(false);
                    }
                }
            }
        });
        return t;
    }

    /**
     * When the client is running start the thread for reading and wait until that thread die
     * @throws IOException exception
     * @return runnable thread
     */
    public Runnable run() throws IOException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    try {
                        socket = new Socket(ip, port);
                    } catch(ConnectException e){
                        System.out.println(e.getMessage());
                        if (!isCli) {
                            GUIController.getInstance().setConnectionRefuse(true);
                            GUIController.getInstance().setClientState(ClientState.CONNECTIONREFUSED);
                            GUIController.getInstance().chooseScene();
                            return;
                        } else {
                            cliController.connectionRefuse();
                            return;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Connection established.");
                    socketIn = new ObjectInputStream(socket.getInputStream());
                    socketOut = new ObjectOutputStream(socket.getOutputStream());
                    stdin = new Scanner(System.in);
                    if (!isCli) {
                        GUIController.getInstance().setConnectionTrue(true);
                        GUIController.getInstance().setClientState(ClientState.WAITING);
                        GUIController.getInstance().chooseScene();
                    } else {
                        CLI cli = new CLI(Client.this, cliController);
                        cliController.setCli(cli);
                    }
                    Thread t0 = new Thread(asyncReadFromSocket(socketIn));
                    final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(128);
                    executor.submit(new Thread(asyncReadFromSocket(socketIn)));
                    executor.awaitTermination(1, TimeUnit.DAYS);

                    System.out.println("Connection closed from the client side");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if(stdin!=null) {
                            stdin.close();
                            socketIn.close();
                            socketOut.close();
                            socket.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return t;
    }

    /**
     * The scanner of the keyboard
     * @return stdIn
     */
    public Scanner getScanner() {
        return this.stdin;
    }

    /**
     * @return player name
     */
    public String getNamePlayer() {
        return this.namePlayer;
    }

    /**
     * The inputStream
     * @return socketOut
     */
    public ObjectOutputStream getIn() {
        return this.socketOut;
    }

    /**
     * @return input stream
     */
    public ObjectInputStream getOut() {
        return this.socketIn;
    }

    /**
     * The reference to the game in the client
     * @return game
     */
    public Game getGame() {
        return this.game;
    }

    /**
     * @return name of the palyer lost
     */
    public String getNamePLayerLost() {
        return this.namePLayerLost;
    }

    /**
     * sets the name of the player lost
     * @param namePLayerLost String
     */
    public void setNamePLayerLost(String namePLayerLost) {
        this.namePLayerLost = namePLayerLost;
    }

    /**
     * Sets the view to CLI
     */
    public void setIsCli(){
        this.isCli = true;
    }

    /**
     * sets the cli controller
     * @param CLIController CLIController
     */
    public void setController(CLIController CLIController) {
        this.cliController = CLIController;
    }

    /**
     * sets ip address
     * @param ip String
     */
    public void setIp(String ip){
        this.ip = ip;
    }

    /**
     * Sets port address
     * @param port Integer
     */
    public void setPort(Integer port){
        this.port = port;
    }

    /**
     * sets if the game is played by gui or by cli
     */
    public void setIsGui(){
        this.isCli = false;
    }

    /**
     * @return ip address
     */
    public String getIp(){
        return this.ip;
    }

    /**
     * @return port address
     */
    public Integer getPort(){
        return this.port;
    }

}
