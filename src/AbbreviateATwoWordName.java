public class AbbreviateATwoWordName {
//    Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//    The output should be two capital letters with a dot separating them.
//    It should look like this:
//    Sam Harris => S.H
//    patrick feeney => P.F

    public static String abbrevName(String name) {
        StringBuilder initials = new StringBuilder();
        String[] words = name.split(" ");

        if (words.length >= 2) {
            // Take the first character of the first word and append it to the result in uppercase
            initials.append(Character.toUpperCase(words[0].charAt(0)));
            //append dot.
            initials.append('.');
            // Take the first character of the second word and append it to the result in uppercase
            initials.append(Character.toUpperCase(words[1].charAt(0)));
        }

        return initials.toString();
    }
}
