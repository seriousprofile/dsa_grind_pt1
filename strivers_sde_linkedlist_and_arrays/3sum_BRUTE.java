class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>(); //create a list for storing the sorted lists
        int n = nums.length;


      //the brute method simply uses 3 nested loops (unfortunately increasing our time complexty to O(N^3) so don't be surprised when it throws a TLE error!!) to traverse through the list and pick the three elements that add up to 0.
        for(int i = 0; i < n; i++){ 
            for (int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]); //we add these elements to a temporary list as the question demands sorted sublists. 
                        temp.sort(null); //we sort the lists first...
                        st.add(temp); //...and add them to our main list!
                    }
                }
            }
        }

        return new ArrayList<>(st); //convert the hashset to an array list and return our final answer :)
    }
}
