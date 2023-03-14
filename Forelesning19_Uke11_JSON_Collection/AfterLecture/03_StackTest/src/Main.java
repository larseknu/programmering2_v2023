import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // vi har også andre typper collections enn lister
        // noen av disse kan være med på å yte kontroll

        // la oss se på stack - stabel
        // Om vi ønsker funksjonalitet hvor vi tar vare på elementer
        // i en stabel, slik at vi ikke kan hente/fjerne andre elementer
        // enn det siste vi la til. Dette kalles LIFO - Last In First Out

        Stack<String> dyreNavneStabel = new Stack<>();

        // her dytter vi elementer på toppen av stabelen med push();
        dyreNavneStabel.push("Sjimpanse(Arne)");
        dyreNavneStabel.push("Katt(Nala)");
        dyreNavneStabel.push("Hund(Dent)");
        dyreNavneStabel.push("Panda(Trine)");
        dyreNavneStabel.push("HonningGrevnling(Nils)");

        System.out.println(dyreNavneStabel);

        // det eneste elementet vi da kan hente er det siste -> HonningGrevnling(Nils)
        // til dette sier vi at vi popper av elementer på stacken

        // la oss hente HonningGrevnling(Nils) (tror han kom seg inn til slangene igjen...)
        System.out.println(dyreNavneStabel.pop());

        // la oss se hva som er igjen i stabelen etter at vi poppet HonningGrevnling(Nils) av stabelen
        System.out.println(dyreNavneStabel); // her ser vi da at han er fjernet

        // vi kan velge å se på elementet som ligger øverst uten at den fjernes ved å sniktitte på den
        System.out.println(dyreNavneStabel.peek());

        System.out.println(dyreNavneStabel); // vi ser da at Panda(Trine) ikke er fjernet
    }
}