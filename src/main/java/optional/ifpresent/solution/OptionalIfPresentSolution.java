package optional.ifpresent.solution;

import optional.common.MyService;

import java.util.Optional;

public class OptionalIfPresentSolution {

    private MyService myService;
    private Optional<String> optionalValue;

    public OptionalIfPresentSolution(MyService myService) {
        this.optionalValue = Optional.empty();
        this.myService = myService;
    }

    public OptionalIfPresentSolution(String optionalValue, MyService myService) {
        this.optionalValue = Optional.ofNullable(optionalValue);
        this.myService = myService;
    }

    public void notifyMyService() {
        optionalValue.ifPresent(value -> myService.notify(value));
    }
}
