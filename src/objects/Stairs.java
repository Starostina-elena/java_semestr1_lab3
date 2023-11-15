package objects;


import interfaces.DestinationChangeable;

import java.util.Objects;


public class Stairs implements DestinationChangeable {

    private DestinationEnum destination;

    public Stairs(String destination) {
        if (Objects.equals(destination, "вверх")) {
            this.destination = DestinationEnum.UP;
        }
        else {
            this.destination = DestinationEnum.DOWN;
        }
    }

    public void changeDestination(String new_destination) {
        if (Objects.equals(new_destination, "вверх")) {
            this.destination = DestinationEnum.UP;
        }
        else {
            this.destination = DestinationEnum.DOWN;
        }
    }

    @Override
    public String toString() {
        if (destination == DestinationEnum.UP) {
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
