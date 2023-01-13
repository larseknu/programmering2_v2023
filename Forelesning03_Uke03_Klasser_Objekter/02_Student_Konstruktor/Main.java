/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {
    // Oppretter og instansierer et objekt (nikolaTesla) av klassen Student
    Student nikolaTesla = new Student("Nikola", "Tesla", 86, "963318");

    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "nikolaTesla"
    nikolaTesla.printStudentInformasjon();
    // Skriver ut ekstra informasjon om nikolaTesla
    System.out.println(nikolaTesla.getAlder() + " år med studentId: " + nikolaTesla.getStudentId());


    // Oppretter og instansierer et objekt (student1) av klassen student
    Student student1 = new Student("Thomas", "Edison");

    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "student1"
    student1.printStudentInformasjon();
    // Skriver ut ekstra informasjon om student1 (hva vil skrives ut her?)
    System.out.println(student1.getAlder() + " år med studentId: " + student1.getStudentId());
  }
}
