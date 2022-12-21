package observer_04;

import observer_03.Observer;

import java.util.ArrayList;
import java.util.List;

public class CentralItinerarios implements  Observable{
    private List<Vuelos> vuelosList;
    private List<Portal> portalList;

    public CentralItinerarios(){
        this.vuelosList = new ArrayList<>();
        this.portalList = new ArrayList<>();
    }

    public void addVuelos(Vuelos o){
        vuelosList.add(o);
        notifyObservers(o);
    }

    @Override
    public void addObserver(Portal o) {
        portalList.add(o);
    }

    @Override
    public void deleteObserver(Portal o) {
        portalList.remove(o);
    }

    @Override
    public void notifyObservers(Vuelos vuelos) {
            for (Portal portal : portalList) {
                portal.update(vuelos);
            }
    }
}
