package optional.get.solution;

import optional.get.MyService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalGetSolutionTest {

    @Test
    public void getValueOrDefault_GivenOptionalValueNotEmpty_ThenReturnOptionalValue(){
        OptionalGetSolution optionalGet = new OptionalGetSolution("VALUE");
        assertThat(optionalGet.getValueOrDefault()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrDefault_GivenOptionalValueEmpty_ThenReturnDefaultValue(){
        OptionalGetSolution optionalGet = new OptionalGetSolution();
        assertThat(optionalGet.getValueOrDefault()).isEqualTo("DEFAULT");
    }

    @Test
    public void getValueOrUseSupplier_GivenOptionalValueNotEmpty_ThenReturnOptionalValue() {
        OptionalGetSolution optionalGet = new OptionalGetSolution("VALUE");
        assertThat(optionalGet.getValueOrUseSupplier()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrUseSupplier_GivenOptionalValueEmpty_ThenReturnResultOfSupplierFunctionOfMyService(){
        OptionalGetSolution optionalGet = new OptionalGetSolution();
        assertThat(optionalGet.getValueOrUseSupplier()).isEqualTo(new MyService().myServiceSupplier().get());
    }
}