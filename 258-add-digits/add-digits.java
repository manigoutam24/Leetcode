class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;

        int rev = 0;
        int sum = 0;

        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
            sum += ld;

            if (sum > 0) {
                int ld1 = sum % 10;
                rev = rev * 10 + ld1;
                sum /= 10;
                sum += ld1;
            }
        }

        return sum;
    }
}