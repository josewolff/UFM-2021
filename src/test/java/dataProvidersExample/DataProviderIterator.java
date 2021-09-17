package dataProvidersExample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderIterator {

    @DataProvider(name = "getValues", parallel = true)
    public Iterator<Object[]> getValues(){
        List<Object[]> values =  new ArrayList<>();
        String name = "Test";
        for (int i = 0; i < 10; i++){
            if(i > 25){
                name = "Fail";
            }
            values.add(new Object[]{i,name});
        }
        return values.iterator();
    }

    @Test(dataProvider = "getValues", groups = {"dataProvider"})
    public void dataProviderTest(int value, String name) throws InterruptedException {
        System.out.println("Value: " + value + " - " + name);
        Thread.sleep(1000);
        Assert.assertEquals(name,"Test", "El valor esesperado es Test");
    }
}
