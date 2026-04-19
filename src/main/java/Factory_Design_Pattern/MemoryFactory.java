package Factory_Design_Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MemoryFactory {
    private static final Map<String, Supplier<Memory>> registerTypes=new HashMap<>();

    static {
        registerTypes.put("Laptop", Laptop::new);
        registerTypes.put("Computer", Computer::new);
    }
    public static Memory getObject(String type){
        if (type == null) return null;
        Supplier<Memory> memorySupplier = registerTypes.get(type);
        return memorySupplier==null?null:memorySupplier.get();
    }
}
