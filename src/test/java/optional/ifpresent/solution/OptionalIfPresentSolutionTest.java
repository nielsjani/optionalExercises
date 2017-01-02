package optional.ifpresent.solution;

import optional.common.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionalIfPresentSolutionTest {

    @Mock
    private MyService myService;

    @Test
    public void  notifyMyService_GivenOptionalNotEmpty_ThenCallMyServiceWithOptionalValue(){
        new OptionalIfPresentSolution("VALUE", myService).notifyMyService();

        Mockito.verify(myService, Mockito.times(1)).notify(Matchers.eq("VALUE"));
    }

    @Test
    public void  notifyMyService_GivenOptionalEmpty_ThenDoNotCallMyService(){
        new OptionalIfPresentSolution(myService).notifyMyService();

        Mockito.verify(myService, Mockito.never()).notify(Matchers.eq("VALUE"));
    }
}