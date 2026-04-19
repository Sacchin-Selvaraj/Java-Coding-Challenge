package Factory_Design_Pattern;

public class Computer implements Memory{
    private String memoryName;
    private String memoryType;

    public Computer() {
    }

    public Computer(String memoryName, String memoryType) {
        this.memoryName = memoryName;
        this.memoryType = memoryType;
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
