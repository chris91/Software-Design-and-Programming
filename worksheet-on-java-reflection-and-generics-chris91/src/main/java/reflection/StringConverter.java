package reflection;


import java.lang.reflect.Field;
import java.util.Scanner;

public class StringConverter {

    public static void main(String[] args) {

        try {
            Scanner sc;
            sc = new Scanner(System.in);
            System.out.println("Enter the name of a class: ");
            String inputClass = sc.next();

            printToString(inputClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void printToString(String input) throws ClassNotFoundException {

        Class c = Class.forName(input);
        for(Field f : c.getFields()) {
            System.out.println(f);
        }

    }
}
