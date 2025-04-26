package Contest;//package Contest;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class OverlappingSubStrings {
//
//    public static int countCells(char[][] grid, String pattern) {
//
//        List<Integer> column=new ArrayList<>();
//        Set<Integer> realColumn=new HashSet<>();
//        int count=0;
//        int left=0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                char ch=grid[i][j];
//                if (pattern.charAt(left)==ch){
//                    left++;
//                    column.add(j);
//                    if (left==pattern.length()) {
//                        left = 0;
//                        realColumn.addAll(column);
//                    }
//                }else {
//                    left=1;
//                    column=new ArrayList<>();
//                }
//            }
//        }
//        System.out.println(realColumn);
//        for (int i = 0; i < grid[0].length; i++) {
//            for (int j = 0; j <grid.length ; j++) {
//                char ch=grid[j][i];
//                if (pattern.charAt(left)==ch){
//                    left++;
//                    if (left==pattern.length()) {
//                        if (realColumn.contains(i))
//                            count++;
//                        left=0;
//                    }
//                }else {
//                    left=1;
//                }
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        char[][] grid={{'a','a','c','c'},{'b','b','b','c'},{'a','a','b','a'},{'c','a','a','c'},{'a','a','c','c'}};
//        char[][] grid1={{'c','a','a','a'},{'a','a','b','a'},{'b','b','a','a'},{'a','a','b','a'}};
//        String pattern="aba";
//        System.out.println(countCells(grid1,pattern));
//    }
//}
import java.util.HashSet;
import java.util.Set;

public class OverlappingSubStrings {

    public static int countCells(char[][] grid, String pattern) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;
        int patternLen = pattern.length();
        if (patternLen == 0) return 0;

        Set<String> horizontalMatches = new HashSet<>();
        Set<String> verticalMatches = new HashSet<>();

        // Check horizontal substrings with row wrapping
        for (int i = 0; i < m; i++) {
            StringBuilder rowStr = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowStr.append(grid[i][j]);
            }
            String row = rowStr.toString();
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < patternLen; k++) {
                    int col = (j + k) % n;
                    int rowIdx = i + (j + k) / n;
                    if (rowIdx >= m) break; // No wrapping back to top
                    sb.append(grid[rowIdx][col]);
                }
                if (sb.toString().equals(pattern)) {
                    for (int k = 0; k < patternLen; k++) {
                        int col = (j + k) % n;
                        int rowIdx = i + (j + k) / n;
                        if (rowIdx >= m) break;
                        horizontalMatches.add(rowIdx + "," + col);
                    }
                }
            }
        }

        // Check vertical substrings with column wrapping
        for (int j = 0; j < n; j++) {
            StringBuilder colStr = new StringBuilder();
            for (int i = 0; i < m; i++) {
                colStr.append(grid[i][j]);
            }
            String col = colStr.toString();
            for (int i = 0; i < m; i++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < patternLen; k++) {
                    int row = (i + k) % m;
                    int colIdx = j + (i + k) / m;
                    if (colIdx >= n) break; // No wrapping back to first column
                    sb.append(grid[row][colIdx]);
                }
                if (sb.toString().equals(pattern)) {
                    for (int k = 0; k < patternLen; k++) {
                        int row = (i + k) % m;
                        int colIdx = j + (i + k) / m;
                        if (colIdx >= n) break;
                        verticalMatches.add(row + "," + colIdx);
                    }
                }
            }
        }

        // Count cells present in both sets
        horizontalMatches.retainAll(verticalMatches);
        return horizontalMatches.size();
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'a', 'c', 'c'},
                {'b', 'b', 'b', 'c'},
                {'a', 'a', 'b', 'a'},
                {'c', 'a', 'a', 'c'},
                {'a', 'a', 'c', 'c'}
        };
        char[][] grid1 = {
                {'c', 'a', 'a', 'a'},
                {'a', 'a', 'b', 'a'},
                {'b', 'b', 'a', 'a'},
                {'a', 'a', 'b', 'a'}
        };
        String pattern = "abaca";
        System.out.println(countCells(grid, pattern)); // Expected output: 4
    }
}