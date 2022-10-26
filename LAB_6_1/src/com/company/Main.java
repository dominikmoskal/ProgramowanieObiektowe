package com.company;

import java.security.Permission;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Punkt Pkt1 = new Punkt();
        Punkt Pkt2 = new Punkt(2.5, 3.43);
        Punkt Pkt3 = new Punkt(-21, 2);

        Pkt1.opis();
        Pkt1.przesun(2, 3);
        Pkt1.opis();
        Pkt2.opis();
        Pkt2.przesun(2, 3);
        Pkt2.opis();
        Pkt3.opis();
        Pkt3.przesun(2, 3);
        Pkt3.opis();

        Prostokat P1= new Prostokat(2.3,23.2);
        Trojkat T1= new Trojkat(4.54,14.23);
        Figura F1 = new Figura();
        System.out.println("Powierzchnia Prostokata P1 wynosi "+P1.getPowierzchnia());
        T1.wys=1;
        T1.podst=2.23;
        System.out.println("Trojkat o h="+T1.wys+" i podstawie rownej a="+T1.podst);
    }
}