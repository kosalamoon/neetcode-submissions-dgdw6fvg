class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i == 0) {
                continue;
            }
            if (num == nums[i - 1]) {
                continue;
            }

            if (num - nums[i - 1] == 1) {
                current++;
            } else {
                if (longest < current) {
                    longest = current;
                }
                current = 1;
            }
        }
        return Math.max(longest, current);
    }
}
