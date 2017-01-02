package optional.filter.solution;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

public class OptionalFilterSolution {

    private Optional<String> optionalValue;

    public OptionalFilterSolution() {
        this.optionalValue = Optional.empty();
    }

    public OptionalFilterSolution(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }

    public Optional<String> getValueIfStartsWithVowel() {
        List<String> vowels = Lists.newArrayList("a", "e", "i", "o", "u");
        return optionalValue.filter(value -> vowels.contains(value.toLowerCase().substring(0,1)));
    }
}
