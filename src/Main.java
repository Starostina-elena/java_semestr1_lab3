import objects.*;
import people.*;

public class Main {

    public static void main(String[] args) {

        Hemyl hemyl = new Hemyl("Хемуль", "поет");
        System.out.println(hemyl);
        System.out.println(hemyl.fly());
        Homsa homsa = new Homsa("Хомса", "танцует", 10);
        System.out.println(homsa);
        System.out.println(homsa.eatCookies());
        System.out.println(homsa.addCookies(5));
        Misa misa = new Misa("Миса", "сеет хаос");
        System.out.println(misa);
        System.out.println(misa.sing());
        Mymla mymla = new Mymla("Мюмла", "подмигивает");
        System.out.println(mymla);
        System.out.println(mymla.grumble());
        PreviousOwners previousOwner = new PreviousOwners("Василий", "грустно вздыхает");
        System.out.println(previousOwner);
        System.out.println(previousOwner.packStuff());

        Door door1 = new Door("в Нарнию");
        System.out.println(door1);
        Door door2 = new Door("никуда");
        System.out.println(door2);

        Stairs stairs1 = new Stairs("вверх");
        System.out.println(stairs1);
        Stairs stairs2 = new Stairs("вниз");
        System.out.println(stairs2);

        Textile paper_trash = new Textile("ткань");
        System.out.println(paper_trash);
        System.out.println(paper_trash.spoil());
        Paper textile_trash = new Paper("бумага");
        System.out.println(textile_trash);
        System.out.println(textile_trash.spoil());
        Wood wooden_trash = new Wood("дерево");
        System.out.println(wooden_trash);
        System.out.println(wooden_trash.spoil());

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
