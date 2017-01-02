package optional.antipattern;

import java.util.Optional;

public class IsPresentGet {

    private Optional<String> optionalValue;

    public IsPresentGet(String optionalValue) {
        this.optionalValue = Optional.ofNullable(optionalValue);
    }

    public String getValue() {
        //ANTIPATTERN. You've basically done a literal translation of a null-check to Optional code
        // For a better approach, see OptionalGet class
        return optionalValue.isPresent() ? optionalValue.get() : null;
    }

    public String getValueRecklessly() {
        //ANTIPATTERN. This will throw an exception if the Optional value is Absent. Only do a .get() if you are sure the Optional can never be absent.
        // Most of the time you can not be sure of this, however. For some safer approaches, see OptionalGet class
        return optionalValue.get();
    }
}
