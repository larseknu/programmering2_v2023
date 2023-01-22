/**
* Representerer et kurs
*/
public class Kurs {
  // Instansvariabler
  private String navn;
  private String kode;
  private int studiePoeng;

  /**
  * Konstruktør for klassen Kurs
  * Gir mulighet for å gi instansvariablene navn, kode og studiePoeng en verdi
  */
  public Kurs(String navn, String kode, int studiePoeng) {
    this.navn = navn;
    this.kode = kode;
    this.studiePoeng = studiePoeng;
  }

  /**
  * Metode for å hente ut navnet til et kurs
  */
  public String getNavn() {
    return navn;
  }

  public String getKode() {
    return kode;
  }

  public int getStudiePoeng() {
    return studiePoeng;
  }

  /**
  *
  */
  public void setNavn(String navn) {
    this.navn = navn;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public void setStudiePoeng(int studiePoeng) {
    this.studiePoeng = studiePoeng;
  }
}
