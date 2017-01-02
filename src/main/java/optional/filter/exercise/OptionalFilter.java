package optional.filter.exercise;

import java.util.Optional;

public class OptionalFilter {

    private Optional<String> optionalValue;

    public OptionalFilter() {
        this.optionalValue = Optional.empty();
    }

    public OptionalFilter(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }

    public Optional<String> getValueIfStartsWithVowel() {
        return null;
    }
}
