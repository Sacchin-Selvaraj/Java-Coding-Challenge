package Java_Program;


class Animal{
    public void eat(){
        System.out.println("Chicken");
    }
    public void show(){
        System.out.println("Bark!!!");
    }
}

public class Lambda {

    public static void main(String[] args) {
        Animal obj=new Animal(){
            @Override
            public void eat(){
                System.out.println("Fish");
            }
        };
        obj.eat();
        obj.show();

    }
}
