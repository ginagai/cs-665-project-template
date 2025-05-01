/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: ConsoleMediator.java
 * Description:
 * Implements a simple mediator that routes pet messages to the console.
 * Demonstrates the Mediator Pattern by decoupling message emission from delivery.
 */

package edu.bu.met.cs665.petemotion;


/**
 * Concrete mediator that relays messages to the console.
 */
public class ConsoleMediator implements PetMediator {

    /**
     * Prints the given message to the console, prefixed for clarity.
     * @param msg the message to display
     */
    @Override
    public void mediate(String msg) {
        System.out.println("[Mediator] " + msg);
    }
}