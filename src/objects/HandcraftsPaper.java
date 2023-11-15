package objects;

import interfaces.Junk;

import java.util.Objects;

public class HandcraftsPaper implements Junk {

    private final String material;

    public HandcraftsPaper(String material) {
        this.material = material;
    }

    public String spoil() {
        return "Поделки из бумаги медленно покрываются пылью";
    }

    @Override
    public String toString() {
        return desription + " из материала " + material + " грустно лежит на столе";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandcraftsPaper that = (HandcraftsPaper) o;
        return Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

}
