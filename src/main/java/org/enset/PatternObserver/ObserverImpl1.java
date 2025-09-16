package org.enset.PatternObserver;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int etat) {
        System.out.println("*".repeat(10));
        System.out.println("Observer 1: Etat changed to " + etat);

    }
}
