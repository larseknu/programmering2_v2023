/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {
    // Oppretter og instansierer et objekt (nikolaTesla) av klassen Student
    Student nikolaTesla = new Student();

    // Gir objektets instansvariabler verdier gjennom set-metodene
    nikolaTesla.setFornavn("Nikola");
    nikolaTesla.setEtternavn("Tesla");
    nikolaTesla.setAlder(86);
    nikolaTesla.setStudentId("963318");

    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "nikolaTesla"
    nikolaTesla.printStudentInformasjon();
  }
}
