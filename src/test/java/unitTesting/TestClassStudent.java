package unitTesting;

import calculadora.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassStudent {

    @Test
    public void testCaseStudent(){
        Student student =  new Student(55500, "Nickolas", "Nolte");
        boolean isValid = student.verifyCarne(student);
        boolean expectedResult = true;
        Assert.assertEquals(isValid,expectedResult);

    }
}
