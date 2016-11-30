package optional.get;

import java.util.Optional;

public class OptionalGet {

    private Optional<String> optionalValue;

    public OptionalGet(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }




}
