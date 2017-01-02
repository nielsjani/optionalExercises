package optional.ifpresent.exercise;

import optional.common.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionalIfPresentTest {
    @Mock
    private MyService myService;

    @Test
    public void notifyMyService_GivenOptionalNotEmpty_ThenCallMyServiceWithOptionalValue() {
        new OptionalIfPresent("VALUE", myService).notifyMyService();

        Mockito.verify(myService, Mockito.times(1)).notify(Matchers.eq("VALUE"));
    }

    @Test
    public void notifyMyService_GivenOptionalEmpty_ThenDoNotCallMyService() {
        new OptionalIfPresent(myService).notifyMyService();

        Mockito.verify(myService, Mockito.never()).notify(Matchers.eq("VALUE"));
    }
}