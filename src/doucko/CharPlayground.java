package doucko;

import java.util.*;

public class CharPlayground {
    public static void main(String[] args) {
        String s = "yrau aorien r0923328 4-12834 -013131";
        System.out.println(lameNumberFinder(s));
        System.out.println(gigaChadNumberFinder(s));

//        long t0 = new Date().getTime();
//        for (int i = 0; i < 1000000; i++) {
//            lameNumberFinder(s);
//        }
//        System.out.println(new Date().getTime() - t0);
//
//        t0 = new Date().getTime();
//        for (int i = 0; i < 1000000; i++) {
//            gigaChadNumberFinder(s);
//        }
//        System.out.println(new Date().getTime() - t0);






        //znak po znaku
        //je aktualni znak cislo?
        // ano
        // prevedu ho na cislo
        // zakladam novy cislo
        // nasleduje cislo? --> x10 + aktualni cislo
        // nenasleduje cislo? novy vkladam do listu nalezenych cisel
        // sortuju nalezeny cisla, vracim posledni
    }
    //najdi mi nejdelší číslo ve stringu
    private static long lameNumberFinder(String s) {
        List<Long> found = new ArrayList<>();
        long currentNumber = 0;

        for(char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber *= 10;
                currentNumber += Character.getNumericValue(ch);
                found.add(currentNumber);
            } else {
                currentNumber = 0;
            }
        }

        Collections.sort(found);

        return found.get(found.size() - 1);
    }

    //najdi mi největší číslo

    private static long gigaChadNumberFinder(String s) {
        long gigaChad = 0;
        long currentNumber = 0;

        for(char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber *= 10;
                currentNumber += Character.getNumericValue(ch);
                if (currentNumber > gigaChad) {
                    gigaChad = currentNumber;
                }
            } else {
                currentNumber = 0;
            }
        }
        return gigaChad;
    }
}
