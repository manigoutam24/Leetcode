class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;
        int rev = 0;
        int rev2 = 0;

        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }

        while (rev > 0) {
            int ld = rev % 10;
            rev2 = rev2 * 10 + ld;
            rev /= 10;
        }

        if (rev2 != original) {
            return false;
        }

        return true;
    }
}