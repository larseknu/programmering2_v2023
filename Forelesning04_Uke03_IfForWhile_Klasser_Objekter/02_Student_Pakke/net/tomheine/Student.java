package net.tomheine;

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
  * Konstruktør for klassen Student
  * Gir mulighet til å sette fornavn og etternavn
  * Tom-Heine har "hacket systemet vårt og byttet ut java-filen
  * Alle studenter vil bli hetende Tom-Heine Nätt
  */
  public Student(String fornavn, String etternavn) {
    this.fornavn = "Tom Heine";
    this.etternavn = "Nätt";
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
  * Metode for å hente sette en students studentId
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
