package Labolatorium_6.Wypisywanie;

import Labolatorium_5.Samochod;

public class Książki implements Wypisywanie{

    String tytuł;
    int rokWydania;
    String wydawnictwo;


    public Książki(String tytuł, int rokWydania,String wydawnictwo)
    {
        this.tytuł = tytuł;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
    }

    @Override
    public void wypiszPodstawoweInfo() {
        System.out.println(tytuł + rokWydania + wydawnictwo);
    }

    @Override
    public void wypiszRozszerzoneInfo() {
        System.out.println("Książka to " + tytuł + ", została wydana " + rokWydania + " a jej wydawnictwo to " + wydawnictwo);

    }
}
