package org.example;
import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws Exception  {

     MyClass myObject = new MyClass(10);

        // MyClass sınıfının bir nesnesi üzerinden sınıf bilgisi elde edilir
        Class cls =myObject.getClass();
        System.out.println("Class Name: "+cls.getName());

        // MyClass sınıfındaki tüm metotlar listelenir
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
        }
        // MyClass sınıfındaki tüm özellikler listelenir
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Property Name: " + field.getName());
            System.out.println("Property Value: " + field.get(myObject));
        }


    }
}