class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int forward = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == forward) continue;
                if (nums[i] + nums[forward] == target) {
                if (i < forward) {
                        result[0] = i;
                        result[1] = forward;
                } else {
                        result[1] = i;
                        result[0] = forward;
                }
                }
                forward++; 
            }
            forward = 0;
        }
        return result;
    }
}
