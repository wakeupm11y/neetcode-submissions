class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int num : nums) {
            heap.add(num);
        }

        int longest = 0;
        int count = 1;
        int former = heap.poll();
        while(!heap.isEmpty()) {
            int current = heap.poll();

            if (former == current) continue;

            if (former + 1 == current) {
                count++;
            } else {
                longest = (count > longest) ? count : longest;
                count = 1;
            }
            former = current;
        }
        return (count > longest) ? count : longest;
    }
}
