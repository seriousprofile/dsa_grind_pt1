class Solution {
    public boolean isAnagram(String s, String t) {
      
      int a = s.length();
      int b = t.length();

      char[] m = s.toCharArray();
      char[] n = t.toCharArray();

      Arrays.sort(m);
      Arrays.sort(n);

      return Arrays.equals(m, n) 
    }
}
