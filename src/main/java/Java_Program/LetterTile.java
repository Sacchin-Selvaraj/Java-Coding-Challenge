package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class LetterTile {

    public static int numTilePossibilities(String tiles) {

        int count=0;
        List<String> list=new ArrayList<>();
        for (int i = 0; i < tiles.length(); i++) {

            for (int j = i+1; j < tiles.length(); j++) {

                list.add(tiles.substring(i,j));
                count++;
            }
        }
        System.out.println(list);
        return count;
    }

    public static void main(String[] args) {

        String word="AAB";

        System.out.println(numTilePossibilities(word));

    }
}
