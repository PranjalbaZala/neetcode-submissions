class Solution {
    public boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }

        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }
}
