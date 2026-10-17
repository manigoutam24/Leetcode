class Solution {
    public int countDigits(int num) {
        int rev = num;
        int count = 0;

        while (num > 0) {
            int ld = num % 10;
            if (rev % ld == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}