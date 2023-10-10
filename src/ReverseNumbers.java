import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {
        int num = 1532;
        System.out.println(sortDesc(num));
    }

    //VEM pole čísel a seskládej mi z toho největší číslo.. např - 1532 = 5321
    public static int sortDesc(int num) {
        String numString = Integer.toString(num); //převedu si int do Stringu
        char[] digits = numString.toCharArray(); //převedu si string na pole charu
        Arrays.sort(digits); // seřaď pole od nejmenšího po největší

        //reverzni mi seřazené pole
        char[] reversedDigits = new char[digits.length];
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        //převeď mi String na Int
        int result = Integer.parseInt(new String(reversedDigits));
        return result;
    }
}
