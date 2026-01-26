package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScoreBoard {
    public static void main(String[] args) {

        List<users> usersList = List.of(
                new users(1,1000),
                new users(2,10000),
                new users(3,5000),
                new users(4,100000),
                new users(5,1001),
                new users(6,100),
                new users(7,10));

        Map<String,List<users>> listMap = usersList.stream().collect(Collectors.groupingBy(
                users -> {
                    if (users.score<1000){
                        return "Beginner";
                    } else if (users.score <= 10000) {
                        return "Intermediate";
                    }else {
                        return "Advanced";
                    }
                }
        ));

        listMap.forEach((level, players) -> {
            System.out.println("\n--- Level: " + level + " ---");
            players.forEach(user ->
                    System.out.println("ID: " + user.id + ", Score: " + user.score)
            );
        });
    }
}


class users{
    public int id;
    public int score;

    public users(int id, int score) {
        this.id = id;
        this.score = score;
    }
}
