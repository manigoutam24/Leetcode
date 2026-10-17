class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int num = n;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        int x = num - rev;
        return Math.abs(x);
    }
}