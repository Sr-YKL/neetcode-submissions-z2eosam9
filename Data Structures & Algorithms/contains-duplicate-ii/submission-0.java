class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> duplicates = new HashSet<>();
        int left = 0;
        for(int right = 0; right <= nums.length -1 ; right++){
            if(k < Math.abs(right-left)){
                duplicates.remove(nums[left]);
                left++;
            }
            if (duplicates.contains(nums[right])){
                return true;
            }
            duplicates.add(nums[right]);
        }
        return false;
    }
}