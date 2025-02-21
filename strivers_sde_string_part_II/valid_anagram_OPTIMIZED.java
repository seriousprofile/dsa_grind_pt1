/*
notes:
in this problem, use a frequency array.
in the first step while iterating through string s, you assign them to indices according to s.charAt(i) - 'a'
which gives them their place following ASCII order.
now iterate the loop backwards while going to string t. 
if you end up getting zeroes, it's an anagram because all the letters have repeated.
otherwise, return false as it is not an anagram.
*/


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length != t.length) return false; 

        int[] freq = new int[26];

        for(int i = 0; i < s.length; i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int c : freq){
            if(count != 0) return false;
        }

        return true;

    }
}
