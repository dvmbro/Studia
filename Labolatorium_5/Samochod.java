package Labolatorium_5;


import java.util.Arrays;
import java.util.Scanner;


public class Samochod {

    Scanner sc = new Scanner(System.in);

    public String brand;
    public String engineCapacity;
    public String dateOfManufacturing;
    public String plateNumber;
    public String ownerName;




    public Samochod()
    {

    }


    public String getBrand()
    {
        return brand;
    }

    public String getEngineCapacity()
    {
        return (engineCapacity);
    }
    public String getDateOfManufacturing()
    {
        return dateOfManufacturing;
    }
    public String getPlateNumber()
    {
        return plateNumber;
    }
    public String getOwnerName()
    {
        return ownerName;
    }

    public void getInfo()
    {
        System.out.println("Marka: " + this.brand);
        System.out.println("Pojemność silnika: " + this.engineCapacity);
        System.out.println("Rok produkcji: " + this.dateOfManufacturing);
        System.out.println("Numer rejestracyjny: " + this.plateNumber);
        System.out.println("Nazwisko właściciela: " + this.ownerName);
        System.out.println("------------------------------------");
    }

    public void getInfoByPlateNumber(Samochod tablica[], String plateNumber)
    {
        for(Samochod ity : tablica)
        {
            if(ity.getPlateNumber().equals(plateNumber))
            {
                ity.getInfo();
            }
        }
    }

    public void changeOwnerByPlateNumber(Samochod tablica[], String plateNumber)
    {
        for(Samochod ity : tablica)
        {
            if(ity.getPlateNumber().equals(plateNumber))
            {
                System.out.println("Właścicielem " + ity.getBrand() + " o  rejestracji " + ity.getPlateNumber() + " jest " + ity.getOwnerName() + " .");
                System.out.println("Podaj nowego właściciela");
                String newOwner;
                newOwner = sc.next();
                ity.ownerName = newOwner;
                System.out.println("Pomyślno zmieniono właściciela. Jest nim teraz " + ity.getOwnerName() + " .");
            }
        }
    }


    public void filterByYear(String year, Samochod tablica[])
    {
        for(Samochod ity : tablica)
        {
            if(Integer.parseInt(ity.dateOfManufacturing) < Integer.parseInt(year))
            {
                ity.getInfo();
            }
        }
    }

    public void sortDescByEngine(Samochod tablica[])
    {
        Float tab[] = new Float[5];
        int i = 0;
        for (Samochod ity : tablica)
        {
            tab[i] = Float.parseFloat(ity.getEngineCapacity()); //pomocnicza tablica z wartościami pojemności silników
            i++;
        }

        Arrays.sort(tab); //sortowanie tablicy

        i = 0;
        for (Samochod ity : tablica)
        {
            for(Samochod jty : tablica)
            {
                if (Float.parseFloat(jty.getEngineCapacity()) == (tab[i]))
                {
                    jty.getInfo();
                }
            }
            i++;
        }
    }


    public void getAllInfo(Samochod tablica[])
    {
        for(Samochod ity : tablica)
        {
            ity.getInfo();
        }
    }

    public void addCar(String brand, String engineCapacity, String dateOfManufacturing, String plateNumber, String ownerName)
    {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.dateOfManufacturing = dateOfManufacturing;
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
    }
}
