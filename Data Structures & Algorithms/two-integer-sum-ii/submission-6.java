class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i =0; i<n; i++){
            int l = i+1;
            int r = n - 1;
            int complement = target - arr[i];

            while(l<=r){
                int mid = l + (r-l)/2;

                if(arr[mid] == complement){
                    return new int[]{i+1, mid+1};
                }
                else if(arr[mid]<complement){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }
        return new int[0];
    }
}
