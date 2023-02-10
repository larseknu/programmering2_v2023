package no.hiof.larseknu.formaterer;

public class LitenTekstFormaterer implements Formaterer {
    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        return tekstSomSkalFormateres.toLowerCase();
    }
}
