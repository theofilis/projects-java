package gr.theofilis.piglatin;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Theofilis
 */
public class BigLatin {

    private static Set<Character> consonants;

    private static Set init() {
        consonants = new HashSet<Character>();

        for (char letter : "bcdfghjklmnpqrstvwxyz".toCharArray()) {
            consonants.add(letter);
        }

        return consonants;
    }

    public static String encode(String word) {
        init();

        char firstLetter = word.toLowerCase().charAt(0);
        String pigLatin = "";
        Boolean consonantFirst = false;
        StringBuilder consonantCluster = new StringBuilder();

        if (consonants.contains(firstLetter)) {
            consonantFirst = true;
            consonantCluster.append(firstLetter);
            for (char letter : word.replaceFirst(String.valueOf(word.charAt(0)), "").toCharArray()) {
                if (!consonants.contains(letter)) {
                    break;
                } else {
                    consonantCluster.append(letter);
                }
            }
            pigLatin = word.replaceFirst(consonantCluster.toString(), "") + consonantCluster.toString() + "ay";
        }

        if (consonantFirst == false) {
            pigLatin = word + "way";
            System.out.println(pigLatin);
        }

        return pigLatin;
    }
}
