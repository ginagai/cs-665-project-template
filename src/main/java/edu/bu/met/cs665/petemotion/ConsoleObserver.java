/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: ConsoleObserver.java
 * Description:
 * Observes pet behavior and prints updates to the console.
 * Implements the Observer Pattern for state change notifications.
 */

package edu.bu.met.cs665.petemotion;

/**
 * Concrete observer that prints updates to the console.
 */
public class ConsoleObserver implements PetObserver {

    /**
     * Displays the received update message.
     * @param update the notification message from the pet
     */
    @Override
    public void reactTo(String update) {
        System.out.println("[Observer] " + update);
    }
}