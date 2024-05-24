package org.example;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ReflectionDemoTest {
    @Test
    public void countHumansTest() {
        List<Object> result = new ArrayList<>();
        result.add(new Human());
        result.add(new Student());
        result.add(new Other());
        result.add(new First_year());
        assertEquals(3, ReflectionDemo.countHumans(result));
    }
    @Test
    public void getPublicMethodNamesTest() {
        Student s = new Student();
        List<String> expected = new ArrayList<>();
        expected.add("test2");
        expected.add("test");
        assertEquals(expected, ReflectionDemo.getPublicMethodNames(s));
    }
    @Test
    public void getSuperClassNamesTest() {
        First_year f = new First_year();
        List<String> expected = new ArrayList<>();
        expected.add("First_year");
        expected.add("Student");
        expected.add("Human");
        assertEquals(expected, ReflectionDemo.getSuperClassNames(f));
    }
}