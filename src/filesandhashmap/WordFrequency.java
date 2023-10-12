package filesandhashmap;
//Write a function that takes any string as a parameter and returns me a map
// where there is always a word - word frequency in the text. For example:
//input: This is realy very very nice sentence, it is realy good for practice!'

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;

public class WordFrequency {

    public static void main(String[] args) {
        String input = "This is really very very nice sentence, it is really good for practice!";
        String[] words = input.split("[^a-zA-Z0-9\\-]+"); //odebírám všechny znaky(krom uvedené v regexu)
        System.out.println(Arrays.toString(words));
        System.out.println(wordMap(input));
        System.out.println(wordMap2(input));

    }

    public static HashMap<String, Integer> wordMap(String input) {
        HashMap<String, Integer> frequentWordMap = new HashMap<>();

        String[] words = input.split("\\W+");

        //obojí funguje stejně
        for (String s : words) {
            frequentWordMap.putIfAbsent(s, 0);
            frequentWordMap.replace(s, frequentWordMap.get(s) + 1);
        }

        //funkční kód, kterej je stejný jak ten první
//        for (String s : words) {
//            if (frequentWordMap.containsKey(s)) {
//                frequentWordMap.put(s, frequentWordMap.get(s) + 1);
//            } else {
//                frequentWordMap.put(s, 1);
//            }
//        }
        return frequentWordMap;

    }

    public static HashMap<String, Integer> wordMap2(String input) {
        //uložím si funkci předchozího cvičení do nové mapy
        HashMap<String, Integer> frequentWordMap1 = wordMap(input);
        HashMap<String, Integer> frequentWordMap2 = new HashMap<>();

        for (String key : frequentWordMap1.keySet()) {
            if (frequentWordMap1.get(key) == 2) {
                frequentWordMap2.put(key, frequentWordMap1.get(key));
            }
        }
        return frequentWordMap2;
    }
}
