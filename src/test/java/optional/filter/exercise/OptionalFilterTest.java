package optional.filter.exercise;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalFilterTest {


    @Test
    public void getValueIfStartsWithVowel_GivenOptionalValueStartsWithVowel_ThenReturnOptionalValue() {
        Optional<String> value = new OptionalFilter("Amaterasu").getValueIfStartsWithVowel();

        //AssertJ also has asserts for Optional values
        assertThat(value)
                .isNotEmpty()
                .hasValue("Amaterasu");
    }

    @Test
    public void getValueIfStartsWithVowel_GivenOptionalValueDoesNotStartWithVowel_ThenReturnEmptyOptional() {
        Optional<String> value = new OptionalFilter("Tsukuyomi-no-Mikoto").getValueIfStartsWithVowel();

        assertThat(value)
                .isEmpty();
    }
}