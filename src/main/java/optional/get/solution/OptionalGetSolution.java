package optional.get.solution;

import optional.get.MyService;

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
}
