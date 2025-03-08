package Adapter_Design_Patterns;

public class School {

    public static void main(String[] args) {

        Assignment assignment=new Assignment();
        Pen p=new PenAdapter();
        assignment.setP(p);
        assignment.write("I am Writing Assignment in my home");
    }

    }

