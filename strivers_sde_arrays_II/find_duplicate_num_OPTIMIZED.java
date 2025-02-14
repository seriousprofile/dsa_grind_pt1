/* very simple! 
  -> just use num to go thru the given array
  -> if the given hashset consists of the number, return it as the dupe!
  -> otherwise add it to the hashset for future comparision(s)! */

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }

        return -1; 
    }
}
