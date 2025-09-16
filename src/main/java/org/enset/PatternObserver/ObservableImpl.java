package org.enset.PatternObserver;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int etat = 0;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.etat);
        }
    }

    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
        notifyObservers();
    }
}
