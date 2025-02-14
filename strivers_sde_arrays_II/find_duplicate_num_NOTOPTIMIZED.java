/* sorted array for easier comparison. 
simply checked if prev element is the same as the current one! 
however this isn't optimized because TC is O(NlogN) and there's a way to get O(N) approach! */

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int repeatednum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] == nums[i]){
                repeatednum = nums[i];
            }
        }

        return repeatednum;
    }
}
