package Java_Program;


public class FinalValueofVariable {
    public static int finalValueAfterOperations(String[] operations) {
        int X=0;
            for (int i = 0; i < operations.length; i++) {
                if(operations[i]=="X++"){
                    X++;
                } else if (operations[i]=="--X") {
                    --X;
                }
                else if (operations[i]=="++X") {
                    ++X;
                }
                else {
                    X--;
                }
            }
        return X;
    }

    public static void main(String[] args) {
        String[] name={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(name));

    }
}
