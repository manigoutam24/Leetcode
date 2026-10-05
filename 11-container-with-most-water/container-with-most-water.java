class Solution {
    public int maxArea(int[] a) {
        int start = 0;
        int end = a.length - 1;

        int maxArea = 0;

        while (start < end) {
            int l = end - start;
            int area;
            if (a[start] < a[end]) {
                area = l * a[start];
                start++;
            } else {
                area = l * a[end];
                end--;
            }

            if (maxArea < area)
                maxArea = area;
        }
        return maxArea;
    }
}