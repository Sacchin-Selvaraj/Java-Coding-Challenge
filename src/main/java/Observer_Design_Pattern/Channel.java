package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    String channelName;
    String title;
    List<Observer> subscribers = new ArrayList<>();

    public Channel(String channelName, String title) {
        this.channelName = channelName;
        this.title = title;
    }

    @Override
    public void subscribe(Observer sub) {
        subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Observer sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscribe() {
        for (Observer observer : subscribers){
            observer.notification();
        }
    }
}
