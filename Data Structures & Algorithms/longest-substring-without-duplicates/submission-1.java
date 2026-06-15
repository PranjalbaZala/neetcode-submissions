class Solution {
    public int lengthOfLongestSubstring(String str) {
        int res = 0;
        for(int i = 0;i < str.length(); i++){
            Set<Character> charSet = new HashSet<>();

            for(int j = i; j < str.length(); j++){

                if(charSet.contains(str.charAt(j))){
                    break;
                }
                charSet.add(str.charAt(j));
            }
            res = Math.max(res, charSet.size());
        }

        return res;
    }
}
