class Solution {
    public int findMin(int[] a) {
        int low = 0;
        int high = a.length - 1;

        if (a[low] < a[high])
            return a[low];

        while (low < high) {
            int mid = low + (high - low) / 2;

            // if (a[mid] == mid)
            //     return mid;

            // else 
            if (a[mid] <= a[high])
                high = mid;
            else
                low = mid + 1;
        }
        return a[low];
    }
}