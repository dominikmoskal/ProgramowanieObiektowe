package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Zadanie1(1, 2, 1);
        System.out.println();
        Zadanie1(3, 2, 1);
        System.out.println();
        System.out.println();
        Zadanie1(0, 2, 1);
        System.out.println(Zadanie_2b(3));
        System.out.println(Zadanie_2c(4));
        Zadanie_3(1,4,21);
        Zadanie_3(1,2,21);
        Zadanie_4();
    }

    public static void Zadanie1(double a, double b, double c)
    {
        if (a != 0) {
            double delta = (b * b) - (4 * a * c);
            if (delta >= 0)
            {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                if(x1!=x2) System.out.println("Pierwiastkami rownania są: "+x1+", "+x2);
                else System.out.println("Pierwiastkiem rownania jest: "+x1);
            }
            else System.out.println("Brak rozwiązania");

        }
        else
        {
            System.out.println("To jest równanie liniowe");
            r_liniowe(b, c);
        }

    }

    public static void r_liniowe(double b, double c)
    {
        if (b == 0)
        {
            if (c == 0) System.out.println("Równanie tożsamościowe");
            else System.out.println("Równanie sprzeczne");
        }
        else
        {
            double x = -c / (2 * b);
            System.out.println("Równanie liniowe, x = " + x);
        }
    }
    public static double zadanie2a(double x)
    {
        if (x>0) return 2*x;
        else if (x==0) return 0;
        else return -3*x;
    }
    public static double Zadanie_2b(double x)
    {
        if(x>=1) return (x*x);
        if(x<1) return x;
        return x;
    }

    public static double Zadanie_2c(double x)
    {
        if(x>2) return 2+x;
        else if(x==2) return 8;
        else if(x<2) return x-4;
        return x;
    }
    public static void Zadanie_3(double a, double b, double c)
    {
        if (a > b && a > c && b > c)
            System.out.println("Wynik od min do max = " + c + " " + b + " " + a);
        else if (b > a && b > c && a > c)
            System.out.println("Wynik od min do max = " + c + " " + a + " " + b);
        else if (c > b && c > a && b > a)
            System.out.println("Wynik od min do max = " + a + " " + b + " " + c);
        else
            System.out.println("Wynik od min do max = " + b + " " + a + " " + c);
    }
    public static void Zadanie_4()
    {
        boolean deszcz, autobus;
        Scanner scan = new Scanner(System.in);
        deszcz = scan.nextBoolean();
        autobus = scan.nextBoolean();
        String x="Weź parasol", y="Dostaniesz się na uczelnie", z="Milego dnia i pięknej pogody";
        if (deszcz && autobus)
            System.out.print(x+", "+y);
        if (deszcz && !autobus)
            System.out.print("Nie "+y);
        if (!deszcz && autobus)
            System.out.print(y+", "+z);
    }
    public static void Zadanie_5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy jest zniżka?");
        boolean znizka = scan.nextBoolean();
        System.out.println("Czy otrzymałeś premię?");
        boolean premia = scan.nextBoolean();
        if (!znizka || premia) {
            System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma.");
        }
        if (!znizka || !premia) {
            System.out.println("Zakup samochodu trzeba odłożyć na później. Zniżki na samochód nie ma.");
        }
        if (znizka || premia) {
            System.out.println("Możesz kupić samochód!");
        }
    }
    public static void Zadanie_6()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: a= ");
        double a = scan.nextDouble();
        System.out.println("Wprowadź drugą liczbę: b= ");
        double b = scan.nextDouble();
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Dzielenie");
        System.out.println("5.Reszta z dzielenia");
        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;
        double iloraz = a / b;
        double reszta = a % b;
        System.out.println("Wybierz jakie działanie chcesz wykonać z podanych wyżej opcji: ");
        for (int i = 1; i > 0; i--)
        {
            int choice = scan.nextInt();
            if (choice == 1) System.out.println("Suma " + a + " i " + b + " wynosi: " + suma);
            if (choice == 2) System.out.println("Różnica " + a + " i " + b + " wynosi: " + roznica);
            if (choice == 3) System.out.println("Iloczyn " + a + " i " + b + " wynosi: " + iloczyn);
            if (choice == 4)
            {
                if (b == 0) System.out.println("Nie można dzielić przez 0");
                else System.out.println("Iloraz" + a + " przez " + b + " wynosi: " + iloraz);
            }
            if (choice == 5) System.out.println("Reszta z dzielenia " + a + " przez " + b + " wynosi: " + reszta);
        }
    }
}
