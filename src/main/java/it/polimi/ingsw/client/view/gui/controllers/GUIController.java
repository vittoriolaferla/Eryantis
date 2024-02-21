package it.polimi.ingsw.client.view.gui.controllers;

import it.polimi.ingsw.client.CLIController;
import it.polimi.ingsw.client.Client;
import it.polimi.ingsw.client.ClientState;
import it.polimi.ingsw.message.IngressCardSwap;
import it.polimi.ingsw.message.StudentToIsland;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ConnectException;


public class GUIController {

    /**
     * reference to connection true
     */
    private Boolean connectionTrue = false;

    /**
     * Reference to connection refused
     */
    private Boolean connectionRefuse = false;

    /**
     * Reference to the name of the client lost
     */
    private String nameClientLost;

    /**
     * Set true when a card that needs an island as parameter has been played
     */
    private Boolean cardNeedIsland = false;

    /**
     * Not used
     */
    private Boolean finishTurn = false;

    /**
     * Message method student To Island
     */
    private StudentToIsland studentToIsland;

    /**
     * Keep the reference of the message methode, useful for the expertCard implemented in Rounds
     */
    private IngressCardSwap messageMethodIngressCard;

    /**
     * Keep the reference to the expertCard played
     */
    private String idExpertCardPlayed;

    /**
     * Used to set choose which loading view is the right one to call
     */
    private Boolean needRefresh = false;
    /**
     * Need to use the message in view
     */
    private Boolean cardPlayed = false;

    /**
     * True if e chose an equal name
     */
    private Boolean equal = false;

    /**
     * Set true if isFirst, for change scene
     */
    private Boolean isFirst = false;

    /**
     * Keep the reference to stage
     */
    private static Stage stage;

    /**
     * Keep the reference to client
     */
    private Client client;

    /**
     * Keep the reference to clientState
     */
    private ClientState clientState;

    /**
     * Static reference to controller handler
     */
    private static GUIController GUIController;

    /**
     * Default constructor
     */
    public GUIController() {

    }

    /**
     * Gives controller handler instance
     * @return the instance of the controller handler
     */
    public static GUIController getInstance() {
        if (GUIController == null) {
            GUIController = new GUIController();
        }
        return GUIController;
    }

    /**
     * Receive message from login
     */
    public void receiveMessage() {
        client.asyncReadFromSocket(client.getOut());
    }

    /**
     * Get client reference
     * @return
     */
    public Client getClient() {
        return this.client;
    }

    /**
     * Get stage reference
     * @return
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * Get stage reference
     * @param stage
     */
    public static void setStage(Stage stage) {
        GUIController.stage = stage;
        stage.setOnCloseRequest(e -> System.exit(0));
    }

    /**
     * Set client state
     * @param clientState
     */
    public void setClientState(ClientState clientState) {
        this.clientState = clientState;
    }

