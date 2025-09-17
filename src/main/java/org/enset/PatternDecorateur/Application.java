package org.enset.PatternDecorateur;

import org.enset.PatternDecorateur.deco.*;
import org.enset.PatternDecorateur.produits.*;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class Application {
    public static void main(String[] args) throws IOException {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("---------------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("--------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("--------------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("*************");

        Boisson b = new Vanille(new Chocolat(new Noisette(new Chocolat(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
