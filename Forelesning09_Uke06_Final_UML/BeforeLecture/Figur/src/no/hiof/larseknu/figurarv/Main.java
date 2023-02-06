package no.hiof.larseknu.figurarv;


public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5);
        Sirkel sirkelen = new Sirkel(3);

        System.out.println(sirkelen.areal() + " " + sirkelen.omkrets());

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Hvilken er størst?************");
        // Bruker statisk metode fra klassen Figur, siden den er statisk trenger vi ikke en instans av klassen først
        if (Figur.erStorre(rektangelet, sirkelen)) {
            System.out.println(rektangelet + " er større enn " + sirkelen);
        }
        else {
            System.out.println(sirkelen + " er større enn " + rektangelet);
        }


        // Bruker den ikke-statiske metoden for å sammenligne to figurer, vi må da ha en instans av en figurklasse for å gjøre dette
        if (rektangelet.erStorre(sirkelen)) {
            System.out.println(rektangelet + " er større enn " + sirkelen);
        }
        else {
            System.out.println(sirkelen + " er større enn " + rektangelet);
        }
        
    }
}
