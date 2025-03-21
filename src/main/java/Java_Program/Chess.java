package Java_Program;

public class Chess {
    public static int numRookCaptures(String[][] board) {

        int row = -1, column = -1, count = 0;

        // Find the position of the Rook (R)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals("R")) {
                    row = i;
                    column = j;
                    break; // Found Rook, exit loop
                }
            }
        }
        // If Rook was not found, return 0
        if (row == -1 || column == -1) return 0;

        // Check all 4 possible directions for capturing pawns
        // 🔹 Move UP
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column].equals("B")) break; // Bishop blocks path
            if (board[i][column].equals("p")) {
                count++;
                break; // Rook can capture only 1 pawn per direction
            }
        }
        // 🔹 Move DOWN
        for (int i = row + 1; i < 8; i++) {
            if (board[i][column].equals("B")) break;
            if (board[i][column].equals("p")) {
                count++;
                break;
            }
        }
        // 🔹 Move LEFT
        for (int i = column - 1; i >= 0; i--) {
            if (board[row][i].equals("B")) break;
            if (board[row][i].equals("p")) {
                count++;
                break;
            }
        }
        // 🔹 Move RIGHT
        for (int i = column + 1; i < 8; i++) {
            if (board[row][i].equals("B")) break;
            if (board[row][i].equals("p")) {
                count++;
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[][] board = {
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", "R", ".", ".", ".", "p"},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."}
        };

        System.out.println(numRookCaptures(board));
    }
}
