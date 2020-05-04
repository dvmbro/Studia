package Labolatorium_9;

import static java.lang.Math.sqrt;

public class Wektor {
    Double x;
    Double y;


    Double dlugosc()
    {
        return sqrt(this.x*this.x+this.y*this.y);
    }

    public Wektor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Wektor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
