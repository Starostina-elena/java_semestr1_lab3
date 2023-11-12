package objects;


import interfaces.Location;

import java.util.Objects;

enum StairsDestination {

    UP("вверх"),
    DOWN("вниз");

    private String destination;

    StairsDestination(String destination) {

        this.destination = destination;

    }

}


public class Stairs implements Location {

    StairsDestination destination;

    public Stairs(String destination) {
        if (Objects.equals(destination, "вверх")) {
            this.destination = StairsDestination.UP;
        }
        else {
            this.destination = StairsDestination.DOWN;
        }
    }

    public void changeDestination(String new_destination) {
        if (Objects.equals(new_destination, "вверх")) {
            this.destination = StairsDestination.UP;
        }
        else {
            this.destination = StairsDestination.DOWN;
        }
    }

    @Override
    public String toString() {
        if (destination == StairsDestination.UP) {
            return "Лестница поднимается наверх, нет причин волноваться";
        }
        return "Хомса недоволен, лестница идет вниз. " +
                "Но это так странно, ведь всякая лестница одновременно поднимается вверх и спускается вниз?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stairs stairs = (Stairs) o;
        return destination == stairs.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }

}
