package Labolatorium_6.Zwierzęta;

public class Stałocieplne extends Zwierzeta {

    String nazwa;
    double temperatura;

    public Stałocieplne (String nazwa,float temperatura)
    {
        this.temperatura=temperatura;
        this.nazwa=nazwa;
    }

    public void pokazDane()
    {
        System.out.println("Zwierze to " + nazwa + " o temperaturze stałej " + temperatura);
    }

    @Override
    void podajTemperaturę(double temp) {
        this.temperatura = temp;
    }

    @Override
    void podajTemperaturę(double temperaturaMin, double temperaturaMax){};

}
