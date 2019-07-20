package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;


/*
    Write a program that reads a class name and a list of arguments, and creates an object of that class
    where the read arguments are passed to the constructor.
 */
public class DynamicConstruction {
    public static void main(String[] args) {

        try {
            BufferedReader input;
            input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the name of a class and its arguments; separated by whitespace:");
            String inputString = input.readLine();
            String[] inputArray = inputString.split(" ");
            ArrayList<String> argumentList = new ArrayList<>(Arrays.asList(inputArray).subList(1, inputArray.length));

            Class c = Class.forName(inputArray[0]);

            //Iterate Constructors of Class
            for(Constructor iter : c.getDeclaredConstructors()) {

                //Check Constructors to find an appropriate one
                if(iter.getParameterCount() == 1) {
                    if(iter.getParameterTypes()[0].getTypeName().equals(String.class.getTypeName())) {

                        Object reflectedObj = iter.newInstance(argumentList.toString());
                        System.out.println("Object of type: " + iter.getParameterTypes()[0].getTypeName() +
                                " created: " + reflectedObj.getClass());
                    }

                }
            }

        } catch (ClassNotFoundException | IndexOutOfBoundsException | IOException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
