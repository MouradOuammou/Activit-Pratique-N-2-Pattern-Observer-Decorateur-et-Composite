package org.enset.PatternObserver;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> historique = new ArrayList<>();
    @Override
    public void update(int etat){
        System.out.println("=".repeat(10));
            historique.add(etat);
            double sum = 0;
            for (int e : historique) {
                sum += e;
            }
            double avg = sum / historique.size();
            System.out.println("Observer 2: New state " + etat + ", Average state: " + avg);
    }
}
