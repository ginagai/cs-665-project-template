/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: HappyState.java
 * Description:
 * Represents a cheerful state in the virtual pet's emotion system.
 * Defines positive reactions to user actions.
 */
package edu.bu.met.cs665.petemotion;
/**
 * Represents a cheerful state of the pet.
 */
public class HappyState implements PetState {

    /**
     * Responds positively when offered a snack.
     * @param pet the MoodPet instance
     */
    @Override
    public void offerSnack(MoodPet pet) {
        pet.notifyObservers("Yum! Thanks for the treat!");
    }

    /**
     * Responds joyfully to a play session.
     * @param pet the MoodPet instance
     */
    @Override
    public void startPlaySession(MoodPet pet) {
        pet.notifyObservers("Wheee! I'm enjoying this!");
    }

    /**
     * Becomes sad if neglected.
     * @param pet the MoodPet instance
     */
    @Override
    public void neglect(MoodPet pet) {
        pet.setState(new SadState());
    }

    /**
     * Returns the label of the current mood.
     * @return mood label as string
     */
    @Override
    public String getMoodLabel() {
        return "Happy";
    }
}