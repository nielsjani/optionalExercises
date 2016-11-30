package optional.get;

import java.util.function.Supplier;

public class MyService {

    public Supplier<String> myServiceSupplier() {
        return () -> "Hello, I'm MyService";
    }
}
