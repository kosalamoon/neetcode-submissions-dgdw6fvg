class Solution {
    public static boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> columnMapList = Stream
                .generate(() -> new HashSet<Character>())
                .limit(board.length)
                .toList();

        List<HashSet<Character>> subBox = Stream
                .generate(() -> new HashSet<Character>())
                .limit(board.length)
                .toList();

        for (int i = 0; i < board.length; i++) {
            var row = board[i];


            HashSet<Character> rowMap = new HashSet<>();
            for (int j = 0; j < row.length; j++) {
                var cell = board[i][j];
                if (cell == '.') {
                    continue;
                }

                if (rowMap.contains(cell)) {
                    return false;
                }
                rowMap.add(cell);

                int boxIndex = (i / 3) * 3 + (j / 3);
                if (subBox.get(boxIndex).contains(cell)) {
                    return false;
                }
                subBox.get(boxIndex).add(cell);

                if (columnMapList.get(j).contains(cell)) {
                    return false;
                }
                columnMapList.get(j).add(cell);
            }
        }
        return true;
    }
} 
