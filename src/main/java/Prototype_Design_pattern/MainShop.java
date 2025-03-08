package Prototype_Design_pattern;

public class MainShop {

    public static void main(String[] args) {

        BookShop bs=new BookShop();
        bs.setBookShop("Magic BookShop");
        bs.loadData();

        BookShop frd=bs.clone();
        frd.setBookShop("Friends BookShop");

        System.out.println(bs);
        System.out.println(frd);
    }
}
