import objects.Door;
import objects.Handcrafts;
import objects.Stairs;
import people.*;

public class Main {

    public static void main(String[] args) {

        Hemyl hemyl = new Hemyl("Хемуль", "поет");
        System.out.println(hemyl);
        Homsa homsa = new Homsa("Хомса", "танцует");
        System.out.println(homsa);
        Misa misa = new Misa("Миса", "сеет хаос");
        System.out.println(misa);
        Mymla mymla = new Mymla("Мюмла", "подмигивает");
        System.out.println(mymla);
        PreviousOwners previousOwner = new PreviousOwners("Василий", "грустно вздыхает");
        System.out.println(previousOwner);

        Door door1 = new Door("в Нарнию");
        System.out.println(door1);
        Door door2 = new Door("никуда");
        System.out.println(door2);

        Stairs stairs1 = new Stairs("вверх");
        System.out.println(stairs1);
        Stairs stairs2 = new Stairs("вниз");
        System.out.println(stairs2);

        Handcrafts paper_trash = new Handcrafts("бумага");
        System.out.println(paper_trash);
        Handcrafts textile_trash = new Handcrafts("ткань");
        System.out.println(textile_trash);
        Handcrafts wooden_trash = new Handcrafts("дерево");
        System.out.println(wooden_trash);

        misa.behave_as_somebody_else(homsa);
        System.out.println(misa);
        System.out.println(misa.equals(homsa));
        misa.calm_down();
        System.out.println(misa);
        System.out.println(misa.equals(homsa));

        System.out.println(door1.equals(door2));
        System.out.println(door1.equals(door1));
        System.out.println(door1.equals(stairs1));

        door2.changeDestination("в Саратов");
        System.out.println(door2);

        stairs1.changeDestination("в никуда");
        System.out.println(stairs1);

    }

}
