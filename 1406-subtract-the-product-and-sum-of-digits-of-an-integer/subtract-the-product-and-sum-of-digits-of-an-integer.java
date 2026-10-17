class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int rev = 0;
        int result = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;

            //Sum of All Digit
            sum += ld;

            //Product of All Digit
            product *= ld;
        }
        result = product - sum;

        return result;
    }
}