/**
* Klasse som representerer en student
*/
public class Student {
  // Instansvariabler (medlemsvariabler)
  public String fornavn;
  public String etternavn;
  public int alder;
  public String studentId;
  /* String variablene kunne også vært deklarert slik:
  public String fornavn, etternavn, studentId; */

  /**
  * Instansmetode som printer informasjon om data i klassen selv
  */
  public void printStudentInformasjon() {
    // Printer ut fornavn og etternavn til terminalen
    System.out.println(fornavn + " " + etternavn);
  }

}
