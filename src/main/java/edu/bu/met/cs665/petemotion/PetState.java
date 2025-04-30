/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: PetState.java
 * Description:
 * Defines the State interface for pet emotional behavior.
 * Specifies contract for actions and mood labeling across states.
 */

package edu.bu.met.cs665.petemotion;

/**
 * Defines the interface for all pet emotional states.
 */
public interface PetState {

    /**
     * Defines behavior when the pet is offered a snack.
     * @param pet the context pet object
     */
    void offerSnack(MoodPet pet);

    /**
     * Defines behavior when the pet is engaged in play.
     * @param pet the context pet object
     */
    void startPlaySession(MoodPet pet);

    /**
     * Defines behavior when the pet is neglected.
     * @param pet the context pet object
     */
    void neglect(MoodPet pet);

    /**
     * Returns the mood label representing the state.
     * @return mood label string
     */
    String getMoodLabel();
}
