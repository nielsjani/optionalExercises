package optional.common;

import java.util.function.Supplier;

public class MyService {

    public Supplier<String> myServiceSupplier() {
        return () -> "Hello, I'm MyService";
    }

    public void notify(String message){
        // will be mocked out always
    }
}
