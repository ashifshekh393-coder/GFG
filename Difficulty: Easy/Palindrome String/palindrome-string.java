class Solution {
    boolean isPalindrome(String s) {
        // code her
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)) return false;
            if(s.charAt(i)==s.charAt(j)){
            } 
            i++;
            j--;
        }
        return true;
    }
}