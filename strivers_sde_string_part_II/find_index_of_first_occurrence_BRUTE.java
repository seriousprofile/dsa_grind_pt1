/*
NOTES:
for the brute force approach, just compare every substring of haystack to needle. if they're equal, then return that index. 
otherwise, just return -1!
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(); 
        int n = needle.length();

        if(n > m){
            return -1; 
        }

        for(int i = 0; i <= m - n; i++){
            if(haystack.substring(i, i + n).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
