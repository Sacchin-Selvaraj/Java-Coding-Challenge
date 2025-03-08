package Composite_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

public class Composite implements Component {

    String name;
    List<Component> components=new ArrayList<>();

    public void add(Component c){
        components.add(c);
    }

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component com:components){
            com.showPrice();
        }
    }
}

class Leaf implements Component{

    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {

        System.out.println(name+ " : "+ price);

    }
}
