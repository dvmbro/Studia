package Labolatorium_6.Wypisywanie;

import Labolatorium_5.Samochod;

public class Samochód implements Wypisywanie{

    String marka;
    int rokProdukcji;
    String silnik;


    public Samochód(String marka, int rokProdukcji, String silnik)
    {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.silnik = silnik;
    }

    @Override
    public void wypiszPodstawoweInfo() {
        System.out.println(marka + rokProdukcji + silnik);
    }

    @Override
    public void wypiszRozszerzoneInfo() {
        System.out.println("Auto to " + marka + ", zostało wyprodukowane " + rokProdukcji +" i posiada silnik " + silnik);

    }
}
