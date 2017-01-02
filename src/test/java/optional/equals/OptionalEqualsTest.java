package optional.equals;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalEqualsTest {

    @Test
    public void twoOptionalsAreEqualIf_TheyAreBothOptionals_AndTheirValuesAreEqualsAccordingToTheirEqualMethods() {
        Optional<Foo> optional1 = Optional.of(new Foo(5));
        Optional<Foo> optional2 = Optional.of(new Foo(5));

        assertThat(optional1).isEqualTo(optional2);
    }

    @Test
    public void twoOptionalsAreEqualIf_TheyAreBothOptionals_AndTheirValuesAreBothEmpty() {
        Optional<Foo> optional1 = Optional.empty();
        Optional<Foo> optional2 = Optional.empty();

        assertThat(optional1).isEqualTo(optional2);
    }

    @Test
    public void twoOptionalsAreNOTEqualIf_TheyAreBothOptionals_AndOneIfEmptyAndTheOtherIsNot() {
        Optional<Foo> optional1 = Optional.empty();
        Optional<Foo> optional2 = Optional.of(new Foo(8));

        assertThat(optional1).isNotEqualTo(optional2);
    }

    @Test
    public void twoOptionalsAreNOTEqualIf_TheyAreBothOptionals_AndTheEqualsMethodOfTheirValuesReturnFalse() {
        Optional<Foo> optional1 = Optional.of(new Foo(111));
        Optional<Foo> optional2 = Optional.of(new Foo(8));

        assertThat(optional1).isNotEqualTo(optional2);
    }

    @Test
    public void twoOptionalsAreNOTEqualIf_TheyAreNotBothOptionals() {
        Optional<Foo> optional1 = Optional.of(new Foo(111));
        Foo notAnOptional = new Foo(111);

        assertThat(optional1).isNotEqualTo(notAnOptional);
    }

    public class Foo {

        private int bars;

        public Foo(int bars) {
            this.bars = bars;
        }

        @Override
        public boolean equals(Object obj) {
            Foo other = (Foo) obj;
            return this.bars == other.bars;
        }
    }
}