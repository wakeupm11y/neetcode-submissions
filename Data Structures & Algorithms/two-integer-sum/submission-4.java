public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (!diffs.containsKey(diff)) {
                diffs.put(nums[i], i);
            } else {
                return new int[]{diffs.get(diff), i};
            }
        }
        return null;
    }
}
