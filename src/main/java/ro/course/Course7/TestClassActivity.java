package ro.course.Course7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClassActivity {
    @DataProvider
    public Object [][] displayDataProvider() {
        return new Object[][]{
                {"Un text"},
                {"pentru testat"},
                {"in cadrul activitatii"},
        };
    }

    @Test(dataProvider = "displayDataProvider")
    public void test1(String param) {
        printString(param);
    }

    public void test2(){
        System.out.println("Test din tests");
    }
    private void printString(String string) {
        System.out.println(string);
    }
}
