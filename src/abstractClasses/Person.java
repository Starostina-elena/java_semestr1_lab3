package abstractClasses;

import java.util.Objects;

public abstract class Person {

    String person_action;
    String original_person_action;
    String name;
    boolean madness = false;

    public Person(String name, String action) {
        original_person_action = action;
        person_action = action;
        this.name = name;
    }

    public void behave_as_somebody_else(Person person) {
        person_action = person.person_action;
        madness = true;
    };

    public void calm_down() {
        person_action = original_person_action;
        madness = false;
    }

    @Override
    public String toString() {
        if (madness) {
            return name + " бесится и " + person_action;
        }
        return name + " " + person_action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return madness == person.madness && Objects.equals(person_action, person.person_action) && Objects.equals(original_person_action, person.original_person_action) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_action, original_person_action, name, madness);
    }

}
