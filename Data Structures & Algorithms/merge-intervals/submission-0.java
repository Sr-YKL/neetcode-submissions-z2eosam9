class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] mergedIntervals = new int[intervals.length][2];
        Arrays.sort(intervals, (start,end) -> start[0] - end[0]);
        int size = 0;
        for(int[] interval: intervals){
            if(size == 0){
                mergedIntervals[size][0] = interval[0];
                mergedIntervals[size][1] = interval[1];
                size++;
                continue;
            }
            if(interval[0] > mergedIntervals[size-1][1]){
                mergedIntervals[size][0] = interval[0];
                mergedIntervals[size][1] = interval[1];
                size++;
                continue;
            }if(interval[1] > mergedIntervals[size-1][1]){
                mergedIntervals[size-1][1] = interval[1];
            }
        }
        return Arrays.copyOf(mergedIntervals,size);
    }
}
