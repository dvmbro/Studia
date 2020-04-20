package Labolatorium_5;

public class WektorZaczepiony extends Wektor {

    Double xz;          //wspolrzedne punktu zaczepienia
    Double yz;




    void addVector(String name, double x, double y, double yz, double xz)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.xz = xz;
        this.yz = yz;
    }

    void addVector(String name, double x, double y)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.xz = null;
        this.yz = null;
    }

    void getinfo() {
        System.out.println("Nazwa: " + this.name);
        System.out.println("Współrzędna x: " + this.x);
        System.out.println("Współrzędna y: " + this.y);
        if(this.xz != null)  //każdy wektor inny niz z wpisanym punktem zaczepnym będzie posiadał wartość null w conajmniej wspolrzednej xz
        {
            System.out.println("Współrzędna x punktu zaczepienia: " + this.xz);
            System.out.println("Współrzędna y punktu zaczepienia: " + this.yz);
        }
        System.out.println("-----------------------");
    }

    void showInfoByName(String vectorName, WektorZaczepiony tablica[]) {
        for (WektorZaczepiony ity : tablica) {
            if (ity.getName().equals(vectorName)) {
                ity.getinfo();
            }
        }
    }

    void changexz(Double xz)
    {
        this.xz = xz;
        System.out.println(this.xz);
    }

    void changeyz(Double yz)
    {
        this.yz = yz;
        System.out.println(this.yz);
    }

    Double getxz()
    {
        if(this.xz != null) //każdy wektor inny niz z wpisanym punktem zaczepnym będzie posiadał wartość null w conajmniej wspolrzednej xz
        {
            return this.xz = xz;
        }
        return null;
    }

    Double getyz()
    {
        if(this.xz != null) //każdy wektor inny niz z wpisanym punktem zaczepnym będzie posiadał wartość null w conajmniej wspolrzednej xz
        {
            return this.yz;
        }
        return null;
    }

    void changeAnchorPoint(String vectorName, Double xz, Double yz, Wektor tablica[])
    {
        for(Wektor ity:  tablica)
        {
            if(ity.getName().equals(vectorName))
            {
                if(ity.getxz() != null) //każdy wektor inny niz z wpisanym punktem zaczepnym będzie posiadał wartość null w conajmniej wspolrzednej xz
                {
                    ity.changexz(xz);       //tu miałem problem ze zmienieniem wartości xz,yz dla itego elementu tablicy, gdyż nie każdy go posiada
                                            //aczkolwiek poradziłem sobie z tym problemem dodając kilka metod w WektorZaczepiony.java oraz Wektor.java.
                                            //zdaję sobię sprawę, że istnieje łatwiejszy sposób na wykonanie tej operacji.
                    ity.changeyz(yz);
                    System.out.println("Pomyślnie zmieniono punkt zaczepienia. Oto zaktualizowane dane: ");
                    ity.getinfo();
                }
                else
                System.out.println("Podany wektor nie posiada punktu zaczepienia.");
            }
        }
    }
}
