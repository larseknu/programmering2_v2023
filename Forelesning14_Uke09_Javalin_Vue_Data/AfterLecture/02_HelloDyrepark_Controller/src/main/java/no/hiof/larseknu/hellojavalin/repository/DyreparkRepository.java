package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.Dyrepark;

import java.util.ArrayList;

public interface DyreparkRepository {
    ArrayList<Dyr> getAlleDyrIDyrepark(String parkNavn);
    Dyr getDyr(String parkNavn, String dyreNavn);
    Dyr getDyr(String parkNavn, int dyreId);
    Dyrepark getDyrepark(String parkNavn);
}
