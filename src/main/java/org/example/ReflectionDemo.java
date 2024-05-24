package org.example;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {
    public static <T> int countHumans(List<T> objects) {
        int count = 0;
        for (T i : objects) {
            if (i instanceof Human || i.getClass().isAssignableFrom(Human.class)) {
                count++;
            }
        }
        return count;
    }

    public static List<String> getPublicMethodNames(Object obj) {
        List<String> methodNames = new ArrayList<>();
        Method[] methods = obj.getClass().getMethods();
        for (Method i : methods) {
            if (i.getDeclaringClass() != Object.class) {
                methodNames.add(i.getName());
            }
        }
        return methodNames;
    }

    public static List<String> getSuperClassNames(Object obj) {
        List<String> superClassNames = new ArrayList<>();
        Class<?> c = obj.getClass();
        while (c != null && c != Object.class) {
            superClassNames.add(c.getSimpleName());
            c = c.getSuperclass();
        }
        return superClassNames;
    }
}