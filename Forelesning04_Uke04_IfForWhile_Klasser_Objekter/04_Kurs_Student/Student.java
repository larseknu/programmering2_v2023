/**
* Representerer en student
*/
public class Student {
  // Instansvariabler
  private String fornavn;
  private String etternavn;
  private String studentId;
  private Kurs oppsattKurs;
  /* String variablene kunne også vært deklarert slik:
  private String fornavn, etternavn, studentId; */

  /**
  * Konstruktør for klassen Student
  * Gir mulighet til å sette fornavn og etternavn
  */
  public Student(String fornavn, String etternavn, String studentId) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.studentId = studentId;
  }

  /**
  * Kunstruktør for klassen Student
  * Gir mulighet til å sette fornavn, etternavn, alder og studentId
  */
  public Student(String fornavn, String etternavn, String studentId, Kurs oppsattKurs) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.studentId = studentId;
    this.oppsattKurs = oppsattKurs;
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

  public String getStudentId() {
    return studentId;
  }

  public Kurs getOppsattKurs() {
    return oppsattKurs;
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

  public void setOppsattKurs(Kurs oppsattKurs) {
    this.oppsattKurs = oppsattKurs;
  }

  /**
  * Instansmetode som printer informasjon om data i klassen selv
  */
  public void printStudentInformasjon() {
    // Printer ut fornavn og etternavn til terminalen
    System.out.println(fornavn + " " + etternavn);
  }

}
