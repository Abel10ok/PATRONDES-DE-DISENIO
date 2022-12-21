package observer_03;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Observable {
    private String name;
    private Double amount;
    private String description;
    private List<Observer> observersList;

    public Auction(String name, Double amount, String description) {
        this.name = name;
        this.amount = amount;
        this.description = description;
        observersList = new ArrayList<Observer>();
    }

    public void addBid() {
        System.out.println("Bid added: " + name + " " + amount);
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public void addObserver(Observer o) {
        observersList.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.update(this, null);
        }
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observersList) {
            observer.update(this, arg);
        }
    }

}
