// ✅ Pet.java
package petCare.Pet;

public class Pet {
    private static int petCount = 1;
    private int petId;
    private String petName;
    private int age;
    private String species;       // e.g., Dog, Cat, Rabbit
    private String breed;         // e.g., Labrador, Persian
    private String gender;
    private String allergies;
    private String vaccinations;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Pet() {
        petId = petCount++;
    }

    public int getPetId() { return petId; }
    public String getPetName() { return petName; }
    public void setPetName(String petName) { this.petName = petName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAllergies() { return allergies; }
    public void setAllergies(String allergies) { this.allergies = allergies; }

    public String getVaccinations() { return vaccinations; }
    public void setVaccinations(String vaccinations) { this.vaccinations = vaccinations; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getOwnerEmail() { return ownerEmail; }
    public void setOwnerEmail(String ownerEmail) { this.ownerEmail = ownerEmail; }

    public String getOwnerPhone() { return ownerPhone; }
    public void setOwnerPhone(String ownerPhone) { this.ownerPhone = ownerPhone; }

    @Override
    public String toString() {
        return petName;
    }
}
