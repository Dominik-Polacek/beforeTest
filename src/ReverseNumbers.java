public class ReverseNumbers {

    //If I have number like .. 5662 - give me reverse of it = 2665.
    public static int sortDesc(int num) {
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }
}
