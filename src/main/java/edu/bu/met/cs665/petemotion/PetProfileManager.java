/**
 * Name: Wenli Gai
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/29/2025
 * File Name: PetProfileManager.java
 * Description:
 * Singleton class responsible for managing pet profile information.
 * Provides centralized access to pet metadata such as name.
 */

package edu.bu.met.cs665.petemotion;

/**
 * Singleton class managing pet profile metadata.
 */
public class PetProfileManager {
    private static PetProfileManager instance;
    private String petName;

    /**
     * Private constructor to prevent external instantiation.
     */
    private PetProfileManager() {
        this.petName = "Echo";
    }

    /**
     * Returns the singleton instance of PetProfileManager.
     * Thread-safe via synchronized keyword.
     * @return the single PetProfileManager instance
     */
    public static synchronized PetProfileManager getInstance() {
        if (instance == null) instance = new PetProfileManager();
        return instance;
    }

    /**
     * Retrieves the name of the pet.
     * @return pet name string
     */
    public String getPetName() {
        return petName;
    }
}
