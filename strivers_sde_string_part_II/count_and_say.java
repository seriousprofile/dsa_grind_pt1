/*
i wanna cry.
but you basically create a stringbuilder and you update the count if the number is the same. if it isnt, add the count first and then the 
character. it's 1am i need sleep
*/


class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
           s =  getNext(s);
        }
        return s;
    }

    private String getNext(String num){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = num.charAt(0);

        for(int i = 1; i < num.length(); i++){
            if(num.charAt(i) == c){
                count++;
            } else {
                sb.append(count).append(c);
                c = num.charAt(i);
                count = 1; 
            }
        }

        sb.append(count).append(c);
        return sb.toString();
    }
}
