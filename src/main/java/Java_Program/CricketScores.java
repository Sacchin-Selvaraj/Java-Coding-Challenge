package Java_Program;

public class CricketScores {

    private static void toCheckScore(String[] scores) {
        boolean isPlayerOneinStrike=true;
        int player1 = 0;
        int player2 = 0;
        int extras = 0;
        for (int j = 0; j < scores.length; j++) {
            if (scores[j].equals("N") || scores[j].equals("W")) {
                extras++;
                continue;
            }
            if (scores[j].equals(".")) {

            }else{
                if (isPlayerOneinStrike){
                    player1=player1+Integer.parseInt(scores[j]);
                }else {
                    player2=player2+Integer.parseInt(scores[j]);
                }
                if(Integer.parseInt(scores[j])%2!=0){
                    isPlayerOneinStrike=!isPlayerOneinStrike;
                }

            }
        }
        System.out.println("Player1 "+player1);
        System.out.println("Player2 "+player2);
        System.out.println("Extras "+extras);
    }

    public static void main(String[] args) {
        String[] scores = {"1", ".", "2", ".", "4", "3", "6", "W", "1", ".", "N", ".", "2", "1"};
        toCheckScore(scores);
    }
}
