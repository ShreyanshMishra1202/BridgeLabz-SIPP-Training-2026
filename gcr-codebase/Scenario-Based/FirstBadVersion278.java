public class FirstBadVersion278 {

    static class VersionControl {
        private final int firstBad;

        VersionControl(int firstBad) {
            this.firstBad = firstBad;
        }

        boolean isBadVersion(int version) {
            return version >= firstBad;
        }
    }

    static class Solution extends VersionControl {
        Solution(int firstBad) {
            super(firstBad);
        }

        int firstBadVersion(int n) {
            int left = 1;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution(4);
        System.out.println(solution.firstBadVersion(10));
    }
}
