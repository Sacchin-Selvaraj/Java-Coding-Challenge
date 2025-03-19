package Composite_Design_Pattern;

public class CompositeDisplay {

    public static void main(String[] args) {

        Component mouse=new Leaf("Mouse",500);
        Component keyboard=new Leaf("keyboard",1000);
        Component speaker=new Leaf("speaker",650);
        Component cpu=new Leaf("cpu",6000);
        Component ram=new Leaf("ram",5000);
        Component hardDrive=new Leaf("hardDrive",3000);

        Composite pheriperal=new Composite("Peripheral");
        Composite computer=new Composite("Computer");
        Composite motherBoard=new Composite("MotherBoard");
        Composite cabinet=new Composite("Cabinet");

        pheriperal.add(mouse);
        pheriperal.add(keyboard);
        pheriperal.add(speaker);
        motherBoard.add(cpu);
        motherBoard.add(ram);
        cabinet.add(hardDrive);
        cabinet.add(motherBoard);
        computer.add(cabinet);
        computer.add(pheriperal);

        computer.showPrice();

    }
}
