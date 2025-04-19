package petCare.Pet;

import java.util.ArrayList;

public class PetDirectory {
    private ArrayList<Pet> petList;

    public PetDirectory() {
        this.petList = new ArrayList<>();
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public Pet addNewPet() {
        Pet pet = new Pet();
        petList.add(pet);
        return pet;
    }

    public void removePet(Pet pet) {
        petList.remove(pet);
    }
}
