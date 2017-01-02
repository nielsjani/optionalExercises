package optional.filter.solution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalIsPresentFilterSolution {

    private List<Optional> optionalValues;

    public OptionalIsPresentFilterSolution(List<Optional> optionalValues) {
        this.optionalValues = optionalValues;
    }

    public List<Optional> getNonEmptyOptionals(){
        return optionalValues.stream()
                .filter(Optional::isPresent)
                .collect(Collectors.toList());
    }
}
