class Solution {

    private boolean isAlphaNumeric(char c){
        return (c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String str) {
        int l = 0, r = str.length()-1;

        while(l < r){
            while(l < r && !isAlphaNumeric(str.charAt(l))){
                l++;
            }

            while(r > l && !isAlphaNumeric(str.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))){
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}
