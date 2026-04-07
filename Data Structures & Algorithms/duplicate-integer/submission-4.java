class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        Boolean hasDuplicate = false;
        for(int i = 0; i < nums.length; i++){
            Boolean containts = map.get(nums[i]);
            if (containts != null){
                hasDuplicate = true;
                break;  
            }else{
                map.put(nums[i],false);
            }
        }
        return hasDuplicate;
    }
}