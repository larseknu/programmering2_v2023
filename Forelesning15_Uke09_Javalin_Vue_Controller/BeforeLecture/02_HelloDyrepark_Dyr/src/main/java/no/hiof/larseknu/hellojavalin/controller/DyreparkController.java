package no.hiof.larseknu.hellojavalin.controller;

import io.javalin.http.Context;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.repository.DyreparkDataRepository;
import no.hiof.larseknu.hellojavalin.repository.DyreparkRepository;

import java.util.ArrayList;

public class DyreparkController {
    private DyreparkRepository dyreparkRepository;
    public DyreparkController(DyreparkDataRepository dyreparkRepository) {
        this.dyreparkRepository = dyreparkRepository;
    }

    public void getDyrIDyrepark(Context context) {
        String dyreparkNavn = context.pathParam("dyrepark-id");

        ArrayList<Dyr> dyrIDyrepark = dyreparkRepository.getDyrIDyrepark(dyreparkNavn);

        context.json(dyrIDyrepark);
    }
}
