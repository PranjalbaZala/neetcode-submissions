class Solution {
    public int findMin(int[] arr) {
        int l = 0, r = arr.length-1,mid = 0;
        int res = arr[0];

        while(l <= r){
           if(arr[l] < arr[r]){
               res = Math.min(res, arr[l]);
               break;
           }

           int m = l + (r - l)/2;
            res = Math.min(res, arr[m]);
           if(arr[m] >= arr[l]){
               l = m + 1; //search left side
           }else{
               r = m - 1; //search right side
           }
        }
        return res;
    }
}
