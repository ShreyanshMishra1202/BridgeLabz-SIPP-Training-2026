public class BulbSwitcher319 {

    static class Solution {
        int bulbSwitch(int n) {
            return (int) Math.sqrt(n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.bulbSwitch(3));
        System.out.println(solution.bulbSwitch(10));
    }
}
