class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int k = arr.length - 1;

        int i = 0;
        int j = n - 1;

        while (i <= j) {

            if ((nums[i] * nums[i]) < (nums[j] * nums[j])) {
                arr[k] = nums[j] * nums[j];
                j--;
            } else {
                arr[k] = nums[i] * nums[i];
                i++;
            }

            k--;
        }

        return arr;
    }
}