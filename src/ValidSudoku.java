import java.util.HashSet;
import java.util.Set;

/**
 * ValidSudoku
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
       

        for (int i = 0; i < 9; i++) {
            Set<Character> setRow = new HashSet<>();
            Set<Character> setColumn = new HashSet<>();
            Set<Character> setSub = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !setRow.add(board[i][j]))
                    return false;

                if (board[j][i] != '.' && !setColumn.add(board[j][i]))
                    return false;

                int rowIndex = 3 * (i / 3);
                int columnIndex = 3 * (i % 3);

                if (board[rowIndex + (j / 3)][columnIndex + (j % 3)] != '.' && !setSub.add(board[rowIndex + (j / 3)][columnIndex + (j % 3)]))
                    return false;
            }
        }
        return true;
    }
}