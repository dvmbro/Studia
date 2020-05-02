package Labolatorium_8.matematyka;

public class UłamekZwykły {


    Integer licznik;
    Integer mianownik;
    static int ileUłamków = 0;
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
        System.out.print(this.getLicznik()+symbol+this.getMianownik());
    }



    public class UłamekDziesiętny
    {
        float dziesietny;

        UłamekDziesiętny(UłamekZwykły a)
        {
            this.dziesietny = (float)a.getLicznik() / (float)a.getMianownik();
        }

    }
}
