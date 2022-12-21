package observer_03;

public interface Observable {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
    public void notifyObservers(Object arg);
}
