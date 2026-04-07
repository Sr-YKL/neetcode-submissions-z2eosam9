class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        Deque<Integer> dq = new ArrayDeque<>();
        int count = 0;
        long sum = 0;

        for (int right = 0; right < arr.length; right++) {
            dq.addLast(arr[right]);
            sum += arr[right];

            if (dq.size() == k) {
                if (sum >= (long) k * threshold) {
                    count++;
                }
                sum -= dq.pollFirst();
            }
        }

        return count;
    }
}