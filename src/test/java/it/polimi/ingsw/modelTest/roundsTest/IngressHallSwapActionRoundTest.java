package it.polimi.ingsw.modelTest.roundsTest;

import it.polimi.ingsw.model.Game;
import it.polimi.ingsw.model.enumerations.AssistantCard;
import it.polimi.ingsw.model.enumerations.Color;
import it.polimi.ingsw.model.enumerations.PlayerColor;
import it.polimi.ingsw.model.enumerations.PlayerPhase;
import it.polimi.ingsw.model.expertCards.deck.IngressHallSwapCard;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.model.player.Player;
import it.polimi.ingsw.model.studentSuppliers.Bag;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test of IngressHallSwapActionRound class
 */
public class IngressHallSwapActionRoundTest {

    /**
     * Test of expertHallIngressSwap method
     */
    @Test
    public void expertHallIngressSwapTest() {
        Player player = new Player("elena");
        Player player1 = new Player("vittorio");
        Game game = new Game();
        LinkedList<Player> lista = new LinkedList<>();
        lista.add(player1);
        lista.add(player);
        game.setPlayerList(lista);
        player.setPlayerColor(PlayerColor.WHITE);
        player1.setPlayerColor(PlayerColor.GREY);
        game.initializeGame();
        game.setPianificationRoundState();
        player.setPlayerPhase(PlayerPhase.CHOOSING_ASSISTANT);
        player1.setPlayerPhase(PlayerPhase.CHOOSING_ASSISTANT);
        game.setCurrentPlayer(player1);
        game.playAssistantCard(AssistantCard.TWO_CARD.getId());
        game.setCurrentPlayer(player);
        game.playAssistantCard(AssistantCard.THREE_CARD.getId());
        IngressHallSwapCard ingressCardSwapCard = new IngressHallSwapCard();
        player1.setCoin(5);
        game.playExpertCard(ingressCardSwapCard.getId(),null);
        Student student1 = new Student(Color.RED);
        Student student = new Student(Color.YELLOW);
        System.out.println(game.getCurrentPlayer());
        player1.getSchool().getHall().getLine(Color.RED).addStudent(student1);
        player1.getSchool().getIngress().addStudent(student);
        game.expertIngressHallSwap(student1.getId(), student.getId());
        // check that round has permitted the action
        assertTrue(player1.getSchool().getIngress().getStudents().contains(student1) && !player1.getSchool().getIngress().getStudents().contains(student) && player1.getSchool().getHall().getLine(Color.YELLOW).getStudents().contains(student) && !player1.getSchool().getHall().getLine(Color.RED).getStudents().contains(student1));
    }
}
