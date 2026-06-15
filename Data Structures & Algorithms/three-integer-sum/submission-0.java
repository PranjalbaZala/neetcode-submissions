class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0)
                break;

            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            int l = i+1,r = arr.length - 1;
            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];

                if(sum > 0){
                    r--;
                } else if(sum < 0){
                    l++;
                }
                else{
                    res.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    r--;
                    while(l < r && arr[l] == arr[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
