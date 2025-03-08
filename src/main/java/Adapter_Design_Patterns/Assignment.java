package Adapter_Design_Patterns;

public class Assignment {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void write(String s){
        p.write(s);
    }

}
