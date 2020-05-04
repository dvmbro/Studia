package Labolatorium_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Wynagrodzenia {
    public static void main(String[] args) {
        ArrayList<Wynagrodzenia> lista = new ArrayList<Wynagrodzenia>();
        lista.add(new Wynagrodzenia("Dąbrowski",4502));
        lista.add(new Wynagrodzenia("Zielinski",3552));
        lista.add(new Wynagrodzenia("Rataj",2202));
        lista.add(new Wynagrodzenia("Nowak",4302));

        for (Wynagrodzenia i : lista)
        {
            System.out.println(i.nazwisko + " " + i.stawka + " zł");
        }

        System.out.println();
        System.out.println("Występujące stawki:");
        for (Wynagrodzenia i : lista)
        {
            System.out.print(i.stawka + " ");
        }

        System.out.println("\n");
        System.out.println("Podaj nazwisko: ");
        Scanner sc = new Scanner(System.in);
        String nazwisko = sc.next();
        for(int i = 0; i < lista.size(); i++)
        {
            if(lista.get(i).getNazwisko().equals(nazwisko))
            {
                System.out.println(lista.get(i));
            }
        }
    }
}
