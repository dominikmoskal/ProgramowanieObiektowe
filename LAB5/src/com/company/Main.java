package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Zadanie_1();
        Zadanie_2();
        Scanner bok = new Scanner(System.in);
        System.out.print("Dlugosc prostokata = ");
        double dlugosc = bok.nextDouble();
        System.out.print("Szerokosc prostokata = ");
        double szerokosc = bok.nextDouble();
        Prostokat p1 = new Prostokat(dlugosc,szerokosc);
        System.out.print("Pole prostokata = ");
        p1.pole();
        System.out.print("Obwod rostokata = ");
        p1.obwod();
        System.out.print("Przekatna prostokata = ");
        p1.przekatna();
        Budynek B1 = new Budynek("Szpital",2012,5);
        Budynek B2 = new Budynek("Szkola",2021,1);

        B1.info();
        if(B1.wiek(LocalDate.now().getYear())!=1)
            System.out.print(B1.wiek(LocalDate.now().getYear())+" lat");
        else
            System.out.print(B1.wiek(LocalDate.now().getYear())+" rok");
        System.out.println();

        B2.info();
        if(B2.wiek(LocalDate.now().getYear())!=1)
            System.out.print(B2.wiek(LocalDate.now().getYear())+" lat");
        else
            System.out.print(B2.wiek(LocalDate.now().getYear())+" rok");
    }

}


