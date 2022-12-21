package observer_04;

import observer_03.Observer;

public interface Observable {
    public void addObserver(Portal o);
    public void deleteObserver(Portal o);
    public void notifyObservers(Vuelos vuelo);
}
