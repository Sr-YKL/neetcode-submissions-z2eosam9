class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;
        int[] indexes = new int[2]; 
        while(left < right){
            int temp = target - numbers[right];
            if (numbers[left] < temp){
                left++;
                continue;
            }
            if (numbers[left] > temp){
                right--;
                continue;
            }
            indexes[0] = left+1;
            indexes[1] = right+1;
            break;
        }
        return indexes;
    }
}
