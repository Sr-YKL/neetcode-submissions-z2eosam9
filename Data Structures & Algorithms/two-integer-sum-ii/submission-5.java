class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indexes = new int[2]; 
        for (int i=0;i <= numbers.length -1;i++){
            for (int j=i+1; j <= numbers.length -1; j++){
                int one = numbers[i];
                int two = numbers[j];
                if (one + two == target){
                    indexes[0] = i+1;
                    indexes[1] = j+1;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}
