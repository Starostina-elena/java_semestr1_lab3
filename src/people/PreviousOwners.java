package people;

import abstractClasses.Person;

public class PreviousOwners extends Person {

    public PreviousOwners(String name, String action) {
        super(name, action);
    }

    public String packStuff() {
        return this.getName() + " пакует свои вещи и готовиться съезжать";
    }

    @Override
    public String toString() {
        return super.toString() + "!";
    }
}
