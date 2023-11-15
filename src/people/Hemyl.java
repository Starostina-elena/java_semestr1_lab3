package people;

import abstractClasses.Person;

public class Hemyl extends Person {

    public Hemyl(String name, String action) {
        super(name, action);
    }

    public String fly() {
        return this.getName() + " расправляет крылья и взлетает";
    }

    @Override
    public String toString() {
        return super.toString() + "?";
    }
}
