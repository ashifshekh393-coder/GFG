class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        // code here
        int rows = arr.length, cols = arr[0].length;
        int lo = 0, hi = rows*cols -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midrow = mid/cols, midcol = mid%cols;
            if(arr[midrow][midcol]==tar) return true;
            else if(arr[midrow][midcol]>tar) hi = mid-1;
            else lo = mid +1;
        }
        return false;
    }
}
