public class Main {

  public static void main(String[] args) {
    // Oppretter og instansierer to kursobjekter
    Kurs mobilProgrammering = new Kurs("Mobilprogrammering", "ITF1337", 10);
    Kurs kvanteFysikk = new Kurs("Kvantefysikk", "ITF9999", 20);

    // Skriver ut litt kursinformasjon
    System.out.println(mobilProgrammering.getNavn() + " har " + mobilProgrammering.getStudiePoeng() + " studiepoeng.");
    System.out.println(kvanteFysikk.getNavn() + " har emnekode: " + kvanteFysikk.getKode());
  }

}
