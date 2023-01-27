package no.hiof.larseknu.figurarv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5);
        Sirkel sirkelen = new Sirkel(17);
        Kvadrat kvadratet = new Kvadrat(2);


        System.out.println("\n*************Vanlig utskrift fra objekter************");
        System.out.println(rektangelet + "    Areal: "+ rektangelet.areal() + "     Omkrets: " + rektangelet.omkrets());
        System.out.println(sirkelen + "    Areal: "+ sirkelen.areal() + "     Omkrets: " + sirkelen.omkrets());
        System.out.println(kvadratet + "    Areal: "+ kvadratet.areal() + "     Omkrets: " + kvadratet.omkrets());


        System.out.println("\n*************Hvilken er størst?************");

    }

}
