class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }

            else if (nums[i] > secMax && nums[i] < max) {
                thirdMax = secMax;
                secMax = nums[i];
            }

            else if (nums[i] > thirdMax && nums[i] < secMax) {
                thirdMax = nums[i];
            }

        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thirdMax;
    }
}