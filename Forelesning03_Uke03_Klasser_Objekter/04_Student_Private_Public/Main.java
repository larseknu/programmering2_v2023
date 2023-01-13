/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {
    // Opprettet og instansierer et objekt (nikolaTesla) av klassen Student
    Student nikolaTesla = new Student("Nikola", "Tesla", "0101200133733");

    // Setter verdier på objektets resterende "instansvariabler"
    nikolaTesla.setAlder(86);
    // Setter studentId til å være under 6 tegn, skal da få en "feilmelding"
    nikolaTesla.setStudentId("96383");
    // Setter studentId til å være "korrekt" med 6 tegn
    nikolaTesla.setStudentId("963853");

    // Skille for å lettere få oversikt over utskrift i kommandolinja
    System.out.println("**************");

    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "nikolaTesla"
    nikolaTesla.printStudentInformasjon();
    System.out.println(nikolaTesla.getAlder() + " år gammel, med studentid: " + nikolaTesla.getStudentId());
  }
}
