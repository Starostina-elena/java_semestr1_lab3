package objects;

import interfaces.Junk;

import java.util.Objects;

public class HandcraftsTextile implements Junk {

    private final String material;

    public HandcraftsTextile(String material) {
        this.material = material;
    }

    public String spoil() {
        return "Если ткань долго пролежит на мокром полу, она начнет гнить";
    }

    @Override
    public String toString() {
        return desription + " из материала " + material + " грустно лежит на полу";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandcraftsTextile that = (HandcraftsTextile) o;
        return Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }
}
