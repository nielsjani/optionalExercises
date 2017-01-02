package optional.get.exercise;

import optional.common.Username;

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

    public String getValueOrThrowException() {
        return null;
    }

    public Username mapToUsername(){
        return null;
    }
}
