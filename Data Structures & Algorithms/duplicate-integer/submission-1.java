class Solution {
    public boolean hasDuplicate(int[] nums) {
         Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}