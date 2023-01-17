// Pakkenavn for å indikere at dette er "vår" "Student"-klassen
// og kunne skille den fra andre som har valgt samme klassenavn
package no.hiof.larseknu;

/**
* Representerer en student
*/
public class Student {
  // Instansvariabler
  private String fornavn;
  private String etternavn;
  private int alder;
  private String studentId;
  /* String variablene kunne også vært deklarert slik:
  private String fornavn, etternavn, studentId; */

  /**
  * Tom konstruktør for klassen Student
  */
  public Student() {
  }

  /**
  * Konstruktør for klassen Student
  * Gir mulighet til å sette fornavn og etternavn
  */
  public Student(String fornavn, String etternavn) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
  }

  /**
  * Kunstruktør for klassen Student
  * Gir mulighet til å sette fornavn, etternavn, alder og studentId
  */
  public Student(String fornavn, String etternavn, int alder, String studentId) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.alder = alder;
    this.studentId = studentId;
  }

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
  * studentId må ha en lengde på 6 tegn.
  */
  public void setStudentId(String studentId) {
    if (studentId.length() == 6) {
      System.out.println("StudentId: " + studentId);
      this.studentId = studentId;
    }
    else {
      System.out.println("ERROR: StudentId må inneholde nøyaktig 6 tegn");
    }
  }

  /**
  * Instansmetode som printer informasjon om data i klassen selv
  */
  public void printStudentInformasjon() {
    // Printer ut fornavn og etternavn til terminalen
    System.out.println(fornavn + " " + etternavn);
  }

}
