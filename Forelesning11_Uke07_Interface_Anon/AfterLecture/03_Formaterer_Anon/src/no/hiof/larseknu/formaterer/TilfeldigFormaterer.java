package no.hiof.larseknu.formaterer;

import java.util.Random;

public class TilfeldigFormaterer implements Formaterer {
    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        StringBuilder stringBygger = new StringBuilder();
        Random tilfeldigTrueFalse = new Random();
        boolean gjorBokstavStor;

        for (char enChar : tekstSomSkalFormateres.toCharArray()) {
            gjorBokstavStor = tilfeldigTrueFalse.nextBoolean();

            if (gjorBokstavStor)
                stringBygger.append(Character.toUpperCase(enChar));
            else
                stringBygger.append(Character.toLowerCase(enChar));
        }

        return stringBygger.toString();
    }
}
