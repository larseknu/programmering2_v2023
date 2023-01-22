package no.hiof.larseknu.flyoversikt;

public class Main {

    public static void main(String[] args) {
        // Oppretter og initialiserer et flyobjekt med 130 seter
        Fly boing747 = new Fly("Boing-747", 130);

        // Legger til noen passasjerer
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();

        // Skriver ut antallet seter
        System.out.println("Det er " + boing747.getSeter() + " seter på vårt " + boing747.getModell());
        // Skriver ut antallet passasjerer
        System.out.println("Det er " + boing747.getPassasjerer() + " passasjerer på vårt " + boing747.getModell());



        // Lager et transportfly med 15 seter og en makslast på 10000.0 kubikkmeter
        Transportfly an225 = new Transportfly("AN-225", 15, 10000);

        // Legger til en pakke
        an225.leggTilEnPakke(5, 5, 5);

        // Skriver ut brukt last
        System.out.println("Brukt last på AN-225: " + an225.getBruktLast() + " kubikkmeter");

        // Vi kan kalle leggTilEnPassasjer-metoden, siden vi arver fra (extender) klassen Fly
        an225.leggTilEnPassasjer();
        an225.leggTilEnPassasjer();
        an225.leggTilEnPassasjer();
        an225.leggTilEnPassasjer();

        // Vi kan kalle getModell- og getPassasjer-metoden, siden vi arver fra (extender) klassen Fly
        System.out.println("Antall passasjerer på " + an225.getModell() + ": " + an225.getPassasjerer());
    }
}
