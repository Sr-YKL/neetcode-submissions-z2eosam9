class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, total = Integer.MAX_VALUE;
        int temp = 0;
        for(int right = 0; right <= nums.length - 1;right++){
            temp = nums[right] + temp;
            while(temp >= target){
                System.out.println(temp);
                total = Math.min(total,right - left + 1);
                temp = temp - nums[left];
                left++;
            }
        }
        if(total == Integer.MAX_VALUE){
            return 0;
        }
        return total;

    }
}