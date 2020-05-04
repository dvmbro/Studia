package Labolatorium_9;

import java.util.Objects;

public class Wynagrodzenia {
    String nazwisko;
    int stawka;

    public Wynagrodzenia(String nazwisko, int stawka) {
        this.nazwisko = nazwisko;
        this.stawka = stawka;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Wynagrodzenia{" +
                "nazwisko='" + nazwisko + '\'' +
                ", stawka=" + stawka +
                '}';
    }
}
