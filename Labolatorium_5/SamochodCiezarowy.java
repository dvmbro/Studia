package Labolatorium_5;

public class SamochodCiezarowy extends Samochod {

    int maxWeight;
    int ownWeight;
    int maxLoad;

    public void addCar(String brand, String engineCapacity, String dateOfManufacturing, String plateNumber, String ownerName,int maxWeight, int ownWeight)
    {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.dateOfManufacturing = dateOfManufacturing;
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.maxWeight = maxWeight;
        this.ownWeight = ownWeight;
    }


    public void getInfo()
    {
        System.out.println("Marka: " + this.brand);
        System.out.println("Pojemność silnika: " + this.engineCapacity);
        System.out.println("Rok produkcji: " + this.dateOfManufacturing);
        System.out.println("Numer rejestracyjny: " + this.plateNumber);
        System.out.println("Nazwisko właściciela: " + this.ownerName);
        if(this.maxWeight > 0)
        {
            System.out.println("Dopuszczalna masa całkowita: " + this.maxWeight + " kg");
            System.out.println("Masa własna: " + this.ownWeight + " kg");
            if(this.maxLoad > 0) System.out.println("Dopuszczalna ładowność: " + this.maxLoad + " kg");
        }


        System.out.println("------------------------------------");
    }

    public void addMaxLoadByPlateNumber(String plateNumber, int maxLoad, SamochodCiezarowy tablica[])
    {
        for(SamochodCiezarowy ity : tablica)
        {
            if(ity.getPlateNumber().equals(plateNumber))
            {
                if(ity. maxWeight > 0)
                {
                    ity.maxLoad = maxLoad;
                    System.out.println("Pomyślnie dodano dopuszczalną ładowność samochodu. Oto zaktualizowane dane: ");
                    ity.getInfo();
                }
                else
                    System.out.println("Błąd. Podane auto nie jest ciężarowe.");
            }
        }
    }

}