    /**
     * Set client
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Set the correct scene in the gui
     * @throws IOException
     */
    public Thread chooseScene() throws IOException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                switch (clientState) {
                    case CONNECTIONLOST:
                    GuiConnectionLostController connectionLost = new GuiConnectionLostController();
                    Platform.runLater(() -> {
                        try {
                            connectionLost.connectionLost();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                    case CLIENTLOST:
                        nameClientLost = client.getNamePLayerLost();
                        GuiLoadingController loadingController = new GuiLoadingController();
                        Platform.runLater(() -> {
                            try {
                                loadingController.clientLost();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case WAITING:
                        GuiPortIpController starting = new GuiPortIpController();
                        Platform.runLater(() -> {
                            try {
                                starting.loading();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case CONNECTIONREFUSED:
                        GuiPortIpController startController = new GuiPortIpController();
                        Platform.runLater(() -> {
                            try {
                                startController.refresh();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case EQUALNAME:
                        setEqual();
                    case LOGIN:
                        GuiPortIpController start = new GuiPortIpController();
                        Platform.runLater(() -> {
                            try {
                                start.login();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                    });
                        break;
                    case ISFIRST:
                        setIsFirst();
                       // System.out.println("isFirst");
                        GuiLoginController controller = new GuiLoginController();
                        Platform.runLater(() -> {
                            try {
                                controller.changeSceneIsFirst();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case PLAYERPLUS:
                        //System.out.println("isPlus");
                        GuiPlayerPlusController plusController = new GuiPlayerPlusController();
                        Platform.runLater(() -> {
                            try {
                                plusController.show();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case LOAD:
                        GuiLoadGameController loadGameController = new GuiLoadGameController();
                        Platform.runLater(() -> {
                            try {
                                loadGameController.showScene();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case WINNER:
                        GuiWinnerController winnerController = new GuiWinnerController();
                        Platform.runLater(() -> {
                            try {
                                winnerController.show();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                        break;
                    case PLAYING:
                        if (client.getGame().getCurrentRound().getId()!=null) {
                            if (client.getGame().getCurrentRound().getId() == 0 || client.getGame().getCurrentRound().getId() == 3 || client.getGame().getCurrentRound().getId() == 2) {
                                GuiChooseExpertCardController cardController = new GuiChooseExpertCardController();
                                Platform.runLater(() -> {
                                    try {
                                        cardController.sceneStudentOnCard();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                });
                            } else if (client.getGame().getCurrentRound().getId() == 1) {
                                GuiActionPhaseController actionController = new GuiActionPhaseController();
                                Platform.runLater(() -> {
                                    try {
                                        actionController.refresh();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                });
                            }
                        } else {
                            switch (client.getGame().getCurrentPlayer().getPlayerPhase()) {
                                //change scene from login to deck/color phase
                                case SET_UP_PHASE:
                                    GuiLoginController controllerLogin = new GuiLoginController();
                                    if (!isFirst) {
                                        Platform.runLater(() -> {
                                            try {
                                                controllerLogin.changeScene();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    } else {
                                        GuiIsFirstController controllerFirst = new GuiIsFirstController();
                                        Platform.runLater(() -> {
                                            try {
                                                controllerFirst.changeScene();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    }
                                    break;
                                //change scene from deck/color phase to choosing assistant card
                                case CHOOSING_ASSISTANT:
                                    if (!needRefresh) {
                                        GuiChooseWizardAndColorController colorController = new GuiChooseWizardAndColorController();
                                        Platform.runLater(() -> {
                                            try {
                                                colorController.changeScene();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    } else {
                                        GuiActionPhaseController colorController = new GuiActionPhaseController();
                                        Platform.runLater(() -> {
                                            try {
                                                colorController.changeScene();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    }
                                    break;
                                //change scene from choosing assistant card to moving students and mn
                                case MOVING_STUDENTS:
                                    if (!needRefresh) {
                                        needRefresh = true;
                                        GuiPianificationPhaseController assistantController = new GuiPianificationPhaseController();
                                        Platform.runLater(() -> {
                                            try {
                                                assistantController.changeScene();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    } else {
                                        GuiActionPhaseController actionController = new GuiActionPhaseController();
                                        Platform.runLater(() -> {
                                            try {
                                                actionController.refresh();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    }
                                    break;
                                case MOVING_MOTHERNATURE, CHOOSING_CLOUD:
                                    GuiActionPhaseController movingMotherNatureController = new GuiActionPhaseController();
                                    Platform.runLater(() -> {
                                        try {
                                            movingMotherNatureController.refresh();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    });
                                    break;
                            }
                        }
                }
            }

        });
        t.start();
        return t;
    }

    /**
     * This method write to the server socket synchronized with the read
     * @param object the object we need to send
     */
    public void write(Object object) {
        synchronized (client) {
            try {
                System.out.println("Writing");
                client.getIn().writeObject(object);
                client.getIn().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Set true if this client is the first one
     */
    public void setIsFirst() {
        this.isFirst = true;
    }

    /**
     * Set equal name boolean
     */
    public void setEqual() {
        this.equal = true;
    }

    /**
     * Get equal name boolean
     * @return Boolean
     */
    public Boolean getEqual() {
        return this.equal;
    }

    /**
     * Get the selected assistant card
     * @return Boolean
     */
    public Boolean getCardPlayed() {
        return this.cardPlayed;
    }

    /**
     * Set the assistant card played
     * @param cardPlayed Boolean
     */
    public void setCardPlayed(Boolean cardPlayed) {
        this.cardPlayed = cardPlayed;
    }

    /**
     * Get the id of the expert card played
     * @return Boolean
     */
    public String getIdExpertCardPlayed() {
        return this.idExpertCardPlayed;
    }

    /**
     * Set the id of the expert card played
     */
    public void setIdExpertCardPlayed() {
        if (client.getGame().getCardManager().getCurrentCard()!=null) {
            this.idExpertCardPlayed = client.getGame().getCardManager().getCurrentCard().getId();
        } else {
            this.idExpertCardPlayed = null;
        }
    }

    /**
     * Set the id of the expert card played
     */
    public void setIdExpertCardPlayed(String id){
        this.idExpertCardPlayed = id;
    }

    /**
     * Get the type of message method to send at the model
     * @return IngressCardSwap
     */
    public IngressCardSwap getMessageMethod() {
        return this.messageMethodIngressCard;
    }

    /**
     * Set the type of message method to send at the model
     * @param messageMethod IngressCardSwap
     */
    public void setMessageMethodIngressCard(IngressCardSwap messageMethod) {
        this.messageMethodIngressCard = messageMethod;
    }

    /**
     * Get finished turn boolean
     * @return Boolean
     */
    public Boolean getFinishTurn() {
        return this.finishTurn;
    }

    /**
     * Set finished turn boolean
     * @param finishTurn Boolean
     */
    public void setFinishTurn(Boolean finishTurn) {
        this.finishTurn = finishTurn;
    }

    /**
     * Get the student of studentToIsland expert card effect
     * @return StudentToIsland
     */
    public StudentToIsland getStudentToIsland() {
        return this.studentToIsland;
    }

    /**
     * Get the student studentToIsland expert card effect
     * @param studentToIsland StudentToIsland
     */
    public void setStudentToIsland(StudentToIsland studentToIsland) {
        this.studentToIsland = studentToIsland;
    }

    /**
     * Get if is needed an island because of an expert card effect
     * @return Boolean
     */
    public Boolean getCardNeedIsland() {
        return this.cardNeedIsland;
    }

    /**
     * Set if is needed an island because of an expert card effect
     * @param cardNeedIsland Boolean
     */
    public void setCardNeedIsland(Boolean cardNeedIsland) {
        this.cardNeedIsland = cardNeedIsland;
    }

    /**
     * Get the name of the client lost
     * @return String
     */
    public String getNameClientLost() {
        return this.nameClientLost;
    }

    /**
     * Starts the client
     * @throws ConnectException
     * @throws IOException
     */
    public void startClient() throws ConnectException,IOException {
        Thread t1 = new Thread(client.run());
        t1.start();
    }

    /**
     * Return if connection is refused
     * @return Boolean
     */
    public Boolean getConnectionRefuse() {
        return this.connectionRefuse;
    }

    /**
     * Sets if the connection is refused
     * @param connectionRefuse Boolean
     */
    public void setConnectionRefuse(Boolean connectionRefuse) {
        this.connectionRefuse = connectionRefuse;
    }

    /**
     * Returns connection true
     * @return Boolean
     */
    public Boolean getConnectionTrue() {
        return this.connectionTrue;
    }

    /**
     * Sets connection true
     * @param connectionTrue Boolean
     */
    public void setConnectionTrue(Boolean connectionTrue) {
        this.connectionTrue = connectionTrue;
    }

}

