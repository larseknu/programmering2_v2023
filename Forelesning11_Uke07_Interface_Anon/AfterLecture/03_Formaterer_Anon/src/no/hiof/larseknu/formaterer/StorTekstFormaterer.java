package no.hiof.larseknu.formaterer;

public class StorTekstFormaterer implements Formaterer {
    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        return tekstSomSkalFormateres.toUpperCase();
    }
}
