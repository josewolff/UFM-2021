package unitTesting;

import calculadora.Suma;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumaTests {

    @Test
    public void sumaTestCase(){
        final int number1 = 2;
        final int number2 = 3;
        final int expectedResult = 5;
        Suma suma =  new Suma();
        int currentResult = suma.add(number1,number2);
        Assert.assertEquals(currentResult,expectedResult, "No es igual el resultado");
    }
}
