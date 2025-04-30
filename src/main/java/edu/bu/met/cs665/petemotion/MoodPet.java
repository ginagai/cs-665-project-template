/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: MoodPet.java
 * Description:
 * Core context class that manages the pet's mood state and triggers transitions.
 * Supports interaction via snack, play, and neglect.
 */
package edu.bu.met.cs665.petemotion;
import java.util.ArrayList;
import java.util.List;

/**
 * Main context class that models the pet's behavior and emotional transitions.
 */
class MoodPet {
    private PetState state;
    private List<PetObserver> observers;
    private PetMediator mediator;

    /**
     * Constructs a MoodPet with an initial Happy state.
     * @param mediator the mediator for routing messages
     */
    public MoodPet(PetMediator mediator) {
        this.state = new HappyState();
        this.mediator = mediator;
        this.observers = new ArrayList<>();
    }

    /**
     * Triggers the current state's snack behavior.
     */
    public void offerSnack() {
        state.offerSnack(this);
    }

    /**
     * Triggers the current state's play session behavior.
     */
    public void startPlaySession() {
        state.startPlaySession(this);
    }

    /**
     * Triggers the current state's neglect behavior.
     */
    public void neglect() {
        state.neglect(this);
    }

    /**
     * Updates the pet's internal state and notifies observers.
     * @param newState the new state to set
     */
    public void setState(PetState newState) {
        this.state = newState;
        notifyObservers("Current mood: " + state.getMoodLabel());
    }

    /**
     * Returns the label of the current state.
     * @return mood label as string
     */
    public String getCurrentMoodLabel() {
        return state.getMoodLabel();
    }

    /**
     * Adds a new observer to the list.
     * @param o the observer to add
     */
    public void addObserver(PetObserver o) {
        observers.add(o);
    }

    /**
     * Notifies all observers and sends the message to the mediator.
     * @param msg the message to dispatch
     */
    public void notifyObservers(String msg) {
        for (PetObserver o : observers) {
            o.reactTo(msg);
        }
        mediator.mediate(msg);
    }
}

