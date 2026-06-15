class Solution {

    public String encode(List<String> stringList) {
         if(stringList.isEmpty())
            return "";
        List<Integer> sizes = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(String str : stringList){
            sizes.add(str.length());
        }

        for(int size : sizes){
            stringBuilder.append(size).append(",");
        }

        stringBuilder.append("#");

        for(String str : stringList){
            stringBuilder.append(str);
        }

        return stringBuilder.toString();

    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;

        while(str.charAt(i) != '#'){
            StringBuilder stringBuilder = new StringBuilder();
            while(str.charAt(i) != ','){
                stringBuilder.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(stringBuilder.toString()));
            i++;
        }
        i++;
        for(int sz : sizes){
            result.add(str.substring(i, i + sz));
            i += sz;
        }
        return result;
    }
}
