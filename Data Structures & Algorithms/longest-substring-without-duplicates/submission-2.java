class Solution {
    public int lengthOfLongestSubstring(String str) {
         HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

       for(int r = 0; r < str.length(); r++){
            while(charSet.contains(str.charAt(r))){
                charSet.remove(str.charAt(l));
                l++;
            }
            charSet.add(str.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
