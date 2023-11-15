package objects;

import interfaces.Junk;

import java.util.Objects;

public class HandcraftsWood implements Junk {

    private final String material;

    public HandcraftsWood(String material) {
        this.material = material;
    }

    public String spoil() {
        return "Если дерево не покрыть лаком, через какое-то время оно рассохнется";
    }

    @Override
    public String toString() {
        return desription + " из материала " + material + " грустно лежит на полке";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandcraftsWood that = (HandcraftsWood) o;
        return Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

}
