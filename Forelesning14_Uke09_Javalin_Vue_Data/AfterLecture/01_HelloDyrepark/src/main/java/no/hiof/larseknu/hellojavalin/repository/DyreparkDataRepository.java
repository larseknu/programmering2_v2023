package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class DyreparkDataRepository implements DyreparkRepository {
    public ArrayList<Dyrepark> dyreParker = new ArrayList<>();

    public DyreparkDataRepository() {
        Dyrepark kristiansandDyrepark = new Dyrepark("Kristiansand Dyrepark");

        HonningGrevling honningGrevlingenNils = new HonningGrevling("Nils", LocalDate.of(2013, 3, 2));
        Sjimpanse sjimpansenArne = new Sjimpanse("Arne", LocalDate.of(2017, 3, 17), 60);
        Sjimpanse sjimpansenJulius = new Sjimpanse("Julius", LocalDate.of(2017, 3, 17), 90);
        Panda pandaenTrine = new Panda("Trine", LocalDate.of(2014, 4, 13), "Hvit");

        kristiansandDyrepark.leggTilDyrIDyrepark(sjimpansenArne);
        kristiansandDyrepark.leggTilDyrIDyrepark(sjimpansenJulius);
        kristiansandDyrepark.leggTilDyrIDyrepark(pandaenTrine);
        kristiansandDyrepark.leggTilDyrIDyrepark(honningGrevlingenNils);

        Dyrepark boraasDjurpark = new Dyrepark("Boraas Djurpark");

        boraasDjurpark.leggTilDyrIDyrepark(new HonningGrevling("Lille Nils", LocalDate.of(2020, 1, 1)));
        boraasDjurpark.leggTilDyrIDyrepark(new Sjimpanse("Stian", LocalDate.of(2019, 2, 3), 80));
        boraasDjurpark.leggTilDyrIDyrepark(new Panda("Anna", LocalDate.of(2018, 3, 2), "Gult"));

        dyreParker.add(kristiansandDyrepark);
        dyreParker.add(boraasDjurpark);
    }

    public ArrayList<Dyr> getAlleDyrIDyrepark(String parkNavn) {
        Dyrepark aktuellDyrepark = getDyrepark(parkNavn);

        if (aktuellDyrepark != null)
            return aktuellDyrepark.getDyreListe();

        return new ArrayList<>();
    }

    public Dyr getDyr(String parkNavn, String dyreNavn) {
        Dyrepark aktuellDyrepark = getDyrepark(parkNavn);

        if (aktuellDyrepark != null) {
            for (Dyr etDyr : aktuellDyrepark.getDyreListe()) {
                if (etDyr.getNavn().equals(parkNavn))
                    return etDyr;
            }
        }

        return null;
    }

    public Dyr getDyr(String parkNavn, int dyreId) {
        Dyrepark aktuellDyrepark = getDyrepark(parkNavn);

        if (aktuellDyrepark != null) {
            for (Dyr etDyr : aktuellDyrepark.getDyreListe()) {
                if (etDyr.getId() == dyreId)
                    return etDyr;
            }
        }

        return null;
    }

    public Dyrepark getDyrepark(String parkNavn) {
        for (Dyrepark dyrepark : dyreParker) {
            if (dyrepark.getNavn().equals(parkNavn))
                return dyrepark;
        }

        return null;
    }
}