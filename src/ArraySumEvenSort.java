import java.util.Arrays;
import java.util.Collections;

public class ArraySumEvenSort {
    public static void main(String[] args) {
        int[] evenArray = {0, 1, 3, 8, 4, 6, 9};
        System.out.println(Arrays.toString(doubleEvenMember(evenArray, "even")));
        System.out.println(Arrays.toString(sortArray(evenArray)));


    }
        // 1. krok = vem každej sudej index a vynásob ho 2.
        // 2. krok = vyber si, jestli vezmeš lichej či sudej index a udělej to stejný
    public static int[] doubleEvenMember(int[] array, String oddOrEven) {
        for (int i = 0; i < array.length; i++) {
            if ((i % 2 == 0 && oddOrEven.equals("even")) || (i % 2 == 1) && oddOrEven.equals("odd")) {
                array[i] *= 2;
            }
        }
        //Arrays.sort(array);
        return array;
    }
    //3. krok = SORTNI MI LIST OD NEJVĚTŠÍHO PO NEJMENŠÍ
    public static int[] sortArray(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array [i - 1] < array[i]){
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return array;
    }
}
