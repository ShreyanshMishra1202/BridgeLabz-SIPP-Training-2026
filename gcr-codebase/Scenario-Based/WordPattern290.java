import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {

    static class Solution {
        boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if (pattern.length() != words.length) {
                return false;
            }

            Map<Character, String> map = new HashMap<>();
            Map<String, Character> reverse = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char ch = pattern.charAt(i);
                String word = words[i];

                if (map.containsKey(ch) && !map.get(ch).equals(word)) {
                    return false;
                }
                if (reverse.containsKey(word) && reverse.get(word) != ch) {
                    return false;
                }

                map.put(ch, word);
                reverse.put(word, ch);
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
        System.out.println(solution.wordPattern("abba", "dog cat cat fish"));
    }
}
