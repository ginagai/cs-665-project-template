package edu.bu.met.cs665.petemotion;

public interface PetState {
    void feed(Pet pet);
    void play(Pet pet);
    void ignore(Pet pet);
    String getMood();
}
