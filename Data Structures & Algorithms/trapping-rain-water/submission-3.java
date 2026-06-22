class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int leftPointer = 0, rightPointer = height.length - 1;
        int leftMax = height[leftPointer], rightMax = height[rightPointer];
        int maxWater = 0;
        while (leftPointer < rightPointer) {
            if (leftMax < rightMax){
                leftPointer++;
                leftMax= Math.max(leftMax, height[leftPointer]);
                maxWater += leftMax - height[leftPointer];
            }else{
                rightPointer--;
                rightMax= Math.max(rightMax, height[rightPointer]);
                maxWater += rightMax - height[rightPointer];
            }
        }
        return maxWater;
    }
}
