package Labolatorium_5;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //DEKLARACJA CZYTELNIKÓW
        Czytelnik info = new Czytelnik();
        CzytelnikEkstra infoEkstra = new CzytelnikEkstra();
        CzytelnikEkstra user1 = new CzytelnikEkstra();
        CzytelnikEkstra user2 = new CzytelnikEkstra();
        CzytelnikEkstra user3 = new CzytelnikEkstra();
        CzytelnikEkstra user4 = new CzytelnikEkstra();
        CzytelnikEkstra user5 = new CzytelnikEkstra();
        CzytelnikEkstra user6 = new CzytelnikEkstra();
        CzytelnikEkstra user7 = new CzytelnikEkstra();
        CzytelnikEkstra user8 = new CzytelnikEkstra();
        CzytelnikEkstra user9 = new CzytelnikEkstra();
        CzytelnikEkstra user10 = new CzytelnikEkstra();

        user1.addUser("Kacper","Dabrowski","1","3",5);
        user2.addUser("Kinga","Zielińska","2","5");
        user3.addUser("Piotr","Chochla","3","0",2);
        user4.addUser("Wojciech","Róża","4","10",5);
        user5.addUser("Zuzanna","Wanna","5","1",0);
        user6.addUser("Damian","Wrzos","6","2");
        user7.addUser("Aleksandra","Marmolada","7","1");
        user8.addUser("Michał","Sielski","8","10",0);
        user9.addUser("Konrad","Miękki","9","0");
        user10.addUser("Borys","Kosztorys","10","8",9);

        CzytelnikEkstra tablica[] = new CzytelnikEkstra[10];
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
        System.out.println("6. Wypożyczanie czasopism");
        System.out.println("7. Zwrot czasopism");

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
                infoEkstra.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę książek, które czytelnik chce wypożyczyć");
                String books;
                books = sc.next();
                infoEkstra.borrowBooks(tablica,cardNumber,books);
                break;
            }

            case 5:
            {
                System.out.println("Podaj numer karty czytelnika, który chce oddać książkę.");
                String cardNumber;
                cardNumber = sc.next();
                infoEkstra.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę książek, które czytelnik chce oddać");
                String books;
                books = sc.next();
                infoEkstra.returnMagazines(tablica,cardNumber,books);
                break;
            }

            case 6:
            {
                System.out.println("Podaj numer karty czytelnika, który chce wypożyczyć czasopismo.");
                String cardNumber;
                cardNumber = sc.next();
                infoEkstra.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę czasopism, które czytelnik chce wypożyczyć");
                String books;
                books = sc.next();
                infoEkstra.borrowMagazines(tablica,cardNumber,books);
                break;
            }

            case 7:
            {
                System.out.println("Podaj numer karty czytelnika, który chce oddać czasopismo.");
                String cardNumber;
                cardNumber = sc.next();
                infoEkstra.showByCardNumber(tablica,cardNumber);
                System.out.println("Podaj liczbę czasopism, które czytelnik chce oddać");
                String books;
                books = sc.next();
                infoEkstra.returnBooks(tablica,cardNumber,books);
                break;
            }

            default:
            {
                System.out.println("Podaj poprawną liczbę.");
            }
        }



    }
}
