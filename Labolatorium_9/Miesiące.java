package Labolatorium_9;

public class Miesiące {

    String nazwa_miesiaca;
    int ilosc_dni;

    public Miesiące(String nazwa_miesiaca, int ilosc_dni) {
        this.nazwa_miesiaca = nazwa_miesiaca;
        this.ilosc_dni = ilosc_dni;
    }

    @Override
    public String toString() {
        return "Miesiące{" +
                "nazwa_miesiaca='" + nazwa_miesiaca + '\'' +
                ", ilosc_dni=" + ilosc_dni +
                '}';
    }
}
