/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: PetMediator.java
 * Description:
 * Defines an interface for message dispatching in the pet emotion system.
 * Enables decoupling of state transitions and message display using the Mediator pattern.
 */
package edu.bu.met.cs665.petemotion;

/**
 * Mediator interface for message broadcasting.
 */
public interface PetMediator {
    /**
     * Handles broadcasting or relaying of pet messages.
     *
     * @param msg the message generated from pet behavior
     */
    void mediate(String msg);

}

