public class NimGame292 {

    static class Solution {
        boolean canWinNim(int n) {
            return n % 4 != 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canWinNim(4));
        System.out.println(solution.canWinNim(7));
    }
}
