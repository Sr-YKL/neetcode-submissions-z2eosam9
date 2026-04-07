class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int value = 0;
        for (int j = 0; j < ans.length; j++){
            if (value == nums.length) value = 0;
            ans[j] = nums[value++];
        }
        return ans;
    }
}