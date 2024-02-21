package it.polimi.ingsw.modelTest.expertCardsTest.deckTest;

import it.polimi.ingsw.model.calculations.influence.InfluenceManager;
import it.polimi.ingsw.model.calculations.professor.ProfessorManager;
import it.polimi.ingsw.model.enumerations.Color;
import it.polimi.ingsw.model.enumerations.PlayerColor;
import it.polimi.ingsw.model.expertCards.CardManager;
import it.polimi.ingsw.model.expertCards.deck.HallBagSwapCard;
import it.polimi.ingsw.model.islands.IslandManager;
import it.polimi.ingsw.model.pawns.MotherNature;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.model.player.Player;
import it.polimi.ingsw.model.studentSuppliers.Bag;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test of HallBagSwapCard class
 */
public class HallBagSwapCardTest {

    /**
     * Test of apply method
     */
    @Test
    public void applyTest() {
        LinkedList<Player> players = new LinkedList<>();
        players.add(new Player("vittorio"));
        Bag bag = new Bag(false);
        MotherNature motherNature = new MotherNature();
        players.get(0).setPlayerColor(PlayerColor.WHITE);
        players.get(0).getSchool().getHall().getLine(Color.RED).addStudent(new Student(Color.RED)); // 4 students in ingress
        players.get(0).getSchool().getHall().getLine(Color.RED).addStudent(new Student(Color.RED));
        players.get(0).getSchool().getHall().getLine(Color.RED).addStudent(new Student(Color.RED));
        players.get(0).getSchool().getHall().getLine(Color.RED).addStudent(new Student(Color.RED));
        InfluenceManager influenceManager = new InfluenceManager(motherNature, players);
        IslandManager islandManager = new IslandManager(motherNature);
        ProfessorManager professorManager = new ProfessorManager(players);
        CardManager cardManager = new CardManager(influenceManager, islandManager, professorManager, players, bag);
        HallBagSwapCard hallBagSwapCard = new HallBagSwapCard(cardManager);
        hallBagSwapCard.apply(Color.RED);
        assertTrue(hallBagSwapCard.getCost() == 4); // check that cost is incremented
        assertTrue(players.get(0).getSchool().getHall().getLine(Color.RED).getStudents().size()==1); // check that students are removed
    }

}
