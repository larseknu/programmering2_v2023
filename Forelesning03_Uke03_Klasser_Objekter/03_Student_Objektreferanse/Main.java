/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {
    // Oppretter og instansierer et objekt (student1) av klassen Student
    Student student1 = new Student("Andreas", "Hansen");
    // Oppretter et objekt (student2) og setter den til å referere på samme objekt som student1
    Student student2 = student1;

    // Setter en ny verdi til instansvariabelen etternavn for student1
    student1.setEtternavn("Johansen");

    // Skriver ut informasjon om student1
    System.out.println("Student1: " + student1.getFornavn() + " " + student1.getEtternavn());
    // Skriver ut infromasjon om student2 (vil den være det samme, eller forskjellig?)
    System.out.println("Student2: " + student2.getFornavn() + " " + student2.getEtternavn());
  }
}
