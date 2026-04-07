class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Number, Number>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                res[0] = map.get(target - num).intValue();
                res[1] = i;
                break;
            }
            map.put(num, i);
        }
        return res;
    }
}
