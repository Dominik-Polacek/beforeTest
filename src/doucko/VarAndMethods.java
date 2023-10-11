package doucko;

import java.util.Arrays;

public class VarAndMethods {
    public static void main(String[] args) {
        String s = "Lukas";
        String[] array = {s, "Ales", "David", "Karel"};
        callName(array);

    }

    public static String callName(String[] s) {
        String output = "GFA";
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + 1 + "." + "-".repeat(i + 1) + s[i]);
        }
        return output;
    }

    public static double sum(double[] numbers) {

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int[] digitize(long n) {
        String numString = String.valueOf(n);
        int digits[] = new int[numString.length()];

        int counter = 0;
        for (int i = numString.length() - 1; i >= 0; i--) {
            digits[i] = Integer.parseInt(Character.toString(numString.charAt(counter++)));
        }
        return digits;
    }

    public static String updateLight(String current) {
        String green = "green";
        String red = "red";
        String yellow = "yellow";

        if (current.equals(red)) {
            return green;
        } else if (current.equals(green)) {
            return yellow;
        }
        return red;
    }

    //Input: 42145 Output: 54421
    public static int sortDesc(int num) {
        String numString = Integer.toString(num);
        char[] digits = numString.toCharArray();
        Arrays.sort(digits);

        char[] reversedDigits = new char[digits.length];
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        int result = Integer.parseInt(new String(reversedDigits));
        return result;
    }


}
