package Labolatorium_5;

public class Czytelnik {

    public String firstName;
    public String secondName;
    public String cardNumber;
    public String booksBorrowed;




    //PRZECIAZANIE

    public Czytelnik(String firstName, String secondName, String cardNumber, String booksBorrowed)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this. cardNumber = cardNumber;
        this. booksBorrowed = booksBorrowed;
    }

    public  Czytelnik(String firstName, String secondName, String cardNumber)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this. cardNumber = cardNumber;
    }

    public  Czytelnik(String firstName, String secondName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public  Czytelnik(String firstName)
    {
        this.firstName = firstName;
    }


    public Czytelnik() {

    }

    public void addUser(String imie, String nazwisko, String numerKarty, String ksiazki)
    {
        this.firstName = imie;
        this.secondName = nazwisko;
        this.cardNumber = numerKarty;
        this.booksBorrowed = ksiazki;
    }

    public void showUserData()
    {
        System.out.println("Imię: " + this.firstName);
        System.out.println("Nazwisko: " + this.secondName);
        System.out.println("Numer karty: " + this.cardNumber);
        System.out.println("Ilość wypożyczonych książek: " + this.booksBorrowed + "\n-----------------------");
    }

    public void showAllUsersData(Czytelnik tablica[]) {
        for (Czytelnik ity : tablica)
        {
            ity.showUserData();
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public String getBooksBorrowed()
    {
        return booksBorrowed;
    }

    public void noBooksBorrowed(Czytelnik tablica[])
    {
        for(Czytelnik ity : tablica)
        {
            if (ity.getBooksBorrowed().equals("0"))
            {
                ity.showUserData();
            }
        }
    }

    public void borrowBooks(Czytelnik[] tablica, String cardNumber, String books)
    {
        for(Czytelnik ity : tablica)
        {
            if(ity.getCardNumber().equals(cardNumber))
            {
                int wishesToBorrow = Integer.parseInt(books);
                int booksBorrowed = Integer.parseInt(ity.getBooksBorrowed());
                if(booksBorrowed + wishesToBorrow <= 10)
                {
                    System.out.println("Pomyślnie wypożyczono " + wishesToBorrow + " książek dla " + ity.getFirstName() + " " + ity.getSecondName());
                }
                else
                {
                    System.out.println(ity.getFirstName() + " " + ity.getSecondName() + " nie może wypożyczyć " + wishesToBorrow + " książek");

                }
            }
        }
    }

    public void returnBooks(Czytelnik[] tablica, String cardNumber, String books)
    {
        for(Czytelnik ity : tablica)
        {
            if(ity.getCardNumber().equals(cardNumber))
            {
                int wishesToReturn = Integer.parseInt(books);
                int booksBorrowed = Integer.parseInt(ity.getBooksBorrowed());
                if(booksBorrowed - wishesToReturn >= 0 )
                {
                    System.out.println("Pomyślnie zwrócono " + wishesToReturn + " książek dla " + ity.getFirstName() + " " + ity.getSecondName() + " .");
                }
                else
                {
                    System.out.println(ity.getFirstName() + " " + ity.getSecondName() + " nie może zwrócić " + wishesToReturn + " książek.");

                }
            }
        }
    }

    public void showByCardNumber(Czytelnik tablica[], String cardNumber)
    {
        for(Czytelnik ity : tablica)
        {
            if (ity.getCardNumber().equals(cardNumber))
            {
                ity.showUserData();
            }
        }
    }


}
