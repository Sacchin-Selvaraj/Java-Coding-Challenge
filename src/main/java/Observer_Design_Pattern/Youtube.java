package Observer_Design_Pattern;

public class Youtube {

    public static void main(String[] args) {

        Channel mrBeast=new Channel("Mr.Beast","Beast games");

        Observer a1=new Subscriber("Sachin",mrBeast);
        Observer a2=new Subscriber("Mike",mrBeast);
        Observer a3=new Subscriber("James",mrBeast);
        Observer a4=new Subscriber("Monique",mrBeast);
        Observer a5=new Subscriber("Luna",mrBeast);

        mrBeast.subscribe(a1);
        mrBeast.subscribe(a2);
        mrBeast.subscribe(a3);
        mrBeast.subscribe(a4);
        mrBeast.subscribe(a5);

        mrBeast.unsubscribe(a5);

        mrBeast.notifySubscribe();
    }
}
