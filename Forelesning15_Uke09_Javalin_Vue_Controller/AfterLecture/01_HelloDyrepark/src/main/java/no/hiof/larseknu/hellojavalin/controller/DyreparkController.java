package no.hiof.larseknu.hellojavalin.controller;

import io.javalin.http.Context;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.repository.DyreparkRepository;

public class DyreparkController {
    private DyreparkRepository dyreparkRepository;

    public DyreparkController(DyreparkRepository dyreparkRepository) {
        this.dyreparkRepository = dyreparkRepository;
    }

    public void getDyrIDyrepark(Context ctx) {
        String dyreparkNavn = ctx.pathParam("dyrepark-id");

        ctx.json(dyreparkRepository.getDyrIDyrepark(dyreparkNavn));
    }

    public void getDyr(Context ctx) {
        String dyreparkNavn = ctx.pathParam("dyrepark-id");
        String dyrId = ctx.pathParam("dyr-id");

        Dyr dyr = dyreparkRepository.getDyr(dyreparkNavn, Integer.parseInt(dyrId));

        ctx.json(dyr);
    }
}
