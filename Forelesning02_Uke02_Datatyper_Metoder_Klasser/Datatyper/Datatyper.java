/**
* Datatyper inneholder eksempler på hvordan man oppretter
* forskjellige primitive datatyper i Java
*/
public class Datatyper {
  /**
  * Javaapplikasjonens startpunkt
  */
  public static void main(String[] args) {
      deklareringOgInitaliseringAvDatatyper();

      System.out.println("****TilordningsEksempel****");
      tilordningsEksempel();

      System.out.println("****OperatorEksempel****");
      operatorEksempel();
  }

  /**
   * Metode for deklarering og initialisering av variabler
   * Laget for å kunne strukturere koden vår litt mer oversiktlig
   */
   public static void deklareringOgInitaliseringAvDatatyper() {
       // Heltall
       byte alder = 23; // Deklarerer og initialiserer variabelen alder med datatypen byte
       short antallStudenter = 166; // Deklarerer og initialiserer variabelen antallStudenter med datatypen short
       int antallAnsatte; // Deklarerer variabel antallAnsatte med datatypen int
       antallAnsatte = 485; // Initialiserer variabelen antallAnsatte og gir den verdi 485
       long jordensOmkrets = 40075000L; // Deklarerer variabelen jordensOmkrets med datatypen long

       // Vi kan fritt legge sammen og behandle disse tallene om hverandre (bare pass på at datatypen det resulterer i er stor nok)
       long rarSammenSetningAvData = alder + antallStudenter + antallAnsatte + jordensOmkrets;

       // Skriver ut en streng med data til konsollen
       System.out.println("Et tall uten noen særlig mening?: " + rarSammenSetningAvData);

       // Desimaltall/flyttall
       float timeLonn = 203.5F;
       double antallTimer = 2358.5;

       // Annet
       char karakter = 'A';
       boolean obligerGodkjent = true;

       //  Deklarer og initialiserer variablene level og levelProgresjon med datatypen byte
       byte level = 2, levelProgresjon = 89;

       // Deklarerer og initialiserer variabelen setning med datatypen String
       String setning = "Try not. Do, or do not. There is no try.";
   }

   /**
   * Metode med eksempler på tilordning
   * Laget for å kunne strukturere koden vår litt mer oversiktlig
   */
   public static void tilordningsEksempel() {
      int x = 20;
      int y = 3;

      // Kopierer verdien fra y over i x
      x = y;
      // Printer ut verdiene til x og y
      System.out.println("x: " + x + " y: " + y);
      // Gir y en ny verdien
      y = 4;
      // Printer ut verdiene på nytt. Vil x være lik y nå?
      System.out.println("x: " + x + " y: " + y);

      int z = 5;
      z++; // Vil gjøre det samme som z = z + 1;

      //Vi ser litt nærmere på assignment operatøren ++
      System.out.println("z: " + z);
      System.out.println("++z: " + ++z); // z øker med 1 FØR den blir skrevet ut
      System.out.println("z++: " + z++); // z øker med 1 ETTER den blir skrevet ut
      System.out.println("z: " + z);

      // Hvis vi vil øke et tall med mer enn 1?
      z = z + 5;
      // En annen måte å skrive det samme på
      z += 5;
   }

   /**
   * Metode med eksempler på opertører
   * Laget for å kunne strukturere koden vår litt mer oversiktlig
   */
   public static void operatorEksempel() {
     int a = 7;
     int b = 2;
     int c = a / b; // Vanlig dividering

     System.out.println("a: " + a);
     System.out.println("b: " + b);
     System.out.println("a / b: " + c);
     int d = a % b; // Modulus gir oss "resten" (remainder)
     System.out.println("a % b: " + d);

     double desimalTall = 2.4;
     int avrundetTall = (int) (desimalTall + 0.5); // Typecaster en double til en int (desimaltall til heltall). Vil alltid runde inneholder

     int rest = 11 % 3; // Modulus - gir oss resten etter man har delt på nærmeste mulige Heltall
     System.out.println("11%3 - modulus: " + rest);
   }
}
