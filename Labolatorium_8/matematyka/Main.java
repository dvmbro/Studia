package Labolatorium_8.matematyka;

public class Main {
    public static void main(String[] args) {

        UłamekZwykły a = new UłamekZwykły(5,6);
        UłamekZwykły b = new UłamekZwykły(4,2);
        UłamekZwykły c = new UłamekZwykły(6435,25);
        UłamekZwykły d = new UłamekZwykły(-15,52);


        System.out.println("Ilość zadeklarowanych ułamków: " + UłamekZwykły.getIleUłamków());


        a.getInfo();
        System.out.println();
        b.getInfo();
        System.out.println();

        OperacjeNaUłamkach.dodajUłamki(a,b);
        System.out.println();
        OperacjeNaUłamkach.odejmijUłamki(a,b);
    }
}
