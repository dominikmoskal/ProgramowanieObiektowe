package com.company;

public class Main {

    public static void main(String[] args) {
        Oblicz(9,3);
        Parzysta(11);
        System.out.println();
        System.out.println(Potega(8));
        System.out.println();
        System.out.println(Pierwiastek(8));
        System.out.println();
        System.out.println(T_Prostokatny(6,8,10));

    }
    //Zadanie_2
    public static void Oblicz(double a, double b)
    {
        System.out.println("Suma liczb "+a+" i "+b+" wynosi: "+(a + b));
        System.out.println("Roznica liczb "+a+" i "+b+" wynosi: "+(a - b));
        System.out.println("Iloczyn liczb "+a+" i "+b+" wynosi: "+(a * b));
    }
    //Zadanie_3
    public static void Parzysta(int liczba)
    {
        if(liczba%2==0)
            System.out.println("Parzysta");
        else System.out.println("Nieparzysta");
    }
    //Zadanie_5
    public static int Potega(double x)
    {
       return (int) Math.pow(x,4);
    }
    //Zadanie_6
    public static double Pierwiastek(double x)
    {
        return Math.sqrt(x);
    }
    //Zadanie_7
    public static boolean T_Prostokatny(double a, double b, double c)
    {
        if((Math.pow(a,2)+Math.pow(b,2))==(Math.pow(c,2))) return true;
        else return false;
    }

}