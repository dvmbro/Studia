package Labolatorium_6.Figury;

public class Kwadrat extends Figura {

    double x;

    public Kwadrat (float x)
    {
        this.x = x;
    }

    @Override
    double obliczObwod(double x)
    {
        return 4*x;
    }

    @Override
    double obliczPole(double x)
     {
         return x*x;
     }

     @Override
    void pokazDane()
    {
        System.out.println("Figura to kwadrat o polu " + obliczObwod(x) + " oraz polu " + obliczPole(x));
    }

}
