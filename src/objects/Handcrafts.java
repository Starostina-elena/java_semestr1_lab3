package objects;

import interfaces.Junk;

import java.util.Objects;

public class Handcrafts implements Junk {

    private String material;

    public Handcrafts(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return desription + " из материала " + material + " грустно лежит на полу";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Handcrafts that = (Handcrafts) o;
        return Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }
}
