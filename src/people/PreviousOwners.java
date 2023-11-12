package people;

import abstractClasses.Person;

public class PreviousOwners extends Person {

    public PreviousOwners(String name, String action) {
        super(name, action);
    }

    @Override
    public String toString() {
        return super.toString() + "!";
    }
}
