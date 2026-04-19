package Factory_Design_Pattern;

public class Laptop implements Memory{

    private String memoryName;
    private String memoryType;

    public Laptop(String memoryName, String memoryType) {
        this.memoryName = memoryName;
        this.memoryType = memoryType;
    }

    public Laptop() {
    }

    public void setMemoryName(String memoryName) {
        this.memoryName = memoryName;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String getMemoryType() {
        return this.memoryType;
    }

    @Override
    public String getMemoryName() {
        return this.memoryName;
    }
}
