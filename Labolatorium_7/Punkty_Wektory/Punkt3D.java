package Labolatorium_7.Punkty_Wektory;

public class Punkt3D extends Punkt2D{

    Double z;

    public void setxyz(Double x, Double y, Double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Double getZ ()
    {
        return z;
    }

}
