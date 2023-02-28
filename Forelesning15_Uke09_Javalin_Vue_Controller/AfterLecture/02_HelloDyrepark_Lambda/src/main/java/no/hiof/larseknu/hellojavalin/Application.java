package no.hiof.larseknu.hellojavalin;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import no.hiof.larseknu.hellojavalin.controller.DyreparkController;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.Panda;
import no.hiof.larseknu.hellojavalin.model.Sjimpanse;
import no.hiof.larseknu.hellojavalin.repository.DyreparkDataRepository;
import no.hiof.larseknu.hellojavalin.repository.DyreparkRepository;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;


public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueAppName = "app";
        }).start(8181);

        app.before("/", context -> context.redirect("/dyrepark/Kristiansand Dyrepark"));

        app.get("/dyrepark/{dyrepark-id}", new VueComponent("dyrepark-detail"));
        app.get("/dyrepark/{dyrepark-id}/dyr/{dyr-id}", new VueComponent("dyr-detail"));

        DyreparkRepository repository = new DyreparkDataRepository();
        DyreparkController dyreparkController = new DyreparkController(repository);


        // API
        app.get("api/dyrepark/{dyrepark-id}", ctx -> dyreparkController.getDyrIDyrepark(ctx));

        app.get("api/dyrepark/{dyrepark-id}/dyr/{dyr-id}", dyreparkController::getDyr);
    }
}
