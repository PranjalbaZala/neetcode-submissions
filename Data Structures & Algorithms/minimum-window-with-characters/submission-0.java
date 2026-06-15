class Solution {
    public String minWindow(String s, String t) {
            HashMap<Character,Integer> target = new HashMap<>();

        for(char ch : t.toCharArray()){
            target.put(ch, target.getOrDefault(ch,0)+1);
        }

        int count = target.size(), start = 0;
        int minlen = Integer.MAX_VALUE,j = 0,i = 0;
        String ans = "";

        while(j < s.length()){
            char right = s.charAt(j);

            if(target.containsKey(right)){
                target.put(right, target.get(right)-1);

                if(target.get(right) == 0){
                    count --;
                }
            }

            while(count == 0){

                if(j - i + 1 < minlen){
                    minlen = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                if(target.containsKey(left)) {
                    target.put(left, target.get(left) + 1);

                    if (target.get(left) == 1) {
                        count++;
                    }
                }
                i++;
            }
           j++;
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
