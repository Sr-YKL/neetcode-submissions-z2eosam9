class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        for(int i = 0; i < nums.length; i++){
            int valueOne = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if (valueOne == nums[j]){
                    hasDuplicate = true;
                    break;
                }
         }
         if (hasDuplicate == true) break;
        }
        return hasDuplicate;
    }
}