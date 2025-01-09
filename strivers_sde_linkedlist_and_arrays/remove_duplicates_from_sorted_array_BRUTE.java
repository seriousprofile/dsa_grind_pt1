class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(); //create an ans array list

        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){ //if the list does not contain the element from the nums array,
                list.add(nums[i]); //add it to the list (it is a unique element)
            }
        }

        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i); //replace the og array with the unique elements from the list.
        }

        return list.size(); //return the size because the question asked us to return the size of the element.
    }
}
