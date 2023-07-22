package ro.course.Course06;

import org.junit.*;

public class TestWorkInClass {
    @Test
    public void myTestMethod() {
        System.out.println("Hello world");
    }
    @Test
    public void myTestMethod2(){
        System.out.println("Hello World Again");
    }
    @Before
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }
    @After
    public void afterMethod() {
        System.out.println("This method runs after each test");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This method runs before class, but runs only ones");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("This method runs after class, but runs only ones");
    }
}
