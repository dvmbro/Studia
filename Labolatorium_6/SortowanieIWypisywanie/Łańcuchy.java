package Labolatorium_6.SortowanieIWypisywanie;

import java.util.Arrays;
import java.util.Comparator;

public class Łańcuchy implements Wypisywanie,Sortowanie{

    String tabŁańcuchów[] = {"dsg","fdsfsd","asd","wa","a","fsdfsdffsd","erwefsdv;ak"};

    @Override
    public void sortujRosnąco() {
        Arrays.sort(tabŁańcuchów,new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                return s1.length() - s2.length();
            }
        });
    }

    @Override
    public void sortujMalejąco() {
        Arrays.sort(tabŁańcuchów,new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                return s2.length() - s1.length();
            }
        });
    }

    @Override
    public void wypiszInfo() {
        for(String i : tabŁańcuchów)
        {
            System.out.print(i + " ");
        }
    }
}
