class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                char ch = board[row][col];
                if(ch == '.') {
                    continue;
                }
                String rowId = ch + "in row" + row;
                String colId = ch + "in col"+ col;
                String boxId = ch + "in box"+ row/3 + "-" + col/3;

                if(!set.add(rowId) || !set.add(colId) || !set.add(boxId)) {
                    return false;
                }
            }
        }

        return true;
    }
}
