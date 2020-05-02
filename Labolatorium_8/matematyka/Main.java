package Labolatorium_8.matematyka;

public class Main {
    public static void main(String[] args) {


        System.out.println("####################### UŁAMKI #######################");


        UłamekZwykły u1 = new UłamekZwykły(5,6);
        UłamekZwykły u2 = new UłamekZwykły(4,2);
        UłamekZwykły u3 = new UłamekZwykły(-5,2);
        UłamekZwykły u4 = new UłamekZwykły(-10,7);

        System.out.println("Ilość zadeklarowanych ułamków: " + UłamekZwykły.getIleUłamków());

        u1.getInfo();
        System.out.println();
        u2.getInfo();
        System.out.println();
        u3.getInfo();
        System.out.println();
        u4.getInfo();
        System.out.println();

        System.out.print("Dodawanie u1 i u2 : ");
        xOperacjeNaUłamkach.dodajUłamki(u1,u2);
        System.out.println();
        System.out.print("Odejmowanie u2 i c : ");
        xOperacjeNaUłamkach.odejmijUłamki(u2,u3);
        System.out.println();
        System.out.print("Mnożenie c i u4 : ");
        xOperacjeNaUłamkach.pomnóżUłamki(u3,u4);
        System.out.println();
        System.out.print("Dzielenie c i u2 : ");
        xOperacjeNaUłamkach.podzielUłamki(u3,u2);
        System.out.println();

        UłamekZwykły.UłamekDziesiętny aDzies = u1.new UłamekDziesiętny(u1);
        System.out.println("Ułamek u1 zapisany w systemie dziesiętnym : " + aDzies.dziesietny);
        UłamekZwykły.UłamekDziesiętny bDzies = u2.new UłamekDziesiętny(u2);
        System.out.println("Ułamek u2 zapisany w systemie dziesiętnym : " + bDzies.dziesietny);
        UłamekZwykły.UłamekDziesiętny cDzies = u3.new UłamekDziesiętny(u3);
        System.out.println("Ułamek c zapisany w systemie dziesiętnym : " + cDzies.dziesietny);




        System.out.println("####################### LICZBY ZESPOLONE #######################");


        LiczbaZespolona z1 = new LiczbaZespolona(5,2.4);
        LiczbaZespolona z2 = new LiczbaZespolona(-2,4);
        LiczbaZespolona z3 = new LiczbaZespolona(9.9,-2);
        LiczbaZespolona z4 = new LiczbaZespolona(-1.1,-4);

        z1.getInfo();
        System.out.println();
        z2.getInfo();
        System.out.println();
        z3.getInfo();
        System.out.println();
        z4.getInfo();
        System.out.println();

        System.out.println("Dodawanie: ");
        OperacjeNaLiczbachZespolonych.dodawanieLiczb(z1,z2);
        System.out.println();
        OperacjeNaLiczbachZespolonych.dodawanieLiczb(z2,z3);
        System.out.println();
        OperacjeNaLiczbachZespolonych.dodawanieLiczb(z3,z4);
        System.out.println();

        System.out.println("Odejmowanie: ");
        OperacjeNaLiczbachZespolonych.odejmowanieLiczb(z1,z2);
        System.out.println();
        OperacjeNaLiczbachZespolonych.odejmowanieLiczb(z2,z3);
        System.out.println();
        OperacjeNaLiczbachZespolonych.odejmowanieLiczb(z3,z4);
        System.out.println();

        System.out.println("Mnożenie: ");
        OperacjeNaLiczbachZespolonych.mnożenieLiczb(z1,z2);
        System.out.println();
        OperacjeNaLiczbachZespolonych.mnożenieLiczb(z2,z3);
        System.out.println();
        OperacjeNaLiczbachZespolonych.mnożenieLiczb(z3,z4);
        System.out.println();

        System.out.println("Dzielenie: ");
        OperacjeNaLiczbachZespolonych.dzielenieLiczb(z1,z2);
        System.out.println();
        OperacjeNaLiczbachZespolonych.dzielenieLiczb(z2,z3);
        System.out.println();
        OperacjeNaLiczbachZespolonych.dzielenieLiczb(z3,z4);
        System.out.println();

        LiczbaZespolona.Moduł m1 = z1.new Moduł(z1);
        System.out.print("Moduł z liczby zespolonej ");
        z1.getInfo();
        System.out.println(" = " + m1.wartosc);
    }
}
