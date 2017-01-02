package optional.typedoptionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TypedOptionals {

    //No Map, Flatmap or Filter methods.
    //No construction with ofNullable
    //Get replaced by GetAsDouble/-Long/-Int. Still a dangerous method

    public OptionalDouble getOptionalDouble() {
        return OptionalDouble.of(1D);
    }

    public OptionalLong getOptionalLong() {
        return OptionalLong.of(1L);
    }

    public OptionalInt getOptionalInt() {
        return OptionalInt.of(1);
    }
}
