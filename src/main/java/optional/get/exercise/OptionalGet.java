package optional.get.exercise;

import java.util.Optional;

public class OptionalGet {

    private Optional<String> optionalValue;

    public OptionalGet() {
        this.optionalValue = Optional.empty();
    }

    public OptionalGet(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }

    public String getValueOrDefault() {
        return null;
    }

    public String getValueOrUseSupplier() {
        return null;
    }


}
