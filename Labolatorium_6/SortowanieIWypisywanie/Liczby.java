package Labolatorium_6.SortowanieIWypisywanie;

import java.util.Arrays;
import java.util.Collections;

public class Liczby implements Wypisywanie,Sortowanie{

    Integer tabLiczb[] = {4,4,-3,654,-53,2,0,-24,5,57};

    @Override
    public void sortujRosnąco() {
        Arrays.sort(tabLiczb);
    }

    @Override
    public void sortujMalejąco() {
        Arrays.sort(tabLiczb, Collections.reverseOrder());
    }

    @Override
    public void wypiszInfo() {
        for(int i : tabLiczb)
        {
            System.out.print(i + " ");
        }
    }
}
