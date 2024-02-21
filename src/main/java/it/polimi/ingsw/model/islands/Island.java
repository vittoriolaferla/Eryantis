package it.polimi.ingsw.model.islands;

import it.polimi.ingsw.model.enumerations.Color;
import it.polimi.ingsw.model.enumerations.PlayerColor;
import it.polimi.ingsw.model.objectTypes.FixedObjectStudent;
import it.polimi.ingsw.model.objectTypes.FixedObjectTower;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.model.pawns.Tower;
import it.polimi.ingsw.utils.IdManager;

import java.io.Serializable;
import java.util.LinkedList;


/**
 * Class used to represent an island
 */
public class Island implements FixedObjectStudent, FixedObjectTower, IslandInterface, Serializable {

    /**
     * Default constructor
     */
    public Island() {
        this.id = idCounter.toString();
        IdManager.getInstance().addIsland(this);
        idCounter++;
        if (idCounter==38) {
            idCounter = 26;
        }
    }

    /**
     * Stores the current available id
     */
    private static Integer idCounter = 26;

    /**
     * island id
     */
    private String id;

    /**
     * list of the students on the island
     */
    private LinkedList<Student> students = new LinkedList<Student>();

    /**
     * list of the towers on the island
     */
    private LinkedList<Tower> towers = new LinkedList<Tower>();

    /**
     * true if is part of a group
     */
    private Boolean isGrouped = false;

    /**
     * Stores the number of deny tokens on the island
     */
    private Integer denyTokens = 0;

    /**
     * island size
     */
    private Integer size = 1;

    /**
     * Add the student to the LinkedList
     * @param student
     */
    public void addStudent(Student student) {
        if (!this.students.contains(student)) {
            if (student.getPosition()!=null) {        // If the student was on a FixedObject, this object is updated
                FixedObjectStudent position = (FixedObjectStudent) student.getPosition();
                position.removeStudent(student);
            }
            student.setPosition(this);
            this.students.add(student);
        }
    }

    /**
     * Remove the student from the LinkedList
     * @param student
     */
    public void removeStudent(Student student) {
        if (this.students.contains(student)) {
            this.students.remove(this.students.indexOf(student));
        }
    }

    /**
     * Reference to the linked list of students
     * @return the list of the students
     */
    public LinkedList<Student> getStudents() {
        return new LinkedList<Student>(this.students);
    }

    /**
     * @return number of students on the island
     */
    public Integer numOfStudents() {
        return this.students.size();
    }

    /**
     * Add tower to the LinkedList
     * @param tower
     */
    public void addTower(Tower tower) {
        if (towers.size()==0) {
            if (tower.getPosition()!=null) {        // If the tower was on a FixedObject, this object is updated
                FixedObjectTower position = (FixedObjectTower) tower.getPosition();
                position.removeTower(tower);
            }
            tower.setPosition(this);
            this.towers.add(tower);
        }
    }

    /**
     * Remove tower from the LinkedList
     * @param tower Tower
     */
    public void removeTower(Tower tower) {
        this.towers.remove(0);
    }

    /**
     * Returns the LinkedList of the towers
     * @return linked list of towers
     */
    public LinkedList<Tower> getTowers() {
        if (this.towers.isEmpty())
            return null;
        else
            return this.towers;
    }

    /**
     * Return the number of student by color
     * @param color Color
     * @return Integer
     */
    public Integer numOfStudents(Color color) {
        int counter = 0;
        for (Student s: students ) {
            if (s.getColor()==color) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Adds one deny token to the island
     */
    public void setDeny() { this.denyTokens++; }

    /**
     * Returns the deny token
     * @return the number of denyTokens on the island
     */
    public Integer getDeny() {
        return this.denyTokens;
    }

    /**
     * Removes one deny token from the island
     */
    public void removeDeny() {
        if (denyTokens>0) {
            denyTokens--;
        }
    }

    /**
     * Return the number of towers
     * @return Integer
     */
    public Integer numOfTowers() {
        if (this.towers.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Returns the influence color
     * @return current influenceColor
     */
    public PlayerColor getInfluenceColor() {
        if (this.towers.isEmpty()) {
            return null;
        } else {
            return towers.get(0).getColor();
        }
    }

    /**
     * sets isGrouped
     */
    public void setIsGrouped() {
        this.isGrouped = true;
    }

    /**
     * Returns if the island is grouped
     * @return current isGrouped status
     */
    public Boolean isGrouped () {
        return this.isGrouped;
    }

    /**
     * Returns island size
     * @return size
     */
    public Integer getSize() { return this.size; }

    /**
     * Returns island elements
     * @return LinkedList of islands
     */
    public LinkedList<Island> getIslandGroupElements() {
        LinkedList<Island> list = new LinkedList<>();
        list.add(this);
        return list;
    }

    /**
     * Returns island id
     * @return String
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets island id
     */
    public void setId(String id) {
        this.id = id;
    }

}
