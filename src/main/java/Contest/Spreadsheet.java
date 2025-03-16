package Contest;

import java.util.Arrays;
import java.util.List;

public class Spreadsheet {
    int[][] cells;
    public Spreadsheet(int rows) {
        cells=new int[27][rows+1];
        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= rows; j++) {
                cells[i][j]=0;
            }
        }
    }
    public void setCell(String cell, int value) {
        int[] cellnumber=convertValues(cell);
        cells[cellnumber[0]][cellnumber[1]]=value;
    }

    private static int[] convertValues(String cell) {
        int a1=cell.charAt(0)-'A';
        int a2=Integer.parseInt(cell.substring(1));
        return new int[]{a1+1,a2};
    }

    public void resetCell(String cell) {
        int[] cellnumber=convertValues(cell);
        cells[cellnumber[0]][cellnumber[1]]=0;
    }

    public int getValue(String formula) {
        if (!formula.startsWith("=")) {
            return Integer.parseInt(formula);
        }

        formula = formula.substring(1);
        String[] tokens = formula.split("\\+");
        int sum = 0;
        for (String token : tokens) {
            token = token.trim();
            try {
                sum += Integer.parseInt(token);
            } catch (NumberFormatException e) {
                int row = token.charAt(0) - 'A';
                int col = Integer.parseInt(token.substring(1)) ;
                sum += cells[row+1][col];
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        Spreadsheet spreadsheet=new Spreadsheet(3);

        String[] action={"Spreadsheet", "getValue", "setCell", "getValue", "setCell", "getValue", "resetCell", "getValue"};
        List<String> vaules= Arrays.asList("3");

        System.out.println(spreadsheet.getValue("=5+7"));
        spreadsheet.setCell("A1",10);
        System.out.println(spreadsheet.getValue("=A1+6"));
        spreadsheet.setCell("B2",15);
        System.out.println(spreadsheet.getValue("=A1+B2"));
        spreadsheet.resetCell("A1");
        System.out.println(spreadsheet.getValue("=A1+B2"));

    }
}