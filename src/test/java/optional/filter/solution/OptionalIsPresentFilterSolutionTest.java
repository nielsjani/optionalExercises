package optional.filter.solution;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

public class OptionalIsPresentFilterSolutionTest {

    @Test
    public void getNonEmptyOptionals_ShouldFilterOutAllEmptyValues() {
        Optional<String> nonEmptyOptional1 = Optional.ofNullable("1");
        Optional<Integer> nonEmptyOptional2 = Optional.ofNullable(3);
        Optional<Double> nonEmptyOptional3 = Optional.ofNullable(5.1D);
        List<Optional> nonEmptyOptionals = new OptionalIsPresentFilterSolution(
                newArrayList(nonEmptyOptional1, Optional.empty(), nonEmptyOptional2, Optional.empty(), nonEmptyOptional3)
        )
                .getNonEmptyOptionals();

        assertThat(nonEmptyOptionals).hasSize(3).contains(nonEmptyOptional1, nonEmptyOptional2, nonEmptyOptional3);
    }
}