package people;

import abstractClasses.Person;

public class Mymla extends Person {

    public Mymla(String name, String action) {
        super(name, action);
    }

    @Override
    public String toString() {
        return super.toString() + ", одним словом, обычный вторник";
    }
}
