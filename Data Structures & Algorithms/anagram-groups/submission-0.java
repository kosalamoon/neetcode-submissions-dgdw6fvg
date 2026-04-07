class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedString = sort(str);
            if (map.containsKey(sortedString)) {
                var updatedList = map.get(sortedString);
                updatedList.add(str);
                map.put(sortedString, updatedList);
            } else {
                map.put(sortedString, new ArrayList<>(List.of(str)));
            }
        }
        return map.values().stream().toList();
    }

    static String sort(String input) {
        var charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
