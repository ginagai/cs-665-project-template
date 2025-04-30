/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: SadState.java
 * Description:
 * Represents the sad emotional state of the pet.
 * Defines how the pet transitions to other states from sadness.
 */

package edu.bu.met.cs665.petemotion;

/**
 * Represents a gloomy/sad state of the pet.
 */
public class SadState implements PetState {

    /**
     * Snack makes the pet happy.
     * @param pet the MoodPet instance
     */
    @Override
    public void offerSnack(MoodPet pet) {
        pet.setState(new HappyState());
    }

    /**
     * Play improves mood to happy.
     * @param pet the MoodPet instance
     */
    @Override
    public void startPlaySession(MoodPet pet) {
        pet.setState(new HappyState());
    }

    /**
     * Further neglect makes the pet angry.
     * @param pet the MoodPet instance
     */
    @Override
    public void neglect(MoodPet pet) {
        pet.setState(new AngryState());
    }

    /**
     * Returns the label for this mood.
     * @return "Sad"
     */
    @Override
    public String getMoodLabel() {
        return "Sad";
    }
}