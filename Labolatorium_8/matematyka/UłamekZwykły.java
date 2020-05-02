package Labolatorium_8.matematyka;

public class UłamekZwykły {


    int licznik;
    int mianownik;
    static int ileUłamków;
    static String symbol = "/" ;


    UłamekZwykły(int licznik, int mianownik)
    {
        this.licznik = licznik;
        this.mianownik = mianownik;
        ileUłamków++;
    }

    public int getLicznik() {
        return licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public static int getIleUłamków() {
        return ileUłamków;
    }

    public void getInfo()
    {
        System.out.println(this.getLicznik()+symbol+this.getMianownik());
    }
}
