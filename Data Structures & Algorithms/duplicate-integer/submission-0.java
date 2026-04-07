class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Number, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, true);
        }
        return false;
    }
}