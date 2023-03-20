import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Vi har også andre typer collections enn lister

        // La oss se på queue - kø
        // Om vi ønsker funksjonalitet hvor vi tar vare på elementer
        // i en kø, slik at vi ikke kan hente/fjerne andre elementer
        // enn det første vi la til. Dette kalles FIFO - First In First Out

        // denne implementasjonen av en kø sier hva maks lengde skal være på køen
        ArrayBlockingQueue<String> dyreNavneKo = new ArrayBlockingQueue<>(5);

        // her legger vi til elementer i køen
        dyreNavneKo.offer("Sjimpanse(Arne)");
        dyreNavneKo.offer("Katt(Misti)");
        dyreNavneKo.offer("Hund(Dent)");
        dyreNavneKo.offer("Panda(Trine)");
        dyreNavneKo.offer("HonningGrevnling(Nils)");
        dyreNavneKo.offer("Vaskebjørn(Bjørn)"); // Vil ikke bli lagt til, køen er full. Returnerer false
        //dyreNavneKo.add("Vaskebjørn(Bjørn)"); // Vil ikke bli lagt til, køen er full. Kaster exception


        System.out.println(dyreNavneKo);

        // det eneste elementet vi da kan hente er det første -> Arne
        // til dette sier vi at vi poller elementer fra køen

        // la oss hente "Arne"
        System.out.println(dyreNavneKo.poll());

        // la oss se hva som er igjen i køen etter at vi hentet Arne
        System.out.println(dyreNavneKo); // her ser vi da at han er fjernet

        // vi kan velge å se på elementet som ligger først uten at den fjernes ved å sniktitte på den
        System.out.println(dyreNavneKo.peek());

        System.out.println(dyreNavneKo); // vi ser da at Trine ikke er fjernet
    }
}