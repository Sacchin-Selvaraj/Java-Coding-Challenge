package Streams;

import java.util.stream.Collectors;

public class RemoveOccurance {

    public static void main(String[] args) {
        String str = "Java Interview";

        String occuranceRemoved = str.chars()
                .filter(word->word!='e')
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(occuranceRemoved);

        String occuranceRemoveds = str.chars().mapToObj(ch-> (char)ch)
                .filter(ch-> ch!='a')
                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();

        System.out.println(occuranceRemoveds);

    }
}
