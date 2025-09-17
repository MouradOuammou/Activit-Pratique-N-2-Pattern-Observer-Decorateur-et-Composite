package org.enset.PatternDecorateur.deco;

import org.enset.PatternDecorateur.produits.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
