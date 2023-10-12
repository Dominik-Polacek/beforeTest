public class FindVowelsInString {

    //najdi souhlasky ve slově - stringu
    public static void main(String[] args) {
        String s = "ahoj ty blazinku";
        System.out.println(getCount(s));
    }

    public static int getCount(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if ((s == 'a') || (s == 'e') || (s == 'i') || (s == 'o') || (s == 'u')) {
                count++;
            }
        }
        return count;
    }
}
