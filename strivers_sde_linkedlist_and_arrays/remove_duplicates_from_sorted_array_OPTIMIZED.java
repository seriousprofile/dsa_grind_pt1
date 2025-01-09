class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; 
        for (int j = 1; j < nums.length; j++){ //
            if(nums[i] != nums[j]){ //if the next element is not the same, it is unique
                i++; //point i to the place of the next unique element
                nums[i] = nums[j]; //replace it with the unique element
            }
        }

        return i + 1; //it is zero based so return i + 1!
    }
}
