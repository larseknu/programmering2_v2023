package no.hiof.larseknu.figurarv;


public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5);
        Sirkel sirkelen = new Sirkel(3);

        System.out.println(sirkelen.areal() + " " + sirkelen.omkrets());

        System.out.println("\n*************Hvilken er størst?************");
        if ( erStorre(rektangelet, sirkelen) ) {
            System.out.println(rektangelet + " er større enn " + sirkelen);
        }
        else {
            System.out.println(sirkelen + " er er større enn " + rektangelet);
        }

    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }
}
