class Solution {
    public int[] productExceptSelf(int[] arr) {
       int product = 1;
        int zero_count = 0;

        for (int num : arr) {
            if (num != 0) {
                product *= num;
            } else {
                zero_count++;
            }
        }

        if(zero_count > 1){
            return new int[arr.length];
        }

        int result[] = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            if(zero_count > 0){
                result[i] = (arr[i] == 0)?product : 0;
            }
            else{
                result[i] = product / arr[i];
            }
        }

        return result;
    }
}  
