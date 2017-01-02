package optional.ifpresent.exercise;

import optional.common.MyService;

import java.util.Optional;

public class OptionalIfPresent {

    private MyService myService;
    private Optional<String> optionalValue;

    public OptionalIfPresent(MyService myService) {
        this.optionalValue = Optional.empty();
        this.myService = myService;
    }

    public OptionalIfPresent(String optionalValue, MyService myService) {
        this.optionalValue = Optional.ofNullable(optionalValue);
        this.myService = myService;
    }

    public void notifyMyService() {
    }
}
