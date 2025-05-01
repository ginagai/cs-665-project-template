/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: Main.java
 * Description:
 * Entry point to demonstrate the behavior of the MoodPet system.
 * Initializes a virtual pet and triggers emotional state changes.
 */
package edu.bu.met.cs665.petemotion;
/**
 * Entry point class to demonstrate pet emotional interactions.
 */
public class Main {
    public static void main(String[] args) {
        PetMediator mediator = new ConsoleMediator();
        MoodPet pet = new MoodPet(mediator);
        pet.addObserver(new ConsoleObserver());

        System.out.println("Pet initialized. Mood: " + pet.getCurrentMoodLabel());
        pet.neglect();  // Sad
        pet.neglect();  // Angry
        pet.offerSnack();  // Sad
        pet.startPlaySession();  // Happy

    }
}