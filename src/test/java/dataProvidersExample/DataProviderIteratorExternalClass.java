package dataProvidersExample;

import dataProvidersExample.dataProviders.DataProvidersOnly;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderIteratorExternalClass {

    @Test(dataProviderClass = DataProvidersOnly.class,
            dataProvider = "getValues",
            groups = {"dataProvider"})
    public void dataProviderTest(int value, String name) throws InterruptedException {
        System.out.println("Value: " + value + " - " + name);
        Thread.sleep(1000);
        Assert.assertEquals(name,"Test", "El valor esesperado es Test");
    }
}
