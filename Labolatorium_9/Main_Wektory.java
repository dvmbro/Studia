package Labolatorium_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_Wektory {
    public static void main(String[] args) {
        System.out.println("######################################################");
        ArrayList<Wektor> lista = new ArrayList<>();
        lista.add(new Wektor(2.0,4.2));
        lista.add(new Wektor(-6.12,3.1));
        lista.add(new Wektor(4.0,45.2));
        lista.add(new Wektor(2.2,4.2));
        lista.add(new Wektor(-303.5,-4.35));
        lista.add(new Wektor(-7.0,4.2));
        lista.add(new Wektor(35.0,0));
        System.out.println(lista);
        System.out.println("######################################################");
        System.out.println("Lista posortowana według długości wektorów rosnąco:");
        lista.sort(new Comparator<Wektor>() {
            @Override
            public int compare(Wektor o1, Wektor o2) {
                return o1.dlugosc().compareTo(o2.dlugosc());
            }
        });
        System.out.println(lista);
        System.out.println("######################################################");
        lista.sort(new Comparator<Wektor>() {
            @Override
            public int compare(Wektor o1, Wektor o2) {
                return o1.dlugosc().compareTo(o2.dlugosc());
            }
        });
        System.out.println("Wektor najdłuższy:");
        System.out.println(lista.get(lista.size()-1));
        System.out.println("######################################################");
        System.out.println("Wektor najkrótszy:");
        System.out.println(lista.get(0));
    }
}
