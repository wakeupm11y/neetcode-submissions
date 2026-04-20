class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );
        int[] topk = new int[k];
        // build the counts hash table
        for (int i = 0; i < nums.length; i++) {
            if (!counts.containsKey(nums[i])) {
                counts.put(nums[i], 1);
            } else {
                int count = counts.get(nums[i]) + 1;
                counts.put(nums[i], count);
            }
        }

        for (Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            heap.add(entry);
        }

        for (int i = 0; i < k; i++) {
            topk[i] = heap.poll().getKey();
        }

        return topk;
    }
}
