package Labolatorium_6.Zwierzęta;

public class Main {

    public static void main(String[] args) {

        Zmiennocieplne krokodyl = new Zmiennocieplne("krokodyl",30,40);
        Stałocieplne kot = new Stałocieplne("kot",35);
        Zmiennocieplne salamandra = new Zmiennocieplne("salamandra",35,47);

        Zwierzeta tablica[] = new Zwierzeta[3];
        tablica[0] = krokodyl;
        tablica[1] = kot;
        tablica[2] = salamandra;
        for(Zwierzeta i : tablica)
        {
            i.pokazDane();
        }
    }
}
