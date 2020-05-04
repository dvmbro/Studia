package Labolatorium_9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Osoba> lista = new ArrayList<Osoba>();
        lista.add(new Osoba("Kacper","Dąbrowski",21,190,86));
        lista.add(new Osoba("Piotr","Hołowczyc",21,175,70.5));
        lista.add(new Osoba("Janina","Jerzyna",40,160,50));
        lista.add(new Osoba("Aleksandra","Nijaka",30,179,90));
        lista.add(new Osoba("Olek","Bolek",32,169,64));
        lista.add(new Osoba("Janusz","Dworek",64,159,68.4));
        lista.add(new Osoba("Kacper","Toporny",18,179,90));
        System.out.println(lista);
        Scanner sc = new Scanner(System.in);

        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Wyszukaj po imieniu");
        System.out.println("2. Wyszukaj po nazwisku");
        System.out.println("3. Wyszukaj po wieku");
        System.out.println("4. Wyszukaj po wzroscie");
        System.out.println("5. Wyszukaj po wadze");

        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Podaj imię");
                String imie = sc.next();
                for(int i = 0; i < lista.size(); i++)
                {
                    if((lista.get(i).getImie().equals(imie)))
                    {
                        System.out.println(lista.get(i));
                    }
                }
                break;

            case 2:
                System.out.println("Podaj Nazwisko");
                String nazwisko = sc.next();
                for(int i = 0; i < lista.size(); i++)
                {
                    if((lista.get(i).getNazwisko().equals(nazwisko)))
                    {
                        System.out.println(lista.get(i));
                    }
                }
                break;

            case 3:
                System.out.println("Podaj wiek");
                int wiek = sc.nextInt();
                for(int i = 0; i < lista.size(); i++)
                {
                    if((lista.get(i).getWiek() == wiek))
                    {
                        System.out.println(lista.get(i));
                    }
                }
                break;

            case 4:
                System.out.println("Podaj wzrost");
                int wzrost = sc.nextInt();
                for(int i = 0; i < lista.size(); i++)
                {
                    if((lista.get(i).getWzrost() == wzrost))
                    {
                        System.out.println(lista.get(i));
                    }
                }
                break;

            case 5:
                System.out.println("Podaj wagę");
                double waga = sc.nextFloat();
                for(int i = 0; i < lista.size(); i++)
                {
                    if((lista.get(i).getWaga() == waga))
                    {
                        System.out.println(lista.get(i));
                    }
                }
                break;


            default:
                System.out.println("Podałeś nieprawidłową liczbę.");


        }








    }
}
