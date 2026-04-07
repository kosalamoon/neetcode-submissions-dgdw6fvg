class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.toString(sArray).equals(Arrays.toString(tArray));
    }
}
