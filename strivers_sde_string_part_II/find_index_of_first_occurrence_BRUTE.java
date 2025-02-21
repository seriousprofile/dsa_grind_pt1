/* 
notes:
in this, you run a loop through both and check every substring of size n (needle.length()) to see
if it matches the substring of size m (haystack.length()).
if it does, return the starting index.
otherwise, return -1.
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
