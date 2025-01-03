package Java_Program;


interface Computer {
        void Compile();
    }

    class Laptop implements Computer {
        @Override
        public void Compile() {
            System.out.println("You are working on a Laptop");
        }
    }

    class Desktop implements Computer {
        @Override
        public void Compile() {
            System.out.println("You are working on a Desktop");
        }
    }

    class Devloper {

        public void show(Computer obj) {
            System.out.println("I got a hardware to work");
            obj.Compile();
        }

    }

    public class InterfaceLearn {
    public static void main(String[] args) {

        Laptop lap=new Laptop();
        Desktop desk=new Desktop();
        Devloper dev = new Devloper();
        dev.show(desk);

    }

}