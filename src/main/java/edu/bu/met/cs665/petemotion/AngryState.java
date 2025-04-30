package edu.bu.met.cs665.petemotion;

class AngryState implements PetState {
    public void offerSnack(MoodPet pet) {
        pet.setState(new SadState());
    }
    public void startPlaySession(MoodPet pet) {
        pet.notifyObservers("Hmph. Still angry.");
    }
    public void neglect(MoodPet pet) {
        pet.notifyObservers("Grrrr! You’re ignoring me again?");
    }
    public String getMoodLabel() {
        return "Angry";
    }
}
