class Solution {
    public boolean binarySearch(int[] arr, int tar) {
        // code here
        int lo = 0, hi = arr.length-1, idx = -1;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid]<tar) lo = mid+1;
            else if(arr[mid]>tar) hi = mid -1;
            else{
                return true;
            }
        }
        return false;
    }
}