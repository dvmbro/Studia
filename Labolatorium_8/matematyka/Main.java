package Labolatorium_8.matematyka;

public class Main {
    public static void main(String[] args) {


        System.out.println("############### UŁAMKI ###############");
        UłamekZwykły a = new UłamekZwykły(5,6);
        UłamekZwykły b = new UłamekZwykły(4,2);
        UłamekZwykły c = new UłamekZwykły(-5,2);
        UłamekZwykły d = new UłamekZwykły(-10,7);


        System.out.println("Ilość zadeklarowanych ułamków: " + UłamekZwykły.getIleUłamków());


        a.getInfo();
        System.out.println();
        b.getInfo();
        System.out.println();
        c.getInfo();
        System.out.println();
        d.getInfo();
        System.out.println();


        System.out.print("Dodawanie a i b : ");
        OperacjeNaUłamkach.dodajUłamki(a,b);
        System.out.println();

        System.out.print("Odejmowanie b i c : ");
        OperacjeNaUłamkach.odejmijUłamki(b,c);
        System.out.println();

        System.out.print("Mnożenie c i d : ");
        OperacjeNaUłamkach.pomnóżUłamki(c,d);
        System.out.println();


        System.out.print("Dzielenie c i b : ");
        OperacjeNaUłamkach.podzielUłamki(c,b);
        System.out.println();


        UłamekZwykły.UłamekDziesiętny aDzies = a.new UłamekDziesiętny(a);
        System.out.println("Ułamek a zapisany w systemie dziesiętnym : " + aDzies.dziesietny);

        UłamekZwykły.UłamekDziesiętny bDzies = b.new UłamekDziesiętny(b);
        System.out.println("Ułamek b zapisany w systemie dziesiętnym : " + bDzies.dziesietny);

        UłamekZwykły.UłamekDziesiętny cDzies = c.new UłamekDziesiętny(c);
        System.out.println("Ułamek c zapisany w systemie dziesiętnym : " + cDzies.dziesietny);
    }
}
