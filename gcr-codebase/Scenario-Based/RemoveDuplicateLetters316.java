public class RemoveDuplicateLetters316 {

    static class Solution {
        String removeDuplicateLetters(String s) {
            int[] frequency = new int[26];
            boolean[] inResult = new boolean[26];
            StringBuilder stack = new StringBuilder();

            for (char ch : s.toCharArray()) {
                frequency[ch - 'a']++;
            }

            for (char ch : s.toCharArray()) {
                int idx = ch - 'a';
                frequency[idx]--;

                if (inResult[idx]) {
                    continue;
                }

                while (stack.length() > 0) {
                    char top = stack.charAt(stack.length() - 1);
                    if (top > ch && frequency[top - 'a'] > 0) {
                        inResult[top - 'a'] = false;
                        stack.deleteCharAt(stack.length() - 1);
                    } else {
                        break;
                    }
                }

                stack.append(ch);
                inResult[idx] = true;
            }

            return stack.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters("bcabc"));
        System.out.println(solution.removeDuplicateLetters("cbacdcbc"));
    }
}
