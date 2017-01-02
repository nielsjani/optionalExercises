package optional.get.solution;

import optional.common.MyService;
import optional.common.Username;

import java.util.Optional;

public class OptionalGetSolution {

    private Optional<String> optionalValue;

    public OptionalGetSolution() {
        this.optionalValue = Optional.empty();
    }

    public OptionalGetSolution(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }

    public String getValueOrDefault() {
        return optionalValue.orElse("DEFAULT");
    }

    public String getValueOrUseSupplier() {
        MyService myService = new MyService();
        return optionalValue.orElseGet(myService.myServiceSupplier());
    }

    public String getValueOrThrowException() {
        return optionalValue.orElseThrow(() -> new IllegalArgumentException("This optional is empty"));
    }

    public Username mapToUsername() {
        return optionalValue.map(Username::new).orElse(null);
    }
}
