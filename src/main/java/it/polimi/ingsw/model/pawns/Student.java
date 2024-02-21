package it.polimi.ingsw.model.pawns;

import it.polimi.ingsw.model.enumerations.Color;
import it.polimi.ingsw.model.objectTypes.FixedObject;
import it.polimi.ingsw.model.objectTypes.PlaceableObject;
import it.polimi.ingsw.utils.IdManager;

import java.io.Serializable;

/**
 * Class used to represent the student pawn
 */
public class Student implements PlaceableObject, Serializable {

    /**
     * Default constructor
     */
    public Student(Color color){
        this.color = color;
        IdManager.getInstance().addStudent(this);
    }

    /**
     * Indicates the color of the single student
     */
    private FixedObject position;

    /**
     * Indicates the color of the single student
     */
    private Color color;

    /**
     * student id
     */
    private String id;

    /**
     * @return the color of the student
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * @return the current position of the student
     */
    public FixedObject getPosition() {
        return this.position;
    }

    /**
     * sets student position
     * @param position
     */
    public void setPosition(FixedObject position) {
        this.position = position;
    }

    /**
     * @return student id
     */
    public String getId() { return id; }

    /**
     * sets student id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

}