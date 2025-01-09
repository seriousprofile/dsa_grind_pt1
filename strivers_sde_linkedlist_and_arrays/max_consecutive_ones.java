class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxc = 0; //maximum count of 1s that is to be returned.
        int count_rn = 0; //count while traversing through the array

        for(int x : nums){ 
            if(x == 1){ 
                count_rn++; //only 1s are added to the counter.
                maxc = Math.max(maxc, count_rn); //update with the biggest number
            } else {
                count_rn = 0; //reset the counter if there's a bigger number for maxc
            }
        }

        return maxc;
    }
}
