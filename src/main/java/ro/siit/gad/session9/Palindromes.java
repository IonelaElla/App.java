package ro.siit.gad.session9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Palindromes {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("luna");
        words.add("sus");
        words.add("jos");

        words.stream()
                .filter(word -> isPalindrom(word))
                .forEach(System.out::println);
    }

    public static boolean isPalindrom(String word){
        word = word.toUpperCase();
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
