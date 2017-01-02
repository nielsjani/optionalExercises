package optional.filter.exercise;

import java.util.List;
import java.util.Optional;

public class OptionalIsPresentFilter {

    private List<Optional> optionalValues;

    public OptionalIsPresentFilter(List<Optional> optionalValues) {
        this.optionalValues = optionalValues;
    }

    public List<Optional> getNonEmptyOptionals(){
        return null;
    }
}
