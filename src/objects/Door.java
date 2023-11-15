package objects;


import interfaces.Location;

import java.util.Objects;

enum DoorDestination {

    SOMEWHERE("куда-то"),
    NOWHERE("никуда");

    private String destination;

    DoorDestination(String destination) {

        this.destination = destination;

    }

}

public class Door implements Location {

    private DoorDestination destination;

    public Door(String destination) {
        if (Objects.equals(destination, "никуда")) {
            this.destination = DoorDestination.NOWHERE;
        }
        else {
            this.destination = DoorDestination.SOMEWHERE;
        }
    }

    public void changeDestination(String new_destination) {
        if (Objects.equals(new_destination, "никуда")) {
            this.destination = DoorDestination.NOWHERE;
        }
        else {
            this.destination = DoorDestination.SOMEWHERE;
        }
    }

    @Override
    public String toString() {
        if (destination == DoorDestination.SOMEWHERE) {
            return "Все в порядке, дверь ведет куда-то, Хомса может быть спокоен";
        }
        return "О нет, дверь ведет в никуда";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return destination == door.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }

}
