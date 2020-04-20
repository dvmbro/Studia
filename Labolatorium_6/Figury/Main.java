package Labolatorium_6.Figury;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(2);
        Kolo kolo = new Kolo(4);
        Trojkat trojkat = new Trojkat(10);

        Figura tablica[] = new Figura[3];
        tablica[0] = kwadrat;
        tablica[1] = kolo;
        tablica[2] = trojkat;

        for(Figura i : tablica)
        {
            i.pokazDane();
        }
    }
}
