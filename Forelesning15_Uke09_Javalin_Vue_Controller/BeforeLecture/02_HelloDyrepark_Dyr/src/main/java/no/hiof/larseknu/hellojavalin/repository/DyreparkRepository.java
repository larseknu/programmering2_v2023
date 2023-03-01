package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.Dyrepark;

import java.util.ArrayList;

public interface DyreparkRepository {
    ArrayList<Dyr> getDyrIDyrepark(String dyreparkNavn);
}
