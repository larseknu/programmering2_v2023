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
  private String fodselsNummer;
  /* String instansvariablene kunne også vært deklarert slik:
  private String fornavn, etternavn, studentId; */

  /**
  * Tom konstruktør for klassen Student
  */
  public Student() {
  }

  /**
  * Konstruktør for klassen student
  * Gir mulighet til å sette fornavn, etternavn og fodselsnummer
  */
  public Student(String fornavn, String etternavn, String fodselsNummer) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.fodselsNummer = fodselsNummer;
  }

  /**
  * Kunstruktør for klassen Student
  * Gir mulighet til å sette fornavn, etternavn, fodselsnummer, alder og studentId
  */
  public Student(String fornavn, String etternavn, String fodselsNummer, int alder, String studentId) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.fodselsNummer = fodselsNummer;
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

  /**
  * Metode for å hente ut en students fodselsnummer
  * Vi har ingen set-metode for fodselsnummer, så verdien kan ikke endres i ettertid utenfor klassen
  */
  public String getFodselsnummer() {
    return fodselsNummer;
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
