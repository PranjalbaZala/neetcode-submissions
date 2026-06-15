class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String element : strs){
            char c[] = element.toCharArray();
            Arrays.sort(c);

            String key = new String(c);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(element);
        }

        return new ArrayList<>(map.values());
    }
}
