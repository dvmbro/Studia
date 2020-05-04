package Labolatorium_9;

import java.util.*;

public class Main_Osoby {
    public static void main(String[] args) {

        int a = 0;
        ArrayList<Osoba> lista = new ArrayList<Osoba>();
        lista.add(new Osoba("Kacper","Kreda",21,190,90));
        lista.add(new Osoba("Piotr","Hołowczyc",21,175,70.5));
        lista.add(new Osoba("Janina","Jerzyna",40,160,50));
        lista.add(new Osoba("Aleksandra","Nijaka",88,179,90));
        lista.add(new Osoba("Olek","Bolek",32,169,64));
        lista.add(new Osoba("Janusz","Dworek",64,159,68.4));
        lista.add(new Osoba("Kacper","Toporny",18,179,90));
        Scanner sc = new Scanner(System.in);

        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Wyszukaj po danej");
        System.out.println("2. Wyszukaj osobę najstarszą/najwyższą itd");
        System.out.println("3. Sortuj wszystkich według kryterium");

        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Co chcesz zrobic?");
                System.out.println("1. Wyszukaj po imieniu");
                System.out.println("2. Wyszukaj po nazwisku");
                System.out.println("3. Wyszukaj po wieku");
                System.out.println("4. Wyszukaj po wzroscie");
                System.out.println("5. Wyszukaj po wadze");
                switch (sc.nextInt()){

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

                }break;

            case 2:
                System.out.println("Co chcesz zrobic?");
                System.out.println("1. Wyszukaj osobę najstarszą");
                System.out.println("2. Wyszukaj osobę najwyższą");
                System.out.println("3. Wyszukaj osobę najcięższą");
                System.out.println("4. Wyszukaj osobę najmniejszą");
                System.out.println("5. Wyszukaj osobę najlżejszą");
                switch (sc.nextInt()){

                    case 1:

                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Integer.valueOf(o1.wiek).compareTo(o2.wiek);
                            }
                        });
                        System.out.println(lista.get(0));
                        break;

                    case 2:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Integer.valueOf(o1.wzrost).compareTo(o2.wzrost);
                            }
                        });
                        System.out.println(lista.get(0));
                        break;

                    case 3:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Double.valueOf(o1.waga).compareTo(o2.waga);
                            }
                        });
                        System.out.println(lista.get(0));
                        break;

                    case 4:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Integer.valueOf(o2.wzrost).compareTo(o1.wzrost);
                            }
                        });
                        System.out.println(lista.get(0));
                        break;

                    case 5:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Double.valueOf(o2.waga).compareTo(o1.waga);
                            }
                        });
                        System.out.println(lista.get(0));
                        break;

                    default:
                        System.out.println("Podałeś nieprawidłową liczbę. case 2");
                }break;

            case 3:
                System.out.println("Co chcesz zrobic?");
                System.out.println("1. Sortowanie wg wieku rosnąco");
                System.out.println("2. Sortowanie wg wzrostu rosnąco");
                System.out.println("3. Sortowanie wg wagi rosnąco");
                switch (sc.nextInt()){

                    case 1:

                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Integer.valueOf(o2.wiek).compareTo(o1.wiek);
                            }
                        });
                        System.out.println(lista);
                        break;

                    case 2:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Integer.valueOf(o2.wzrost).compareTo(o1.wzrost);
                            }
                        });
                        System.out.println(lista);
                        break;

                    case 3:
                        Collections.sort(lista, new Comparator<Osoba>() {
                            @Override
                            public int compare(Osoba o2, Osoba o1) {
                                return Double.valueOf(o2.waga).compareTo(o1.waga);
                            }
                        });
                        System.out.println(lista);
                        break;

                    default:
                        System.out.println("Podałeś nieprawidłową liczbę. case 2");
                }break;

            default:
                System.out.println("Podałeś nieprawidłową liczbę.");
        }
    }
}
