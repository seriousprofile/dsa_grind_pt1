class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //create an ans list:
        List<List<Integer>> ans = new ArrayList<>();

        //fix a pointer i:
        for(int i = 0; i < n; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue; //emsures that i skips duplicate ele

            //declare the moving pointers:
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                //declare a sum variable:
            int sum = nums[i] + nums[j] + nums[k];
            
            if(sum > 0){ //if the sum is greater, it means that the greater elements should be reduced. as the array is sorted, and k is at the greatest ele, reduce it by 1.
                k--;
            }
            else if (sum < 0){ //if sum is lesser, it means that the sum could be increased by moving it to the next greater number. increment j by 1.
                j++;
            }
            else {
                List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]); //create a temporary list to add the resulting array sin the form of a list.
                ans.add(temp);
                j++; //don't forget to update the pointers!!
                k--;

                //skip duplicates:
                while (j < k && nums[j] == nums[j - 1]) j++; 
                while (j < k && nums[k] == nums[k + 1]) k--;
                
            }
            }

        }
        return ans;
    }
}
