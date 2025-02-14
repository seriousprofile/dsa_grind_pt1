/*
in this question you have to first:
1. sort the intervals.
2. compare the last element of the first interval to the first ele of the current interval.
3. if last ele of first interval < first ele of current interval, no need to make changes. 
4. otherwise, overlap by changing the last ele of the first interval to the max element between the two last elements of the compared intervals. 
*/

class Solution {
    public int[][] merge(int[][] intervals) {

        //edge cases:
        if(intervals == null || intervals.length == 0){
            return intervals;
        }

        //sort array:
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        //LL is used as we have to access last element and that's possible using the .getLast() operation.
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        for(int[] curr : intervals){
            if(mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < curr[0]){
                mergedIntervals.add(curr);
            } else {
                mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], curr[1]);
            }
        }

        return mergedIntervals.toArray(new int[0][]);
    }
}
