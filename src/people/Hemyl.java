package people;

import abstractClasses.Person;

public class Hemyl extends Person {

    public Hemyl(String name, String action) {
        super(name, action);
    }

    @Override
    public String toString() {
        return super.toString() + "?";
    }
}
