package interfaces;

public interface Location {

    void changeDestination(String new_destination);

    String toString();
    boolean equals(Object o);
    int hashCode();

}
