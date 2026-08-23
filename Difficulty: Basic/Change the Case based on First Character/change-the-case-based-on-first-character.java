class Solution {
    String modify(String s) {
        int n = s.length();
        for(int i =  0; i<n;i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                s = s.toUpperCase();
                break;
            }
            else s = s.toLowerCase();
        }
        return s;
    }
}