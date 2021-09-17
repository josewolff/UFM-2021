package parameters;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    @Test
    @Parameters({"firstName"})
    public void parameterTest(@Optional("Wolff") String firstName){
        if(firstName.equalsIgnoreCase("Jose")){
            Assert.fail("El nombre el Jose ");
        }
        System.out.println("firstname -- " + firstName);
        System.out.println("Parameter Test");

    }
}
