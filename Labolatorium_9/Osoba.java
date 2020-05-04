package Labolatorium_9;

public class Osoba {

    String imie;
    String nazwisko;
    int wiek;
    int wzrost;
    double waga;

    public Osoba(String imie, String nazwisko, int wiek, int wzrost, double waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public double getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", waga=" + waga +
                '}';
    }
}
