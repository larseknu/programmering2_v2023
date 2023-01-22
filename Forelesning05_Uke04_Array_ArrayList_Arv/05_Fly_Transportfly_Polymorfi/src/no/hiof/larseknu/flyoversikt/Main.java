package no.hiof.larseknu.flyoversikt;

public class Main {
    public static void main(String[] args) {
        // Oppretter og initialiserer et flyobjekt med 130 seter
        Fly boing747 = new Fly("Boing-747", 130);
        Fly sr71 = new Fly("SR-71", 2);
        Fly airbusA380 = new Fly("Aibus A380", 525);

        // Lager et transportfly med 15 seter og en makslast på 10000.0 kubikkmeter
        Transportfly an225 = new Transportfly("AN-225", 15, 10000);

        // Lager en Fly-array med plass til 5 flyobjekter
        Fly[] skvadron = new Fly[7];

        // Legger til 5 flyobjekter i arrayen
        skvadron[0] = boing747;
        skvadron[1] = sr71;
        skvadron[2] = airbusA380;
        skvadron[3] = an225;
        skvadron[4] = new Fly();
        skvadron[5] = new Transportfly();
        skvadron[6] = new Fly();

        // Itererer gjennom arrayen vi har med fly
        for (int i = 0; i < skvadron.length; i++) {
            // Henter ut en objektreferanse til et fly i lista
            Fly etFly = skvadron[i];

            // Printer ut informasjon om det flyet
            System.out.println("Arrayposisjon: " + i + " - " + etFly);
        }
    }
}