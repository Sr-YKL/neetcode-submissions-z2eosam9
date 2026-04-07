class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> arrays = new ArrayList<>();
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < nums.length; j++){
                arrays.add(nums[j]);
            }
        }
        return arrays.stream().mapToInt(Integer::intValue).toArray();
    }
}