public class Main {

  public static void main(String[] args) {
    // Oppretter og instansierer et studentobjekt med navn "brandonLarned"
    Student albertEinstein = new Student("Albert", "Einstein", "523523");

    // Oppretter og instansierer to kursobjekter
    Kurs mobilProgrammering = new Kurs("Mobilprogrammering", "ITF1337", 10);
    Kurs kvanteFysikk = new Kurs("Kvantefysikk", "ITF9999", 20);

    // Legger et av kursene vi har laget til studentobjektet "albertEinstein"
    albertEinstein.setOppsattKurs(mobilProgrammering);

    // Henter ut Albert sitt kursene
    Kurs kursetEinsteinTar = albertEinstein.getOppsattKurs();


    // Printer ut informasjon om Albert og kurset han kurset han kurset han tar
    System.out.println(albertEinstein.getFornavn() + " " + albertEinstein.getEtternavn() + " tar kurset " + kursetEinsteinTar.getNavn());
    // Kunne også hentet ut navnet på kurset Albert tar ved å kalle metoden på Kurs-objektet som returneres fra getOppsattKurs() direkte
    System.out.println(albertEinstein.getOppsattKurs().getNavn());
  }

}
