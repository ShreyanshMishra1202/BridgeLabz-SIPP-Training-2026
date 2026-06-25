import java.math.BigInteger;

public class AdditiveNumber306 {

    static class Solution {
        boolean isAdditiveNumber(String num) {
            int n = num.length();

            for (int i = 1; i <= n / 2; i++) {
                if (num.charAt(0) == '0' && i > 1) {
                    break;
                }

                for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                    if (num.charAt(i) == '0' && j > 1) {
                        break;
                    }

                    BigInteger first = new BigInteger(num.substring(0, i));
                    BigInteger second = new BigInteger(num.substring(i, i + j));

                    if (isValid(first, second, i + j, num)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isValid(BigInteger first, BigInteger second, int start, String num) {
            if (start == num.length()) {
                return false;
            }

            while (start < num.length()) {
                BigInteger sum = first.add(second);
                String sumString = sum.toString();

                if (!num.startsWith(sumString, start)) {
                    return false;
                }

                start += sumString.length();
                first = second;
                second = sum;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAdditiveNumber("112358"));
        System.out.println(solution.isAdditiveNumber("199100199"));
        System.out.println(solution.isAdditiveNumber("1023"));
    }
}
