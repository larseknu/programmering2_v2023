package no.hiof.larseknu.hellojavalin.repository;

import no.hiof.larseknu.hellojavalin.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class DyreparkDataRepository implements DyreparkRepository{
    private ArrayList<Dyrepark> dyreparkListe = new ArrayList<>();

    public DyreparkDataRepository() {
        createData();
    }

    private void createData() {
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

        dyreparkListe.add(kristiansandDyrepark);
        dyreparkListe.add(boraasDjurpark);
    }

    @Override
    public ArrayList<Dyr> getDyrIDyrepark(String dyreparkNavn) {
        for (Dyrepark dyrepark : dyreparkListe) {
            if (dyrepark.getNavn().equals(dyreparkNavn))
                return dyrepark.getDyreListe();

        }
        return new ArrayList<>();
    }

    @Override
    public Dyr getDyr(String dyreparkNavn, int dyrId) {
        ArrayList<Dyr> dyrIDyrepark = getDyrIDyrepark(dyreparkNavn);

        for (Dyr etDyr : dyrIDyrepark) {
            if (etDyr.getId() == dyrId)
                return etDyr;
        }

        return null;
    }
}
