class Solution {
    // no duplicates, thats a
    // consecutive sequence +1 or -1
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : nums) uniqueNumbers.add(number);
        int longestPath = 0;
        for (int number : uniqueNumbers){
            Integer rightPath = number + 1, leftPath = number - 1;
            int counter = 0;
            System.out.println(counter);
            while (rightPath != null || leftPath != null){
                if (uniqueNumbers.contains(rightPath)){
                    rightPath++;
                }else{
                    rightPath = null;
                }
                if (uniqueNumbers.contains(leftPath)){
                    leftPath -= 1;
                }else{
                    leftPath = null;
                }
                counter++;
            }
            longestPath = Math.max(longestPath, counter); 
        }
        return longestPath;   
    }
}
