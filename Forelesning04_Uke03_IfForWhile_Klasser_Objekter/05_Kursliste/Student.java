/**
* Representerer en student
*/
public class Student {
  // Instansvariabler
  private String fornavn;
  private String etternavn;
  private String studentId;
  private Kurs[] kursListe;
  /* String variablene kunne også vært deklarert slik:
  private String fornavn, etternavn, studentId; */

  /**
  * Konstruktør for klassen Student
  * Gir mulighet til å sette fornavn og etternavn
  */
  public Student(String fornavn, String etternavn, String studentId) {
    this(fornavn, etternavn, studentId, new Kurs[18]);
  }

  /**
  * Kunstruktør for klassen Student
  * Gir mulighet til å sette fornavn, etternavn, alder og studentId
  */
  public Student(String fornavn, String etternavn, String studentId, Kurs[] kursListe) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.studentId = studentId;
    this.kursListe = kursListe;
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

  public Kurs[] getKursListe() {
    return kursListe.clone();
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

  /**
  * Metode som legger til et nytt kurs for studenten
  * Går gjennom listen med kurs og legger det til på første "ledige" plass
  */
  public void leggTilKurs(Kurs nyttKurs) {
    // Går gjennom listen med kurs studenten har
    for (int i = 0; i < kursListe.length; i++) {
      // Sjekker om det nummeret vi er på i lista er tomt (null, inneholder ikke et kurs)
      if (kursListe[i] == null) {
        // Hvis tomt legger vi til et nytt kurs på det punktet i lista
        kursListe[i] = nyttKurs;
        // Avslutter løkka
        break;
      }
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
