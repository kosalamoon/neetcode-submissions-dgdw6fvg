class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length());
            builder.append("#");
            builder.append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String input) {
        var delimiterIndex = input.indexOf('#');
        if (delimiterIndex == -1) {
            return Collections.emptyList();
        }

        var numOfChars = Integer.parseInt(input.substring(0, delimiterIndex));
        var substring = input.substring(delimiterIndex + 1, 1 + delimiterIndex + numOfChars);
        ArrayList<String> strings = new ArrayList<>();
        strings.add(substring);

        var rest = input.substring(1 + delimiterIndex + numOfChars);
        strings.addAll(decode(rest));
        return strings;
    }
}
