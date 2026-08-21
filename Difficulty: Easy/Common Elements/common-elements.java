class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        ArrayList <Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        return ans;
    }
}