package optional.get.solution;

import optional.common.MyService;
import optional.common.Username;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalGetSolutionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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


    @Test
    public void getValueOrThrowException_GivenOptionalValueNotEmpty_ThenReturnOptionalValue() {
        OptionalGetSolution optionalGet = new OptionalGetSolution("VALUE");
        assertThat(optionalGet.getValueOrThrowException()).isEqualTo("VALUE");
    }

    @Test
    public void getValueOrThrowException_GivenOptionalValueEmpty_ThenThrowException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("This optional is empty");

        OptionalGetSolution optionalGet = new OptionalGetSolution();
        optionalGet.getValueOrThrowException();
    }

    @Test
    public void mapToUsername_GivenOptionalValueNotEmpty_ThenReturnUsernameWithValueAsName() {
        OptionalGetSolution optionalGet = new OptionalGetSolution("VALUE");
        assertThat(optionalGet.mapToUsername()).isEqualTo(new Username("VALUE"));
    }

    @Test
    public void mapToUsername_GivenOptionalValueEmpty_ThenReturnNull(){
        OptionalGetSolution optionalGet = new OptionalGetSolution();
        assertThat(optionalGet.mapToUsername()).isNull();
    }

    @Test
    public void flatMap_GivenOptionalValue_ThenReturnMappedOptional(){
        OptionalGetSolution optionalGet = new OptionalGetSolution("size5");
        assertThat(optionalGet.flatMap())
                .isNotEmpty()
                .contains("5");
    }

    @Test
    public void flatMap_GivenOptionalValueEmpty_ThenReturnEmptyOptional(){
        OptionalGetSolution optionalGet = new OptionalGetSolution();
        assertThat(optionalGet.flatMap())
                .isEmpty();
    }
}