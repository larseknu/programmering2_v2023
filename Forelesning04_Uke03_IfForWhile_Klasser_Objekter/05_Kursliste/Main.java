public class Main {

  public static void main(String[] args) {
    // Oppretter og instansierer et studentobjekt med navn "brandonLarned"
    Student albertEinstein = new Student("Albert", "Einstein", "523523");

    // Oppretter og instansierer to kursobjekter
    Kurs mobilProgrammering = new Kurs("Mobilprogrammering", "ITF1337", 10);
    Kurs kvanteFysikk = new Kurs("Kvantefysikk", "ITF9999", 20);

    // Legger et av kursene vi har laget til studentobjektet "albertEinstein"
    albertEinstein.leggTilKurs(mobilProgrammering);
    albertEinstein.leggTilKurs(kvanteFysikk);

    // Henter ut Albert sitt kursene
    Kurs[] kurseneEinsteinTar = albertEinstein.getKursListe();


    // Printer ut informasjon om Albert og kurset han kurset han kurset han tar
    System.out.println(albertEinstein.getFornavn() + " " + albertEinstein.getEtternavn() + " tar kursene:");

    for (int i = 0; i < kurseneEinsteinTar.length; i++) {
      if (kurseneEinsteinTar[i] != null)
        System.out.println(kurseneEinsteinTar[i].getNavn());
    }
  }

}
