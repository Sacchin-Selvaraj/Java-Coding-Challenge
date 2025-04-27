package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountCoveredBuildings {
    public static int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer,List<Integer>> rowMap=new HashMap<>();
        HashMap<Integer,List<Integer>> columnMap=new HashMap<>();

        for (int[] building:buildings){
            int x=building[0];
            int y=building[1];

            rowMap.computeIfAbsent(x,integer -> new ArrayList<>()).add(y);
            columnMap.computeIfAbsent(y,integer -> new ArrayList<>()).add(x);
        }

        for (List<Integer> columns : rowMap.values()) {
            Collections.sort(columns);
        }
        for (List<Integer> rows : columnMap.values()) {
            Collections.sort(rows);
        }
        System.out.println(rowMap);
        System.out.println(columnMap);
        int covered = 0;

        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];

            // Check left in the same row
            List<Integer> colsInRow = rowMap.get(x);
            boolean hasLeft = false;
            int index = Collections.binarySearch(colsInRow, y);
            if (index > 0) { // There is at least one building to the left
                hasLeft = true;
            }

            // Check right in the same row
            boolean hasRight = false;
            if (index < colsInRow.size() - 1) { // There is at least one building to the right
                hasRight = true;
            }

            // Check above in the same column
            List<Integer> rowsInCol = columnMap.get(y);
            boolean hasAbove = false;
            index = Collections.binarySearch(rowsInCol, x);
            if (index > 0) { // There is at least one building above
                hasAbove = true;
            }

            // Check below in the same column
            boolean hasBelow = false;
            if (index < rowsInCol.size() - 1) { // There is at least one building below
                hasBelow = true;
            }

            if (hasLeft && hasRight && hasAbove && hasBelow) {
                covered++;
            }
        }

        return covered;

    }

    public static void main(String[] args) {
        int n = 3;
        int[][] nums = {{1, 2}, {2, 2}, {3, 2}, {2, 1}, {2, 3}};
        System.out.println(countCoveredBuildings(n, nums));
    }
}
