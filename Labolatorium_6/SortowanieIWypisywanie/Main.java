package Labolatorium_6.SortowanieIWypisywanie;

public class Main implements Sortowanie,Wypisywanie{
    public static void main(String[] args) {

        Liczby tabLiczb = new Liczby();
        Łańcuchy tabŁańcuchów = new Łańcuchy();

        System.out.print("Tablica nieposortowana: ");
        tabLiczb.wypiszInfo();
        System.out.println();
        System.out.print("Tablica posortowana rosnąco: ");
        tabLiczb.sortujMalejąco();
        tabLiczb.wypiszInfo();
        System.out.println();
        System.out.print("Tablica posortowana rosnąco: ");
        tabLiczb.sortujRosnąco();
        tabLiczb.wypiszInfo();


        System.out.println("\n\n");
        System.out.print("Tablica nieposortowana: ");
        tabŁańcuchów.wypiszInfo();
        tabŁańcuchów.sortujRosnąco();
        System.out.println();
        System.out.print("Tablica posortowana rosnąco: ");
        tabŁańcuchów.wypiszInfo();
        System.out.println();
        System.out.print("Tablica posortowana malejąco: ");
        tabŁańcuchów.sortujMalejąco();
        tabŁańcuchów.wypiszInfo();

//        tablicaLiczb[0] = new Liczby(4);
//        tablicaLiczb[1] = new Liczby(4.1);
//        tablicaLiczb[2] = new Liczby(464.7);
//        tablicaLiczb[3] = new Liczby(3);
//        tablicaLiczb[4] = new Liczby(0.1);
//        tablicaLiczb[5] = new Liczby(76);
//        tablicaLiczb[6] = new Liczby(-3);

//        for (Liczby i : tablicaLiczb)
//        {
//
//        }

    }

    @Override
    public void sortujRosnąco() {

    }

    @Override
    public void sortujMalejąco() {

    }

    @Override
    public void wypiszInfo() {

    }
}
