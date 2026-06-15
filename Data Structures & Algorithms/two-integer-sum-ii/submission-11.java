class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int l = 0;
        int r = arr.length - 1;
        for(int i = 0;i<arr.length; i++){
            while(l < r){
                int currSum = arr[l] + arr[r];

                if(currSum > target){
                    r--;
                }
                else if(currSum < target){
                    l++;
                }
                else if(currSum == target){
                    return new int[]{l+1,r+1};
                }
            }
        }
        return new int[]{0};
    }
}
