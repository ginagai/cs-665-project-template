/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: AngryState.java
 * Description:
 * Represents an irritated state in the virtual pet's behavior system.
 * Defines how the pet responds to different user actions while angry.
 */

package edu.bu.met.cs665.petemotion;

/**
 * Represents the 'Angry' emotional state of the pet.
 */
public class AngryState implements PetState {

    /**
     * Snack calms the pet slightly, changing state to Sad.
     *
     * @param pet the MoodPet instance
     */
    @Override
    public void offerSnack(MoodPet pet) {
        pet.setState(new SadState());
    }

    /**
     * Play session has no effect in angry state.
     *
     * @param pet the MoodPet instance
     */
    @Override
    public void startPlaySession(MoodPet pet) {
        pet.notifyObservers("Hmph. Still angry.");
    }

    /**
     * Neglect further angers the pet, keeping the state unchanged.
     *
     * @param pet the MoodPet instance
     */
    @Override
    public void neglect(MoodPet pet) {
        pet.notifyObservers("Grrrr! You’re ignoring me again?");
    }

    /**
     * Returns the label of this state.
     *
     * @return current state label
     */
    @Override
    public String getMoodLabel() {
        return "Angry";
    }
}


