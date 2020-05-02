package Labolatorium_8.matematyka;

public class Main {
    public static void main(String[] args) {

        UłamekZwykły a = new UłamekZwykły(55,2);
        UłamekZwykły b = new UłamekZwykły(21,6);
        UłamekZwykły c = new UłamekZwykły(6435,25);
        UłamekZwykły d = new UłamekZwykły(-15,52);
        System.out.println("Ilość zadeklarowanych ułamków: " + UłamekZwykły.getIleUłamków());
        a.getInfo();
        b.getInfo();
        c.getInfo();
        d.getInfo();
    }
}
