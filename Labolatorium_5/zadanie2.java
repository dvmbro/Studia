package Labolatorium_5;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Samochod car = new Samochod();
        SamochodCiezarowy ciezarowy = new SamochodCiezarowy();

        SamochodCiezarowy samochod1 = new SamochodCiezarowy();
        SamochodCiezarowy samochod2 = new SamochodCiezarowy();
        SamochodCiezarowy samochod3 = new SamochodCiezarowy();
        SamochodCiezarowy samochod4 = new SamochodCiezarowy();
        SamochodCiezarowy samochod5 = new SamochodCiezarowy();

        samochod1.addCar("Mercedes","3","2018","RZE23425","Dąbrowski");
        samochod2.addCar("Audi","2.5","2020","RZE23125","Majewski");
        samochod3.addCar("Scania","8.4","2010","RZE69425","Ogiński",6000,3000);
        samochod4.addCar("BMW","6","2000","RZE73335","Miły");
        samochod5.addCar("MAN","10","2008","RZE69123","Polański",10000,4000);

        SamochodCiezarowy tablica[] = new SamochodCiezarowy[5];
        tablica[0] = samochod1;
        tablica[1] = samochod2;
        tablica[2] = samochod3;
        tablica[3] = samochod4;
        tablica[4] = samochod5;


        System.out.println("########### MENU ############");
        System.out.println("1. Wyświetlanie informacji o samochodzie o podanym numerze rejestracyjnym");
        System.out.println("2. Wyświetlanie informacji o wszystkich samochodach");
        System.out.println("3. Zmiana właściciela dla samochodu o podanym numerze rejestracyjnym");
        System.out.println("4. Wyświetlenie informacji o pojazdach wyprodukowanych przed podanym rokiem");
        System.out.println("5. Posortowanie pojazdów względem pojemności silnika (od najmniejszej do największej)");
        System.out.println("6. Podanie informacji o dopuszczalnej ładowności samochodu.");

        int wybor;
        System.out.println("Co chcesz zrobic?");
        wybor = sc.nextInt();

        switch (wybor)
        {
            case 1:
            {
                System.out.println("Podaj numer rejestracyjny");
                String plateNumber;
                plateNumber = sc.next();
                System.out.println("Samochod o numerze rejestracyjnym " + plateNumber + " :\n");
                ciezarowy.getInfoByPlateNumber(tablica, plateNumber);
                break;
            }


            case 2:
            {
                car.getAllInfo(tablica);
                break;
            }

            case 3:
            {
                System.out.println("Podaj numer rejestracyjny");
                String plateNumber;
                plateNumber = sc.next();
                car.changeOwnerByPlateNumber(tablica,plateNumber);
                break;
            }

            case 4:
            {
                System.out.println("Podaj rok");
                String year;
                year = sc.next();
                car.filterByYear(year, tablica);
                break;
            }

            case 5:
            {
                car.sortDescByEngine(tablica);
                break;
            }

            case 6:
            {

                System.out.println("Podaj numer rejestracyjny");
                String plateNumber;
                plateNumber = sc.next();
                System.out.println("Podaj dopuszczalną ładowność");
                int maxLoad;
                maxLoad = sc.nextInt();
                ciezarowy.addMaxLoadByPlateNumber(plateNumber,maxLoad,tablica);
                break;

            }

            default:
            {
                System.out.println("Wpisz poprawną wartość.");
            }
        }



    }
}
