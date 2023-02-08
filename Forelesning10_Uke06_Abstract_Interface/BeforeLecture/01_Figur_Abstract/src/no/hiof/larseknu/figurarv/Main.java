package no.hiof.larseknu.figurarv;


public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5);
        Sirkel sirkelen = new Sirkel(3);

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Data i meter************");
        System.out.printf("%s sitt areal: %.2f og omkrets: %.2f%n", rektangelet, rektangelet.areal(), rektangelet.omkrets());
        System.out.printf("%s sitt areal i kvadratmeter: %.4f og omkrets i meter: %.2f%n", rektangelet, rektangelet.arealIMeter(), rektangelet.omkretsIMeter());
    }
}
