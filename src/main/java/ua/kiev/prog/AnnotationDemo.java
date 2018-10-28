package ua.kiev.prog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) {

        Mult mult = new Mult();
        Class<?> cls = mult.getClass();

        try {
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodParameters.class)) {
                MethodParameters mParams = method.getAnnotation(MethodParameters.class);
                int res = (Integer)method.invoke(mult, mParams.a(), mParams.b());
                System.out.println(res);
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
