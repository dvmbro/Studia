package Labolatorium_4;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //DEKLARACJA CZYTELNIKÓW
        Czytelnik info = new Czytelnik();
        Czytelnik user1 = new Czytelnik();
        Czytelnik user2 = new Czytelnik();
        Czytelnik user3 = new Czytelnik();
        Czytelnik user4 = new Czytelnik();
        Czytelnik user5 = new Czytelnik();
        Czytelnik user6 = new Czytelnik();
        Czytelnik user7 = new Czytelnik();
        Czytelnik user8 = new Czytelnik();
        Czytelnik user9 = new Czytelnik();
        Czytelnik user10 = new Czytelnik();

        user1.addUser("Kacper","Dabrowski","1","3");
        user2.addUser("Kinga","Zielińska","2","5");
        user3.addUser("Piotr","Chochla","3","0");
        user4.addUser("Wojciech","Róża","4","10");
        user5.addUser("Zuzanna","Wanna","5","1");
        user6.addUser("Damian","Wrzos","6","2");
        user7.addUser("Aleksandra","Marmolada","7","1");
        user8.addUser("Michał","Sielski","8","10");
        user9.addUser("Konrad","Miękki","9","0");
        user10.addUser("Borys","Kosztorys","10","8");

        Czytelnik tablica[] = new Czytelnik[10];
        tablica[0] = user1;
        tablica[1] = user2;
        tablica[2] = user3;
        tablica[3] = user4;
        tablica[4] = user5;
        tablica[5] = user6;
        tablica[6] = user7;
        tablica[7] = user8;
        tablica[8] = user9;
        tablica[9] = user10;


        System.out.println("########### MENU ############");
        System.out.println("1. Wyświetlanie informacji o czytelniku z podanym numerem karty bibliotecznej");
        System.out.println("2. Wyświetlanie informacji o wszystkich czytelnikach biblioteki");
        System.out.println("3. Wyświetlenie informacji o czytelnikach, którzy nie wypożyczyli żadnej książki");
        System.out.println("4. Wypożyczanie książek");
        System.out.println("5. Zwrot książek");

        int wybor;
        System.out.println("Co chcesz zrobic?");
        wybor = sc.nextInt();
        switch (wybor) {
            case 1: {
                System.out.println("Podaj numer karty czytelnika");
                String cardNumber = sc.next();
                info.showByCardNumber(tablica, cardNumber);
                break;
            }

            case 2: {
                info.showAllUsersData(tablica);
                break;
            }

            case 3: {
                info.noBooksBorrowed(tablica);
                break;
            }

            case 4: {
                System.out.println("Podaj numer karty czytelnika, który chce wypożyczyć książkę.");
                String cardNumber;
                cardNumber = sc.next();
                info.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę książek, które czytelnik chce wypożyczyć");
                String books;
                books = sc.next();
                info.borrowBooks(tablica,cardNumber,books);
                break;
            }

            case 5:
            {
                System.out.println("Podaj numer karty czytelnika, który chce oddać książkę.");
                String cardNumber;
                cardNumber = sc.next();
                info.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę książek, które czytelnik chce oddać");
                String books;
                books = sc.next();
                info.returnBooks(tablica,cardNumber,books);
                break;
            }

            default:
            {
                System.out.println("Podaj poprawną liczbę.");
            }
        }



    }
}
