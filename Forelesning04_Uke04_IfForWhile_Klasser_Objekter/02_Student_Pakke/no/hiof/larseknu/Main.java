// Pakkenavn for å indikere at dette er "vår" "Main"-klassen
// og kunne skille den fra andre som har valgt samme klassenavn
package no.hiof.larseknu;

// Lagt til en import av klassen Student, som ligger i pakken net.tomheine
// Det er da denne Student-klassen som bli benyttet,
// selv om vi har en i samme pakke som oss selv (no.hiof.larseknu)
import net.tomheine.Student;

/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {
    // Opprettet og instansierer et objekt (nikolaTesla) av klassen Student
    Student nikolaTesla = new Student("Nikola", "Tesla");
    // Oppretter og instansierer et objekt (thomasEdison) av klassen StudentId
    Student thomasEdison = new Student("Thomas", "Edison");

    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "nikolaTesla"
    nikolaTesla.printStudentInformasjon();
    // Bruker instansmetoden printStudentInformasjon fra studentobjektet "thomasEdison"
    thomasEdison.printStudentInformasjon();
  }
}
