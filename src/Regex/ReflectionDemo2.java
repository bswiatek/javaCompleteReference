package Regex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Metody publiczne: ");
            Method methods[] = c.getDeclaredMethods();
            for(int i=0; i<methods.length; i++) {
                int modifiers = methods[i].getModifiers();
                if(Modifier.isPublic(modifiers))
                    System.out.println(" " + methods[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
