public class Pet {

    enum Species {CAT, DOG, BIRD, FISH, RABBIT, REPTILE, FERRET, HAMSTER};
    private String name;
    private int age;
    private Species species;
    private Person owner;

    public Pet(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}

