package it.polimi.ingsw.modelTest.expertCardsTest.deckTest;

import it.polimi.ingsw.model.calculations.influence.InfluenceManager;
import it.polimi.ingsw.model.calculations.influence.TowerInfluence;
import it.polimi.ingsw.model.calculations.professor.ProfessorManager;
import it.polimi.ingsw.model.expertCards.CardManager;
import it.polimi.ingsw.model.expertCards.deck.IslandInfluenceCard;
import it.polimi.ingsw.model.expertCards.deck.TowerInfluenceCard;
import it.polimi.ingsw.model.islands.Island;
import it.polimi.ingsw.model.islands.IslandManager;
import it.polimi.ingsw.model.pawns.MotherNature;
import it.polimi.ingsw.model.player.Player;
import it.polimi.ingsw.model.studentSuppliers.Bag;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test of towerInfluenceCard class
 */
public class TowerInfluenceCardTest {

    /**
     * Test apply
     */
    @Test
    public void applyTest() {
        LinkedList<Player> players = new LinkedList<>();
        players.add(new Player("vittorio"));
        Bag bag = new Bag(false);
        MotherNature motherNature = new MotherNature();
        InfluenceManager influenceManager = new InfluenceManager(motherNature, players);
        IslandManager islandManager = new IslandManager(motherNature);
        ProfessorManager professorManager = new ProfessorManager(players);
        CardManager cardManager = new CardManager(influenceManager, islandManager, professorManager, players, bag);
        TowerInfluenceCard towerInfluenceCard = new TowerInfluenceCard(cardManager);
        cardManager.getInfluenceManager().setStandardInfluence();
        towerInfluenceCard.apply();
        assertTrue(cardManager.getInfluenceManager().getInfluence() instanceof TowerInfluence); // check that tower influence is applied
        assertTrue(towerInfluenceCard.getCost()==4); // check that cost is incremented
    }
}
