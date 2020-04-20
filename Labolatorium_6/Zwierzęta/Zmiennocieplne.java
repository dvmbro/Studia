package Labolatorium_6.Zwierzęta;

public class Zmiennocieplne extends Zwierzeta {

    String nazwa;
    double temperaturaMin;
    double temperaturaMax;

    public Zmiennocieplne (String nazwa,float temperaturaMin,float temperaturaMax)
    {
        this.temperaturaMin=temperaturaMin;
        this.temperaturaMax=temperaturaMax;
        this.nazwa=nazwa;
    }

    public void pokazDane()
    {
        System.out.println("Zwierze to " + nazwa + " o temperaturze minimalnej " + temperaturaMin + " oraz temperaturze maksymalnej " + temperaturaMax);
    }


    @Override
    void podajTemperaturę(double temperaturaMin,double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    @Override
    void podajTemperaturę(double temp) {}

}
