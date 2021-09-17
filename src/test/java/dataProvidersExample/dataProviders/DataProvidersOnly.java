package dataProvidersExample.dataProviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvidersOnly {

    @DataProvider(name = "getValues", parallel = true)
    public Iterator<Object[]> getValues(){
        List<Object[]> values =  new ArrayList<>();
        String name = "Test";
        for (int i = 0; i < 100; i++){
            if(i > 25){
                name = "Fail";
            }
            values.add(new Object[]{i,name});
        }
        return values.iterator();
    }
}
