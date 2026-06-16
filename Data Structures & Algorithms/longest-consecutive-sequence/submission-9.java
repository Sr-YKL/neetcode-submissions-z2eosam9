class Solution {
    // no duplicates, thats a
    // consecutive sequence +1 or -1
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int number : nums) numSet.add(number);
        int longest = 0;
        for (int num : numSet){
            if (!numSet.contains(num-1)){
            int length = 1;
                while (numSet.contains(num + length)){
                    length++;
                }
            longest = Math.max(longest, length); 
            }
        }
        return longest;   
    }
}
