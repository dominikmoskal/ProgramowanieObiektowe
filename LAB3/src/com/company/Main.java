package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Zadanie_1();
        Zadanie_2();
        Zadanie_3();
        Zadanie_4();
        System.out.println(Zadanie_5("ala"));
        System.out.println(Zadanie_5("kajak"));
        System.out.println(Zadanie_5("mama"));
        System.out.println(Zadanie_5("laptop"));
        System.out.println(Zadanie_5("kot"));
    }
    public static void Zadanie_1()
    {
        int n = 0;
        System.out.println("Wprowadz liczbe studentow: ");
        Scanner liczba= new Scanner(System.in);
        n = liczba.nextInt();
        int stud = n;
        double punkty = 0;
        double suma = 0;
        Scanner pkt = new Scanner(System.in);
        System.out.println("Wprowadz punkty studentow: ");
        while (n>0)
        {
            punkty = pkt.nextDouble();
            n--;
            suma+=punkty;
        }
        double srednia = 0;
        srednia= suma/stud;
        System.out.println("Srednia wynosi: "+srednia);
    }

    public static void Zadanie_2() {
        int dodatnie=0, ujemne=0, ileu=0, iled=0;
        Scanner liczba = new Scanner(System.in);
        System.out.print("Wprowadz wielkosc tablicy = ");
        double[] tab = new double[liczba.nextInt()];
        for (int i = 0; i<tab.length; i++)
        {
            System.out.print("Wprowadz liczbe tab["+i+"] = ");
            tab[i] = liczba.nextDouble();
            if (tab[i]>=0)
            {
                dodatnie+=tab[i];
                iled++;
            }
            else
            {
                ujemne+=tab[i];
                ileu++;
            }
        }
        System.out.println("Suma liczb dodatnich = "+dodatnie+" natomiast ujemnych = "+ujemne);
        System.out.println("Ilosc liczb dodatnich = "+iled+" natomiast ujemnych = "+ileu);
    }

    public static void Zadanie_3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu, n>0 ");
        int n = scan.nextInt();//ilość liczb w ciągu
        double liczba;
        double suma=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę: ");
            liczba = scan.nextDouble();
            if(liczba%2==0)
                suma+=liczba;

        }
        System.out.println("Suma przystych liczb wynosi: "+suma);
    }

    public static void Zadanie_4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu ");
        int n = scan.nextInt();
        Random losowanie = new Random();
        int liczba;
        int suma=0;
        while (n>0)
        {
            liczba = losowanie.nextInt(-10,45);
            System.out.println(liczba);
            if(liczba%2==0) suma+=liczba;
            n--;
        }
        System.out.println("Suma parzystych wyrazów: "+suma);
    }

    public static boolean Zadanie_5(String tekst){
        for (int i = 0; i < tekst.length()/2; i++) {
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length()-1-i);
            if (znak != przeciwnyZnak) return false;
        }
        return true;
    }
}