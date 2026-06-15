class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> count = new HashMap<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(Map.Entry<Integer,Integer> map : count.entrySet()){
            queue.offer(new int[]{map.getValue(),map.getKey()});

            if(queue.size() > k){
            queue.poll();
        }
        }

        int res[] = new int[k];

        for(int i=0;i<k;i++){
            res[i] = queue.poll()[1];
        }

        return res;
    }
}
