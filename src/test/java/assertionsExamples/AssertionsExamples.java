package assertionsExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsExamples {


    @Test(groups = {"assertions"})
    public void hardAssert(){
        System.out.println("Hard Assert.");
        //Assert.fail("Hard Assert Fail");
    }

    @Test(groups = {"assertions"})
    public void hardAssertValidation(){
        System.out.println("hardAssertValidation");
        Assert.assertEquals(1,2,"El valor actual no es igual al esperado.");
        System.out.println("hardAssertValidation - after fail");
    }

    @Test(groups = {"assertions"})
    public void softAssertExample(){
        System.out.println("SoftAssert - Before");
        SoftAssert softAssert =  new SoftAssert();
        softAssert.assertEquals(1,3," Los valoes no son iguales.");
        softAssert.fail("Fail");
        System.out.println("SoftAssert - After");
        softAssert.assertAll();
    }
}
