import java.util.ArrayList;

public class Person {

    enum Sex {MALE, FEMALE, UNKNOWN};
    private String name;
    private String middleName;
    private String lastName;
    private Sex sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings = new ArrayList<Person>();
    private ArrayList<Person> children = new ArrayList<Person>();
    private ArrayList<Pet> pets = new ArrayList<Pet>();


    public Person(String name, String lastName, int age, Sex sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, Sex sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addParents(Person father, Person mother) {
        this.father = father;
        this.mother = mother;
    }

    public void addSibling(Person sibling) {
        if (!siblings.contains(sibling)) {
            siblings.add(sibling);
        }
    }

    public void addChild(Person child) {
        if (!children.contains(child)) {
            children.add(child);
            child.setFather(this);
        }
    }

    public void addPet(Pet pet) {
        if (!pets.contains(pet)) {
            pets.add(pet);
            pet.setOwner(this);
        }
    }

    public ArrayList<Person> getGrandChildren() {

        ArrayList<Person> grandChildren = new ArrayList<>();
        for (Person child : children) {
            grandChildren.addAll(child.getChildren());
        }
        return grandChildren;
    }
}
