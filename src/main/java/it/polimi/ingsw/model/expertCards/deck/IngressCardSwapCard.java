package it.polimi.ingsw.model.expertCards.deck;

import it.polimi.ingsw.model.expertCards.CardManager;
import it.polimi.ingsw.model.expertCards.ExpertCard;
import it.polimi.ingsw.model.objectTypes.FixedObjectStudent;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.utils.IdManager;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Expert card n.7, that enables to swap up to three students from this card with students on the ingress of a player
 */
public class IngressCardSwapCard implements ExpertCard, FixedObjectStudent, Serializable {

    /**
     * Default constructor
     */
    public IngressCardSwapCard(CardManager cardManager) {
        this.id = "44";
        this.manager = cardManager;
        IdManager.getInstance().addExpertCard(this);
        students = new LinkedList<Student>();
        for (int i=0; i<6; i++) {
            addStudent(manager.getBag().newStudent());
        }
    }

    /**
     * card id
     */
    private String id;

    /**
     * card cost
     */
    private Integer cost = 1;

    /**
     * list of the students on the card
     */
    private LinkedList<Student> students;

    /**
     * Reference to card manager
     */
    private CardManager manager;

    /**
     * Appliance of the effect of the card
     */
    public void apply() {
        incrementCost();
    }

    /**
     * @return card cost
     */
    public Integer getCost() {
        return this.cost;
    }

    /**
     * increments card cost
     */
    private void incrementCost() {
        cost = cost + 1;
    }

    /**
     * @return card id
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * add student to this card
     * @param student
     */
    public void addStudent(Student student) {
        if (!this.students.contains(student) && students.size()<7) {
            if (student.getPosition()!=null) {        // If the student was on a FixedObject, this object is updated
                FixedObjectStudent position = (FixedObjectStudent) student.getPosition();
                position.removeStudent(student);
            }
            student.setPosition(this);
            this.students.add(student);
        }
    }

    /**
     * remove student from this card
     * @param student
     */
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    /**
     * @return students of this card
     */
    public LinkedList<Student> getStudents() {
        return new LinkedList<>(this.students);
    }

    /**
     * @return num of students of this card
     */
    public Integer numOfStudents() {
        return this.students.size();
    }

}