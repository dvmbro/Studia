package Labolatorium_6.Figury;

import static java.lang.Math.sqrt;

public class Trojkat extends Figura{

    double x;

    public Trojkat (float x)
    {
        this.x = x;
    }

    @Override
    double obliczObwod(double x)
    {
        return 3*x;
    }

    @Override
    double obliczPole(double x)
    {
        return (x*x*sqrt(3))/4;
    }

    @Override
    void pokazDane()
    {
        System.out.println("Figura to trojkąt równoboczny o polu " + obliczObwod(x) + " oraz polu " + obliczPole(x));
    }

}
