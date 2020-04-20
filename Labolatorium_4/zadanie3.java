package Labolatorium_4;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {


        Wektor info = new Wektor();
        Wektor wektor1 = new Wektor();
        Wektor wektor2 = new Wektor();
        Wektor wektor3 = new Wektor();
        Wektor wektor4 = new Wektor();
        Wektor wektor5 = new Wektor();
        Wektor wektor6 = new Wektor();
        Wektor wektor7 = new Wektor();
        Wektor wektor8 = new Wektor();
        Wektor wektor9 = new Wektor();
        Wektor wektor10 = new Wektor();
        Wektor wektor11 = new Wektor();
        Wektor wektor12 = new Wektor();
        Wektor wektor13 = new Wektor();
        Wektor wektor14 = new Wektor();
        Wektor wektor15 = new Wektor();

        wektor1.addVector("a", 0, 1);
        wektor2.addVector("b", 2.4, 10);
        wektor3.addVector("c", 5.3, 12);
        wektor4.addVector("d", 2, 1.2);
        wektor5.addVector("e", 2, 4);
        wektor6.addVector("f", 1, 3);
        wektor7.addVector("g", 0, 0);
        wektor8.addVector("h", 34, 2.5);
        wektor9.addVector("i", 7.4, 5.3);
        wektor10.addVector("j", 5.8, 42);
        wektor11.addVector("k", 43.23, 0);
        wektor12.addVector("l", 0, 7.10);
        wektor13.addVector("m", 1.51, 5.54);
        wektor14.addVector("n", 5.4, 3.102);
        wektor15.addVector("o", 5.762, 0);

        Wektor tablica[] = new Wektor[15];
        tablica[0] = wektor1;
        tablica[1] = wektor2;
        tablica[2] = wektor3;
        tablica[3] = wektor4;
        tablica[4] = wektor5;
        tablica[5] = wektor6;
        tablica[6] = wektor7;
        tablica[7] = wektor8;
        tablica[8] = wektor9;
        tablica[9] = wektor10;
        tablica[10] = wektor11;
        tablica[11] = wektor12;
        tablica[12] = wektor13;
        tablica[13] = wektor14;
        tablica[14] = wektor15;


        System.out.println("##############   MENU   #############");
        System.out.println("1. Wyświetlanie informacji o wektorach.");
        System.out.println("2. Obliczenie długości wektora.");
        System.out.println("3. Wyświetlenie wektorów, które są równoległe do osi X.");
        System.out.println("4. Wyświetlenie wektorów, które są równoległe do osi Y.");
        System.out.println("5. Sortowanie wektorów względem ich długości (od najkrótszego do najdłuższego).");
        System.out.println("6. Obliczenie iloczynu skalarnego dwóch wybranych wektorów.");


        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt())
        {
            case 1:
            {
                System.out.println("Podaj nazwę wektora");
                String vectorName = sc.next();
                info.showInfoByName(vectorName, tablica);
                break;
            }

            case 2:
            {
                System.out.println("Podaj nazwę wektora");
                String vectorName = sc.next();
                System.out.println("Długość wektora " + vectorName + " to: " + info.calculateVectorLengthByName(vectorName,tablica));
                break;
            }

            case 3:
            {
                System.out.println("Wektory równoległe do osi X:\n");
                info.pararellToX(tablica);
                break;
            }

            case 4:
            {
                System.out.println("Wektory równoległe do osi Y:\n");
                info.pararellToY(tablica);
                break;
            }

            case 5:
            {
                System.out.println("Wektory posortowane po długości:");
                info.sortAllByLength(tablica);
                break;
            }

            case 6:
            {
                System.out.println("Podaj nazwy wektorów, które chcesz pomnożyć");
                String vectorA = sc.next();
                Wektor infoA = info.getInfoByName(vectorA,tablica);
                String vectorB = sc.next();
                Wektor infoB = info.getInfoByName(vectorB,tablica);
                info.printInfoByName(vectorA,tablica);
                info.printInfoByName(vectorB,tablica);
                System.out.println("Wynik mnożenia skalarnego wektora " + vectorA + " i " + vectorB + " wynosi: " + info.scalarMultiply(infoA,infoB));
                break;
            }

            default:
            {
                System.out.println("Podałeś złą liczbę.");
            }
        }
    }
}
