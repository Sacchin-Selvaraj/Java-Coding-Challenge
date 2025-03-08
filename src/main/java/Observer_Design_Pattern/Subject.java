package Observer_Design_Pattern;

public interface Subject {

    void subscribe(Observer sub);

    void unsubscribe(Observer sub);

    void notifySubscribe();
}
