package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/*
  Write a Java program that reads the name of a class from the command line and emits the interface of
  the class in Java syntax (interface or class, modifiers, constructors, methods, fields; no method bodies).
 */
public class Introspection {
    public static void main(String[] args) {
        Scanner sc;
        try {
            //Read a class from terminal and output the simplified name; if it is a proper Class name
            sc = new Scanner(System.in);
            System.out.println("Enter the name of a class: ");
            String inputClass = sc.next();
            Class c = Class.forName(inputClass);

            for(Class iter : c.getInterfaces()){
                System.out.println(iter);
            }

            System.out.println(c.getSimpleName());

            System.out.println(c.getModifiers());

            for(Constructor iter : c.getConstructors()){
                System.out.println(iter);
            }

            for(Method iter : c.getMethods()){
                System.out.println(iter);
            }

            for(Field iter : c.getFields()){
                System.out.println(iter);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
