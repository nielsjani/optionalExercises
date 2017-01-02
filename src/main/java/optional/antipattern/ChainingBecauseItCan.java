package optional.antipattern;

import java.util.Optional;

public class ChainingBecauseItCan {

    //ANTIPATTERN Don't create Optional just so you can chain methods off of it and then unpack the value.
    // This decreases readability
    //If optional chains are nested or has intermediate results of Optional<Optional<T>>, it's probably too complex. Using if statements is not a crime.
    public String letsChain(String input){
        return Optional.ofNullable(input).map(String::toLowerCase).orElse("someDefault");
    }

    //BETTER
    public String letsNotChain(String input) {
        return input != null ? input.toLowerCase() : "someDefault";
    }
}
