package Labolatorium_4;

import java.util.Arrays;

public class Wektor {

    public String name;
    public double x;
    public double y;


    String getName() {
        return name;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void getinfo() {
        System.out.println("Nazwa: " + this.name);
        System.out.println("Współrzędna x: " + this.x);
        System.out.println("Współrzędna y: " + this.y + "\n-----------------------");
    }

    void printInfoByName(String name, Wektor tablica[]) {
        for(Wektor ity:  tablica)
        {
            if(ity.getName().equals(name))
            {
                System.out.println("Nazwa: " + ity.name);
                System.out.println("Współrzędna x: " + ity.x);
                System.out.println("Współrzędna y: " + ity.y + "\n-----------------------");
            }
        }
    }

    Wektor getInfoByName(String name, Wektor tablica[]) {
        for(Wektor ity:  tablica)
        {
            if(ity.getName().equals(name))
            {
                return ity;
            }
        }
        Wektor sth = new Wektor();
        sth.addVector("a", 0, 1);
        return sth;
    }

    void addVector(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    void showInfoByName(String vectorName, Wektor tablica[]) {
        for (Wektor ity : tablica) {
            if (ity.getName().equals(vectorName)) {
                ity.getinfo();
            }
        }
    }

    double calculateVectorLengthByName(String vectorName, Wektor[] tablica) {
        double wynik;
        for (Wektor ity : tablica) {
            if (ity.getName().equals(vectorName)) {
                ity.getinfo();
                double x, y;
                x = ity.getX();
                y = ity.getY();
                wynik = Math.sqrt(x * x + y * y);
                return wynik;
            }
        }
        return 0;
    }

    double calculateVectorLength() {
        double wynik;
        double x, y;
        x = this.getX();
        y = this.getY();
        wynik = Math.sqrt(x * x + y * y);
        return wynik;
    }

    void pararellToX(Wektor[] tablica)
    {
        for (Wektor ity : tablica) {
            String y = String.valueOf(ity.getY());
            if (ity.getY()==0)
            {
                ity.getinfo();
            }
        }
    }

    void pararellToY(Wektor[] tablica)
    {
        for (Wektor ity : tablica) {
            String x = String.valueOf(ity.getX());
            if (ity.getX()==0)
            {
                ity.getinfo();
            }
        }
    }

    void sortAllByLength(Wektor[] tablica)
    {
        double wynik;
        int i = 0;
        Double tab[] = new Double[15];
        for (Wektor ity : tablica)
        {
            {
                tab[i] = ity.calculateVectorLength();
                i++;
            }
        }


        Arrays.sort(tab); //sortowanie tablicy od najmniejszej do najwiekszej wartosci

        i = 0;
        for (Wektor ity : tablica)
        {
            for(Wektor jty : tablica)
            {
                if (jty.calculateVectorLength() == (tab[i]))
                {
                    System.out.println("Długość wektora: " + jty.calculateVectorLength());
                    jty.getinfo();
                }
            }
            i++;
        }
    }

    double scalarMultiply(Wektor vectorA, Wektor vectorB)
    {
        double xa,xb,ya,yb;
        xa = vectorA.getX();
        xb = vectorB.getX();
        ya = vectorA.getY();
        yb = vectorB.getY();
        return (xa*xb) + (ya*yb);
    }



}
