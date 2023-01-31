package no.hiof.larseknu.flyoversikt;

public class Main {

    public static void main(String[] args) {
        Fly boeing747 = new Fly("Boieng-747", 130);

        // Legger til noen passasjerer
        boeing747.leggTilEnPassasjer();
        boeing747.leggTilEnPassasjer();
        boeing747.leggTilEnPassasjer();
        boeing747.leggTilEnPassasjer();
        boeing747.leggTilEnPassasjer();

        // Printer ut informasjon om flyet
        System.out.println(boeing747);

        // Printer ut informasjon om den klassevariabelen, legg merke til at vi gjør dette fra Fly, og ikke boing747 instansen.
        System.out.println("Det er totalt " + Fly.getTotaltAntallPassasjerer() + " passasjerer ombord i flyparken.");

        // Instansierer ett transportflyobjekt med 15 seter og en makslast på 180
        Transportfly an225 = new Transportfly("An-225", 15, 800);

        // Legger til noen passasjerer
        an225.leggTilEnPassasjer();
        an225.leggTilEnPassasjer();
        // Legger til en pakke
        an225.leggTilEnPakke(5, 5, 5);

        // Printer ut informasjon om flyet (toString()-metoden blir her implisitt kalt)
        System.out.println(an225);

        // Printer ut informasjon om den klassevariabelen, legg merke til at vi gjør dette fra Fly, og ikke boieng747 eller an225 instansene.
        System.out.println("Det er totalt " + Fly.getTotaltAntallPassasjerer() + " passasjerer ombord i flyparken.");
    }
}
