public class RemoveExclamationMarks {
    //Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

    public static String removeExclamationMarks(String s) {
        StringBuilder result = new StringBuilder();
        //projdi forloop pro každý znak(c) ve Stringu s a kontroluj, jestli se nerovná znaku !
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '!') {         //pokud se nerovná, přidej ho do result
                result.append(c);
            }
        }
        return result.toString();
    }
}
