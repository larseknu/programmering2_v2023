package no.hiof.larseknu.flyoversikt;

public class Main {

    public static void main(String[] args) {
        // Oppretter et objekt av typen Fly, initialiserer den som et Transportfly
        Fly c141a = new Transportfly("C-141A", 15, 155000);

        // Vi har da mulighet til å kalle alle metoder fra Fly-klassen
        c141a.leggTilEnPassasjer();

        // Vi har IKKE mulighet til å kalle metoder direkte fra Transportfly-klassen
        // c141a.leggTilEnPakke(4, 3, 4);

        // Dette er IKKE lov, da et objekt av typen Transportfly ikke har tilgang til "sine" metoder og instansvariabler
        // siden de aldri blir initialisert
        // Transportfly c17 = new Fly("C-17", 10);



        // Lager en Fly-array med plass til 5 flyobjekter
        Fly[] skvadron = new Fly[5];

        // Legger til 5 flyobjekter i arrayen
        skvadron[0] = new Fly();
        skvadron[1] = new Transportfly();
        skvadron[2] = new Transportfly();
        skvadron[3] = new Fly();
        skvadron[4] = new Transportfly();


        for (int i = 0; i < skvadron.length; i++) {
            Fly etFly = skvadron[i];

            System.out.println(etFly + " antall seter " + etFly.getSeter());
        }

    }
}
