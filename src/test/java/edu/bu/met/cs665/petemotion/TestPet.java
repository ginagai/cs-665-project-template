/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: PetEmotionProject.java
 * Description:
 * This file implements the PetEmotion system using State, Observer, Mediator, and Singleton patterns.
 * It models a virtual pet with emotional state transitions influenced by user interactions.
 */

package edu.bu.met.cs665.petemotion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test class to verify state transitions in MoodPet.
 */
class TestPet {

    @Test
    public void testMoodSwitching() {
        PetMediator mediator = new ConsoleMediator();
        MoodPet pet = new MoodPet(mediator);
        pet.addObserver(msg -> {});

        pet.neglect();
        assertEquals("Sad", pet.getCurrentMoodLabel());

        pet.neglect();
        assertEquals("Angry", pet.getCurrentMoodLabel());

        pet.offerSnack();
        assertEquals("Sad", pet.getCurrentMoodLabel());

        pet.startPlaySession();
        assertEquals("Happy", pet.getCurrentMoodLabel());
    }

    @Test
    public void testObserverNotification() {
        StringBuilder output = new StringBuilder();
        MoodPet pet = new MoodPet(output::append);
        pet.addObserver(output::append);

        pet.offerSnack();
        assert output.toString().contains("Yum!");
    }

    @Test
    public void testStateLooping() {
        MoodPet pet = new MoodPet(new ConsoleMediator());
        pet.addObserver(msg -> {});

        pet.neglect(); // Sad
        pet.offerSnack(); // Happy
        pet.neglect(); // Sad
        pet.startPlaySession(); // Happy

        assertEquals("Happy", pet.getCurrentMoodLabel());
    }

    @Test
    public void testSingletonName() {
        PetProfileManager manager = PetProfileManager.getInstance();
        assertEquals("Echo", manager.getPetName());
    }

    @Test
    public void testMultipleObserversReact() {
        StringBuilder log = new StringBuilder();
        MoodPet pet = new MoodPet(log::append);

        pet.addObserver(msg -> log.append("A:").append(msg));
        pet.addObserver(msg -> log.append("B:").append(msg));

        pet.neglect();
        String result = log.toString();
        assert result.contains("Sad");
        assert result.contains("A:");
        assert result.contains("B:");
    }
}