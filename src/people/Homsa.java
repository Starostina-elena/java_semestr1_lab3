package people;

import abstractClasses.Person;

public class Homsa extends Person {

    public Homsa(String name, String action) {
        super(name, action);
    }

    @Override
    public String toString() {
        return super.toString() + ", должно быть, это очень выматывает";
    }
}
