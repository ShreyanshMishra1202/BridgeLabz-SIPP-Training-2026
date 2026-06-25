import java.util.Arrays;

public class SuperUglyNumber313 {

    static class Solution {
        int nthSuperUglyNumber(int n, int[] primes) {
            int[] ugly = new int[n];
            ugly[0] = 1;

            int k = primes.length;
            int[] indices = new int[k];
            int[] nextValues = Arrays.copyOf(primes, k);

            for (int i = 1; i < n; i++) {
                int nextUgly = nextValues[0];
                for (int value : nextValues) {
                    nextUgly = Math.min(nextUgly, value);
                }

                ugly[i] = nextUgly;

                for (int j = 0; j < k; j++) {
                    if (nextValues[j] == nextUgly) {
                        indices[j]++;
                        nextValues[j] = ugly[indices[j]] * primes[j];
                    }
                }
            }

            return ugly[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nthSuperUglyNumber(12, new int[] {2, 7, 13, 19}));
    }
}
