package Labolatorium_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Miesiące {
    public static void main(String[] args) {
        ArrayList<Miesiące> lista = new ArrayList<Miesiące>();
        lista.add(new Miesiące("Styczeń",30));
        lista.add(new Miesiące("Luty",28));
        lista.add(new Miesiące("Marzec",31));
        lista.add(new Miesiące("Kwiecień",30));
        lista.add(new Miesiące("Maj",31));
        lista.add(new Miesiące("Czerwiec",30));
        lista.add(new Miesiące("Lipiec",31));
        lista.add(new Miesiące("Sierpień",31));
        lista.add(new Miesiące("Wrzesień",30));
        lista.add(new Miesiące("Październik",31));
        lista.add(new Miesiące("Listopad",30));
        lista.add(new Miesiące("Grudzień",31));

        for(Miesiące miesiac : lista)
        {
            System.out.println(miesiac.nazwa_miesiaca + " ma " + miesiac.ilosc_dni + " dni.");
        }

        System.out.println("\n\nPodaj miesiąc");
        Scanner sc = new Scanner(System.in);
        String miesiac = sc.next();
        for(Miesiące nazwa_miesiaca : lista)
        {
            if(nazwa_miesiaca.nazwa_miesiaca.equals(miesiac))
            {
                System.out.println(nazwa_miesiaca.nazwa_miesiaca + " ma " + nazwa_miesiaca.ilosc_dni + " dni.");

            }
        }

    }
}
