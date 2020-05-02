package Labolatorium_8.matematyka;

import static java.lang.Math.sqrt;

public class LiczbaZespolona {

    double re;
    double im;
    static String symbol = "i";

    LiczbaZespolona(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void getInfo()
    {
        System.out.print("(" + (double)Math.round(this.getRe() * 100d) / 100d + " + " + (double)Math.round(this.getIm() * 100d) / 100d + symbol + ")");
    }

    public class Moduł
    {
        double wartosc;

        Moduł(LiczbaZespolona z1)
        {
            this.wartosc = sqrt(z1.getIm()*z1.getIm()+z1.getRe()*z1.getRe());
        }
    }
}
