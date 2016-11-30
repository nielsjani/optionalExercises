package optional.get.exercise;

import optional.get.MyService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalGetTest {

    @Test
    public void getValueOrDefault_GivenOptionalValueNotEmpty_ThenReturnOptionalValue(){
        OptionalGet optionalGet = new OptionalGet("VALUE");
        assertThat(optionalGet.getValueOrDefault()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrDefault_GivenOptionalValueEmpty_ThenReturnDefaultValue(){
        OptionalGet optionalGet = new OptionalGet();
        assertThat(optionalGet.getValueOrDefault()).isEqualTo("DEFAULT");
    }

    @Test
    public void getValueOrUseSupplier_GivenOptionalValueNotEmpty_ThenReturnOptionalValue() {
        OptionalGet optionalGet = new OptionalGet("VALUE");
        assertThat(optionalGet.getValueOrUseSupplier()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrUseSupplier_GivenOptionalValueEmpty_ThenReturnResultOfSupplierFunctionOfMyService(){
        OptionalGet optionalGet = new OptionalGet();
        assertThat(optionalGet.getValueOrUseSupplier()).isEqualTo(new MyService().myServiceSupplier().get());
    }


}