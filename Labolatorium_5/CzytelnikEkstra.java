package Labolatorium_5;


public class CzytelnikEkstra extends Czytelnik {

    int magazinesBorrowed;


    public int getMagazinesBorrowed() {
        return magazinesBorrowed;
    }

    public void addUser(String imie, String nazwisko, String numerKarty, String ksiazki, int czasopisma) {
        this.firstName = imie;
        this.secondName = nazwisko;
        this.cardNumber = numerKarty;
        this.booksBorrowed = ksiazki;
        this.magazinesBorrowed = czasopisma;
    }

    public void showUserData() {
        System.out.println("Imię: " + this.firstName);
        System.out.println("Nazwisko: " + this.secondName);
        System.out.println("Numer karty: " + this.cardNumber);
        System.out.println("Ilość wypożyczonych książek: " + this.booksBorrowed);
        System.out.println("Ilość wypożyczonych czasopism: " + this.magazinesBorrowed + "\n-----------------------");
    }

    public void borrowMagazines(CzytelnikEkstra[] tablica, String cardNumber, String books) {

        for (CzytelnikEkstra ity : tablica) {
            if (ity.getCardNumber().equals(cardNumber)) {
                int wishesToBorrow = Integer.parseInt(books);
                if (ity.getMagazinesBorrowed() + wishesToBorrow <= 5) {
                    System.out.println("Pomyślnie wypożyczono " + wishesToBorrow + " czasopism dla " + ity.getFirstName() + " " + ity.getSecondName());
                } else {
                    System.out.println(ity.getFirstName() + " " + ity.getSecondName() + " nie może wypożyczyć " + wishesToBorrow + " książek");

                }
            }
        }
    }


    public void returnMagazines(CzytelnikEkstra[] tablica, String cardNumber, String books) {
        for (Czytelnik ity : tablica) {
            if (ity.getCardNumber().equals(cardNumber)) {
                int wishesToReturn = Integer.parseInt(books);
                if (getMagazinesBorrowed() - wishesToReturn >= 0) {
                    System.out.println("Pomyślnie zwrócono " + wishesToReturn + " czasopism dla " + ity.getFirstName() + " " + ity.getSecondName() + " .");
                } else {
                    System.out.println(ity.getFirstName() + " " + ity.getSecondName() + " nie może zwrócić " + wishesToReturn + " czasopism.");

                }
            }
        }
    }


}


