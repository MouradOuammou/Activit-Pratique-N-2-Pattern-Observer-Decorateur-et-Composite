package org.enset;

import org.enset.PatternObserver.ObservableImpl;
import org.enset.PatternObserver.ObserverImpl1;
import org.enset.PatternObserver.ObserverImpl2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.subscribe(new ObserverImpl1());
        observable.subscribe(new ObserverImpl2());
        for (int i = 0; i < 5; i++) {
            observable.setEtat(i);
        }
    }
}