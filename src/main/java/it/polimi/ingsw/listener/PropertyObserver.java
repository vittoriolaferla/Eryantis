package it.polimi.ingsw.listener;


import it.polimi.ingsw.model.Game;
import it.polimi.ingsw.server.Server;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyObserver implements PropertyChangeListener {

    /**
     * default constructor
     * @param game
     * @param server
     */
    public PropertyObserver(Game game, Server server) {
        this.game = game;
        this.server = server;
    }

    /**
     * Keep the reference to the server
     */
    private Server server;

    /**
     * Keep the reference to the game
     */
    private Game game;

    /**
     * This method gets called when a bound property is changed.
     * Every time this method is called, the game is saved
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Old value   " + evt.getPropertyName());
        System.out.println("Value changed   " + evt.getOldValue());
        System.out.println("New value    " + evt.getNewValue());
        if(!game.isEnded()){game.saveGame();}else{game.deleteGame();}
        server.sendGame();
    }

}
