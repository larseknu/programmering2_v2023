package no.hiof.larseknu.hellojavalin;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import no.hiof.larseknu.hellojavalin.model.Dyr;
import no.hiof.larseknu.hellojavalin.model.Panda;
import no.hiof.larseknu.hellojavalin.model.Sjimpanse;
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

        JsonMapper jsonMapper = new JsonMapper();
        jsonMapper.registerModule(new JavaTimeModule());

        app.get("/", new VueComponent("hello-world"));

        app.get("/dyrepark/{dyrepark-id}", new VueComponent("dyrepark-detail"));

        
        ArrayList<Dyr> dyreListe =new ArrayList<>();
        dyreListe.add(new Sjimpanse("Julius", LocalDate.now(), 50));
        dyreListe.add(new Panda("Turid", LocalDate.now(), "Hvit"));
        // API
        app.get("api/dyrepark/{dyrepark-id}", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                ctx.json(dyreListe);
            }
        });
    }
}
