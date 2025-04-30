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



/**
 * Defines the interface for all pet emotional states.
 */
public interface PetState {
    void offerSnack(MoodPet pet);
    void startPlaySession(MoodPet pet);
    void neglect(MoodPet pet);
    String getMoodLabel();
}