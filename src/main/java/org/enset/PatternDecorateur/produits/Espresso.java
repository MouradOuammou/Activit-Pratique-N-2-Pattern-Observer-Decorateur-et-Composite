package org.enset.PatternDecorateur.produits;

public class Espresso extends  Boisson {
    public Espresso() {
        description = "ESPRESSO Coffee";
    }

    @Override
    public double cout() {
        return 5.99;
    }

}
