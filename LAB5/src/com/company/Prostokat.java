package com.company;

public class Prostokat {
    double dlugosc;
    double szerokosc;
    double obwod;
    double pole;
    double przekatna;
    public void obwod()
    {
        obwod=2*(dlugosc+szerokosc);
        System.out.println(obwod);
    }
    public void pole()
    {
        pole=dlugosc*szerokosc;
        System.out.println(pole);
    }
    public void przekatna()
    {
        przekatna=Math.sqrt(Math.pow(dlugosc,2)+Math.pow(szerokosc,2));
        System.out.println(przekatna);
    }
    public Prostokat(double dlugosc,double szerokosc)
    {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
}
