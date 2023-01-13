
/**
* Klasse som representerer en student
*/
public class Student {
  // Deklarerer instansvariabler (også kalt medlemsvariabler)
  // Disse er nå private og må da aksesseres med get- og set-metoder
  private String fornavn;
  private String etternavn;
  private int alder;
  private String studentId;
  /* String instansvariablene kunne også vært deklarert slik:
  private String fornavn, etternavn, studentId; */

  /**
  * Metode for å hente ut en students fornavn
  */
  public String getFornavn() {
    return fornavn;
  }

  public String getEtternavn() {
    return etternavn;
  }

  public int getAlder() {
    return alder;
  }

  public String getStudentId() {
    return studentId;
  }

  /**
  * Metode for å hente sette en students fornavn
  */
  public void setFornavn(String fornavn) {
    this.fornavn = fornavn;
  }

  public void setEtternavn(String etternavn) {
    this.etternavn = etternavn;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  /**
  * Metode for å hente sette en students studentId.
  */
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  /**
  * Instansmetode som printer informasjon om data i klassen selv
  */
  public void printStudentInformasjon() {
    // Printer ut fornavn og etternavn til terminalen
    System.out.println(fornavn + " " + etternavn);
  }

}
