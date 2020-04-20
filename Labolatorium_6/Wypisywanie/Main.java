package Labolatorium_6.Wypisywanie;

import Labolatorium_5.Samochod;

public class Main  {
    public static void main(String[] args) {

        Samochód audi = new Samochód("audi",2006,"V8");
        Książki malyksiaze = new Książki("Mały książę",1990,"Operon");
        Samochód bmw = new Samochód("bmw",2016,"V12");
        Książki dziecizbulerbyn = new Książki("Dzieci z Bullerbyn",1999,"Nowa Era");

        Samochód tab_samochodow[] = new Samochód[2];
        Książki tab_ksiazek[] = new Książki[2];

        tab_ksiazek[0] = malyksiaze;
        tab_ksiazek[1] = dziecizbulerbyn;

        tab_samochodow[0] = audi;
        tab_samochodow[1] = bmw;

        for(Wypisywanie i : tab_ksiazek)
        {
            i.wypiszPodstawoweInfo();
            i.wypiszRozszerzoneInfo();
        }

        System.out.println("-------------------");

        for(Wypisywanie i : tab_samochodow)
        {
            i.wypiszPodstawoweInfo();
            i.wypiszRozszerzoneInfo();
        }
    }
}
