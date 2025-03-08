package Adapter_Design_Patterns;

public class PenAdapter implements Pen {

    ParkerPen parkerPen=new ParkerPen();
    @Override
    public void write(String s) {
        parkerPen.writing(s);
    }
}
