import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> morseMap = new HashMap<>(
                Map.ofEntries(
                        Map.entry(".-",   "a"), Map.entry("-...", "b"), Map.entry("-.-.", "c"),
                        Map.entry("-..",  "d"), Map.entry(".",    "e"), Map.entry("..-.", "f"),
                        Map.entry("--.",  "g"), Map.entry("....", "h"), Map.entry("..",   "i"),
                        Map.entry(".---", "j"), Map.entry("-.-",  "k"), Map.entry(".-..", "l"),
                        Map.entry("--",   "m"), Map.entry("-.",   "n"), Map.entry("---",  "o"),
                        Map.entry(".--.", "p"), Map.entry("--.-", "q"), Map.entry(".-.",  "r"),
                        Map.entry("...",  "s"), Map.entry("-",    "t"), Map.entry("..-",  "u"),
                        Map.entry("...-", "v"), Map.entry(".--",  "w"), Map.entry("-..-", "x"),
                        Map.entry("-.--", "y"), Map.entry("--..", "z")
                ));
        
        String[] letterArr = letter.split(" ");
        StringBuilder res = new StringBuilder();
        for(String let : letterArr) {
            res.append(morseMap.get(let));
        }
        
        return res.toString();
    }
}