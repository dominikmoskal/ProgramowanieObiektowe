package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N=100,ileZ=0;
        double[]tab1=new double[N];
        Random rand= new Random();
        for (int i = 0; i < N; i++) {
            tab1[i]= rand.nextDouble(0,1);//Losuje liczby z przedziału (0,1)
            if(i<20) {
                int a=(int)(tab1[i]*1000);  //Wylicza z dokładnością do 3 miejsca po przecinku wartości liczb w tabeli
                System.out.print((double)a/1000 + " ");
            }
        }
        for (int i = 0; i < N; i++)
        {
            if (tab1[i]<0.3 || tab1[i]>0.7)
                tab1[i]=0;
              System.out.println("tab1["+i+"]="+tab1[i]);
        }

        for (int i = 0; i < N; i++)
            if (tab1[i]!=0)
                ileZ++;
        System.out.println();
        System.out.println("liczb roznych od 0 jest "+ileZ);
        int X=0;
        double[]tab=new double[ileZ];
        for (int i = 0; i < N; i++)
        {
            if(tab1[i]!=0) //Przypisuje do tabeli tab wartości różne od zera z tabeli tab1
            {
                tab[X]=tab1[i];
                X++;
            }
        }
         for (int i = 0; i < ileZ; i++)
         System.out.println("tab["+i+"]="+tab[i]);
    }

}
