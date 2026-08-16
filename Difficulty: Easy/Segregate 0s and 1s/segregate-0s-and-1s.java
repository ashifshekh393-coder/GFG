class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int noz = 0;
        int noo = 0;
        for(int ele:arr){
            if(ele==0){
                noz++;
            }
            else noo++;
        }
        for(int i = 0; i<noz; i++){
            arr[i]=0;
        }
          for(int i = noz; i<n; i++){
            arr[i]=1;
        }
        
    }
}
