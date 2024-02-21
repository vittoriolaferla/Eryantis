package it.polimi.ingsw.model.expertCards.deck;

import it.polimi.ingsw.model.expertCards.CardManager;
import it.polimi.ingsw.model.expertCards.ExpertCard;
import it.polimi.ingsw.model.objectTypes.FixedObjectStudent;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.utils.IdManager;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Expert card n.1, that enables a player to transfer a student from this card to an island
 */
public class StudentToIslandCard implements ExpertCard, FixedObjectStudent , Serializable {

    /**
     * Default constructor
     */
    public StudentToIslandCard(CardManager cardManager) {
        this.id = "38";
        this.manager = cardManager;
        IdManager.getInstance().addExpertCard(this);
        students = new LinkedList<Student>();
        for (int i=0; i<4; i++) {
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
     * Reference to card manager
     */
    private CardManager manager;

    /**
     * list of the students on the card
     */
    private LinkedList<Student> students;

    /**
     * move student to island (student has to be chosen by player)
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
     * add students on the card
     * @param student
     */
    public void addStudent(Student student) {
        if (!this.students.contains(student)) {
            if(student.getPosition()!=null){        // If the student was on a FixedObject, this object is updated
                FixedObjectStudent position = (FixedObjectStudent) student.getPosition();
                position.removeStudent(student);
            }
            student.setPosition(this);
            this.students.add(student);
        }
    }

    /**
     * remove a student from the card
     * @param student
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * @return list of the students of the card
     */
    public LinkedList<Student> getStudents() {
        return new LinkedList<Student>(this.students);
    }

    /**
     * @return number of the students of the card
     */
    public Integer numOfStudents() {
        return this.students.size();
    }

}