import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addParents() {
        Person pa = new Person("Henk", "Smid", 28, Person.Sex.MALE);
        Person ma = new Person("Annie","Smid", 26, Person.Sex.FEMALE);
        Person kind = new Person("Jan", "Smid", 3, Person.Sex.MALE);

        kind.addParents(pa, ma);

        assertEquals(pa, kind.getFather());
        assertEquals(ma, kind.getMother());
    }

    @Test
    void addSibling() {
        Person kind = new Person("Jan", "Smid", 3, Person.Sex.MALE);
        Person zus = new Person("Petra", "Smid", 4, Person.Sex.FEMALE);
        Person broer = new Person("Piet", "Smid", 6, Person.Sex.MALE);

        kind.addSibling(zus);
        kind.addSibling(broer);

        ArrayList<Person> siblings = kind.getSiblings();
        assertEquals(zus, siblings.get(0));
        assertEquals(broer, siblings.get(1));
    }

    @Test
    void addChild() {
        Person pa = new Person("Henk", "Smid", 28, Person.Sex.MALE);
        Person kind1 = new Person("Jan", "Smid", 3, Person.Sex.MALE);
        Person kind2 = new Person("Petra", "Smid", 4, Person.Sex.FEMALE);

        pa.addChild(kind1);
        pa.addChild(kind2);

        assertEquals(kind1, pa.getChildren().get(0));
        assertEquals(kind2, pa.getChildren().get(1));
        assertEquals(pa, kind1.getFather());
        assertEquals(pa, kind2.getFather());
    }

    @Test
    void addPet() {
        Person ma = new Person("Annie","Smid", 26, Person.Sex.FEMALE);
        Pet hond = new Pet("Woef", 5, Pet.Species.DOG);
        Pet cat = new Pet("Poes", 3, Pet.Species.CAT);

        ma.addPet(hond);
        ma.addPet(cat);

        assertEquals(hond, ma.getPets().get(0));
        assertEquals(cat, ma.getPets().get(1));


    }

    @Test
    void getGrandChildren() {
        Person opa = new Person("Hilbrand", "Smid", 60, Person.Sex.MALE);
        Person kind1 = new Person("Henk", "Smid", 28, Person.Sex.MALE);
        Person kleinkind1 = new Person("Jan", "Smid", 3, Person.Sex.MALE);
        Person kleinkind2 = new Person("Petra", "Smid", 4, Person.Sex.FEMALE);
        Person kind2 = new Person("Joke","Jansen", 26, Person.Sex.FEMALE);
        Person kleinkind3 = new Person("Otto", "Jansen", 3, Person.Sex.MALE);

        kind1.addChild(kleinkind1);
        kind1.addChild(kleinkind2);
        kind2.addChild(kleinkind3);
        opa.addChild(kind1);
        opa.addChild(kind2);

        assertEquals(kleinkind1, opa.getGrandChildren().get(0));
        assertEquals(kleinkind2, opa.getGrandChildren().get(1));
        assertEquals(kleinkind3, opa.getGrandChildren().get(2));
    }
}