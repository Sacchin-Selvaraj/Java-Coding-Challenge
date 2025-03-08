package Observer_Design_Pattern;

public class Subscriber implements Observer{

    private String name;
    private Channel channel;

    public Subscriber(String name, Channel channel) {
        this.name = name;
        this.channel = channel;
    }

    @Override
    public void notification() {
        System.out.println("Hey "+name+", "+ channel.channelName +" have uploaded new Video : "+channel.title);
    }


}
