class Solution {
    public int lengthOfLastWord(String s) {
        int i= s.length();
       int count=0;
       while(i>0&& s.charAt(i-1)==' '){
        i--;
       }
        while (i>0 && s.charAt(i-1)!=' '){
            count++;
            i--;

        }
        return count;
        
    }
}