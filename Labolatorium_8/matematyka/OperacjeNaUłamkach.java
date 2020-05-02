package Labolatorium_8.matematyka;

public class OperacjeNaUłamkach {

    static void dodajUłamki(UłamekZwykły a, UłamekZwykły b)
    {
        int x;
        int y;
        if(a.getMianownik() == b.getMianownik())
        {
            x = a.getLicznik() + b.getLicznik();
            y = a.getMianownik();
        }
        else
        {
            x = a.getLicznik() * b.getMianownik() + b.getLicznik() * a.getMianownik();
            y = a.getMianownik() * b.getMianownik();
        }
        UłamekZwykły wynik = new UłamekZwykły(x,y);
        a.getInfo();
        System.out.print(" + ");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }

    static void odejmijUłamki(UłamekZwykły a, UłamekZwykły b)
    {
        int x;
        int y;
        if(a.getMianownik() == b.getMianownik())
        {
            x = a.getLicznik() + b.getLicznik();
            y = a.getMianownik();
        }
        else
        {
            x = a.getLicznik() * b.getMianownik() - b.getLicznik() * a.getMianownik();
            y = a.getMianownik() * b.getMianownik();
        }
        UłamekZwykły wynik = new UłamekZwykły(x,y);
        a.getInfo();
        System.out.print(" - ");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }

}
