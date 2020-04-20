package Labolatorium_6.Figury;

public class Kolo extends Figura{

    float x;

    public Kolo(float x)
    {
        this.x = x;
    }

    @Override
    double obliczObwod(double x)
    {
        return 2*3.14*x;
    }

    @Override
    double obliczPole(double x)
    {
        return 3.14*x*x;
    }

    @Override
    void pokazDane()
    {
        System.out.println("Figura to koło o polu " + obliczObwod(x) + " oraz polu " + obliczPole(x));
    }

}
