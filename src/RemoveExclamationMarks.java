public class RemoveExclamationMarks {
    //Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

    public static String removeExclamationMarks(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '!') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
