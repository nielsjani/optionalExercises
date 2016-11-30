package optional.get.exercise;

import optional.get.MyService;
import optional.get.Username;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalGetTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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

    @Test
    public void getValueOrThrowException_GivenOptionalValueNotEmpty_ThenReturnOptionalValue() {
        OptionalGet optionalGet = new OptionalGet("VALUE");
        assertThat(optionalGet.getValueOrThrowException()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrThrowException_GivenOptionalValueEmpty_ThenThrowException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("This optional is empty");

        OptionalGet optionalGet = new OptionalGet();
        optionalGet.getValueOrThrowException();
    }

    @Test
    public void mapToUsername_GivenOptionalValueNotEmpty_ThenReturnUsernameWithValueAsName() {
        OptionalGet optionalGet = new OptionalGet("VALUE");
        assertThat(optionalGet.mapToUsername()).isEqualTo(new Username("VALUE"));
    }

    @Test
    public void mapToUsername_GivenOptionalValueEmpty_ThenReturnNull(){
        OptionalGet optionalGet = new OptionalGet();
        assertThat(optionalGet.mapToUsername()).isNull();
    }
}