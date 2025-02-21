/*
notes:
you have to split the numbers before and after decimal point.
compare the numbers to get the max length so you stay in bounds.
and then conver the strings to integers. and then we return -1, 1. 
if the option is neither just return 0. it's 1.47 am bye im sleeping
*/


class Solution {
    public int compareVersion(String version1, String version2) {

      String[] v1 = version1.split("\\.");
      String[] v2 = version2.split("\\.");

      int len = Math.max(v1, v2);

      for(int i = 0; i < len; i++){
        num1 = 0;
        num2 = 0;

        if(i < v1.length){
          num1 = Integer.parseInt(v1[i]);
        }
        
        if(i < v2.length){
          num2 = Integer.parseInt(v2[i]);
          
        if(num1 > num2) return 1;
        if(num1 < num2) return -1;
      }

        return 0;
    }
}
