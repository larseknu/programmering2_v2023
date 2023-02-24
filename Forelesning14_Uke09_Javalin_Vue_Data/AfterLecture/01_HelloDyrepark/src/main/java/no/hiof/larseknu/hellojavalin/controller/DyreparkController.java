package no.hiof.larseknu.hellojavalin.controller;

import io.javalin.http.Context;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.repository.DyreparkRepository;

import java.util.ArrayList;

public class DyreparkController {
    private DyreparkRepository dyreparkRepository;

    public DyreparkController(DyreparkRepository dyreparkRepository) {
        this.dyreparkRepository = dyreparkRepository;
    }

    public void getAlleDyr(Context context) {
        String parkId = context.pathParam("{dyrepark-id}");

        ArrayList<Dyr> alleDyrIParken = dyreparkRepository.getAlleDyrIDyrepark(parkId);

        context.json(alleDyrIParken);
    }
}
