package Labolatorium_8.matematyka;

public class OperacjeNaLiczbachZespolonych {

    static void dodawanieLiczb(LiczbaZespolona a, LiczbaZespolona b)
    {
        double x,y;
        x = a.getRe() + b.getRe();
        y = a.getIm() + b.getIm();
        LiczbaZespolona wynik = new LiczbaZespolona(x,y);
        a.getInfo();
        System.out.print(" + ");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }

    static void odejmowanieLiczb(LiczbaZespolona a, LiczbaZespolona b)
    {
        double x,y;
        x = a.getRe() - b.getRe();
        y = a.getIm() - b.getIm();
        LiczbaZespolona wynik = new LiczbaZespolona(x,y);
        a.getInfo();
        System.out.print(" - ");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }

    static void mnożenieLiczb(LiczbaZespolona a, LiczbaZespolona b)
    {
        double x,y;
        x = a.getRe()*b.getRe() - a.getIm()*b.getIm();
        y = a.getRe()*b.getIm() + a.getIm()*b.getRe();
        LiczbaZespolona wynik = new LiczbaZespolona(x,y);
        a.getInfo();
        System.out.print(" * ");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }

    static void dzielenieLiczb(LiczbaZespolona a, LiczbaZespolona b)
    {
        double x,y;
        x = (a.getRe()*b.getRe() + a.getIm()*b.getIm()) / (b.getRe()*b.getRe() + b.getIm()*b.getIm());
        y = (a.getIm()*b.getRe() - a.getRe()*b.getIm()) / (b.getRe()*b.getRe() + b.getIm()*b.getIm());
        LiczbaZespolona wynik = new LiczbaZespolona(x,y);
        a.getInfo();
        System.out.print("/");
        b.getInfo();
        System.out.print(" = ");
        wynik.getInfo();
    }
}
