package Bog;
/*
Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
•	Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter,
* og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.
* */

import java.util.ArrayList;

public class Biblotek {
    Bog bog;
    public static ArrayList<Bog> bogliste = new ArrayList<Bog>();

    public static void main (String [] args){

        Bog bog1 = new Bog(282020031,"lort med lort på", 1999);
        Bog bog2 = new Bog(282670331,"hej med dig", 1845);
        Bog bog3 = new Bog(221283124,"pizza", 2017);
        Bog bog4 = new Bog(298349758,"børnbog", 2003);
        Bog bog5 = new Bog(282123235,"how to get away with murder", 1996);
        Bog bog6 = new Bog(282020031,"....", 1769);

        bogliste.add(bog1);
        bogliste.add(bog2);
        bogliste.add(bog3);
        bogliste.add(bog4);
        bogliste.add(bog5);
        bogliste.add(bog6);

        //System.out.println("Bog" + findISBN(bog));

    }

    public static Boolean findISBN(Bog bog){
        return bogliste.contains(bog);
    }
}
