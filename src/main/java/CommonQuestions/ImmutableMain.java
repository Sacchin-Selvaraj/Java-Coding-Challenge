package CommonQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        Immutable immutable = new Immutable("Sacchin",1, Arrays.asList(1,2,3));
        immutable.getList().add(4);
        System.out.println(immutable.getList());
    }
}

final class Immutable{
    private final String name;
    private final int id;
    private final List<Integer> list;

    public Immutable(String name, int id, List<Integer> list) {
        this.name = name;
        this.id = id;
        this.list = new ArrayList<>(list);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}