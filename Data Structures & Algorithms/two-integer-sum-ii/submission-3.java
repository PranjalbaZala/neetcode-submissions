class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int result[] = null;
        for(int i = 0;i < n; i++){
            for(int j = i+1;j<n; j++){
                if(arr[i] + arr[j] == target){
                    result = new int[]{i+1,j+1};
                    return result;
                }
            }
        }
        return new int[]{0};
    }
}
