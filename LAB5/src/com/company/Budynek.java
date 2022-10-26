package com.company;

public class Budynek
{
    String nazwa;
    int rok_budowy;
    int liczba_pieter;

    public Budynek(String nazwa,int rok_budowy,int liczba_pieter){
        this.nazwa=nazwa;
        this.rok_budowy=rok_budowy;
        this.liczba_pieter=liczba_pieter;
    }
    public void info(){
        if(liczba_pieter!=1)
        System.out.print("Budynek "+nazwa+" ma "+liczba_pieter
                +" pieter, zostal wybudowany w roku "+rok_budowy+", wiec ma ");
        else System.out.print("Budynek "+nazwa+" ma "+liczba_pieter
                +" pietro, zostal wybudowany w roku "+rok_budowy+", wiec ma ");
    }
    public int wiek(int rok_obecny)
    {
        return rok_obecny-rok_budowy;
    }
}



