import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dyreNavnArrayList = new ArrayList<>();
        dyreNavnArrayList.add("HonningGrevling(Nils)");
        dyreNavnArrayList.add("Panda(Trine)");
        dyreNavnArrayList.add("Sjimpanse(Arne)");
        dyreNavnArrayList.add("Katt(Misti)");
        dyreNavnArrayList.add("Hund(Dent)");

        System.out.println(dyreNavnArrayList);

        List<String> dyreNavnLinkedList = new LinkedList<String>();
        dyreNavnLinkedList.add("HonningGrevling(Nils)");
        dyreNavnLinkedList.add("Panda(Trine)");
        dyreNavnLinkedList.add("Sjimpanse(Arne)");
        dyreNavnLinkedList.add("Katt(Misti)");
        dyreNavnLinkedList.add("Hund(Dent)");

        System.out.println(dyreNavnLinkedList);

        ArrayList<Integer> tallArrayListe = new ArrayList<>();
        LinkedList<Integer> tallLinkedListe = new LinkedList<>();

        // Legger til 100000 elementer i slutten av en ArrayListe
        leggTilTallIListeOgTaTiden(tallArrayListe, 1000000, true);
        // Legger til 100000 elementer i slutten av en LinkedListe
        leggTilTallIListeOgTaTiden(tallLinkedListe, 1000000, true);

        // Legger til 100000 elementer i begynnelsen av en ArrayListe
        leggTilTallIListeOgTaTiden(new ArrayList<>(), 100000, false);
        // Legger til 100000 elementer i begynnelsen av en LinkedListe
        leggTilTallIListeOgTaTiden(new LinkedList<>(), 100000, false);

        // Legger til 1000 elementer i midten av en ArrayList med 100000 fra før
        leggTilTallIListeOgTaTiden(tallArrayListe, 1000, false);
        // Legger til 1000 elementer i midten av en LinkedList med 100000 fra før
        leggTilTallIListeOgTaTiden(tallLinkedListe, 1000, false);

        /*
        // KONKLUSJON: 	vi benytter ArrayList når vi i hovedsak legger til elementer mot slutten av listen
        // 				Vi benytter LinkedList når vi i hovedsak legger til elementer mot starten av listen
        // 				vi benytter LinkedList når vi legger til elementer både mot start og slutt
        //              vi benytter ArrayList når vi legger til elementer mot midten
        */
    }

    private static void leggTilTallIListeOgTaTiden(List<Integer> listeViSkalLeggeTilTallI, int antallTallViSkalLeggeTil, boolean leggeTilISluttenAvListen) {
        int posisjonViSkalLeggeTilElementerI = 0;

        if (listeViSkalLeggeTilTallI.size() > 0 )
            posisjonViSkalLeggeTilElementerI = listeViSkalLeggeTilTallI.size() / 2;

        // tar starttidspunktet
        long startTid = System.currentTimeMillis();

        // lager løkke som ittererer 100000 ganger
        for(int i = 1; i <= antallTallViSkalLeggeTil; i++) {
            // legger til i i listen
            if (leggeTilISluttenAvListen)
                listeViSkalLeggeTilTallI.add(i);
            else
                listeViSkalLeggeTilTallI.add(posisjonViSkalLeggeTilElementerI, i);
        }

        long sluttTid = System.currentTimeMillis();

        // Skriver ut tiden vi brukte
        System.out.println("Tiden det tok å legge til " + antallTallViSkalLeggeTil + " elementer i " +
                (leggeTilISluttenAvListen? "slutten": (posisjonViSkalLeggeTilElementerI==0?"begynnelsen":"midten")) +
                " av en "+ listeViSkalLeggeTilTallI.getClass().getSimpleName() +
                ": " + (sluttTid - startTid) + " ms");
    }
}