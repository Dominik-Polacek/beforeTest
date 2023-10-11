package doucko;

import java.util.Arrays;

public class MatrixChars {
    public static void main(String[] args) {
        //Najdi mi lichý indexi = každý druhý písmeno
        String[] lines = new String[] {"ahoj, mami"};

        System.out.println(Arrays.toString(cutThrough2(lines)));
    }
    public static String[] cutThrough2(String[] input) {
        String[] result = new String[input.length];

        for(int wordIndex = 0; wordIndex < input.length; wordIndex++) {
            //radky.... slova

            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < input[wordIndex].length(); i += 2) {
                //znaky
                sb.append(input[wordIndex].charAt(i));
            }

            result[wordIndex] = sb.toString();
        }

        return result;
    }
}
