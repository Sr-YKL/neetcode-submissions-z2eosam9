class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int size = 0;
        int left = 0;
        long sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            if (right - left + 1 == k) {
                if (sum >= (long) k * threshold) {
                    size++;
                }
                sum -= arr[left];
                left++;
            }
        }

        return size;
    }
}