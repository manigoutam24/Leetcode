class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;

        if (n == 1)
            return true;

        for (int i = 1; i < 31; i++) {
            long ans = (long) Math.pow(3, i);

            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}