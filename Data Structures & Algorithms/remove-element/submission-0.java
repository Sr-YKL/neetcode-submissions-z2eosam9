class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            if (nums[left] != val){
                left++;
            }else if(nums[right] != val){
                nums[left++] = nums[right--];
            }else{
                right--;
            } 
        }
        return left;
    }
}