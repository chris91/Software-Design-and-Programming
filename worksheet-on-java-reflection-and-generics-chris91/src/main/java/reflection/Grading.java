package reflection;

import java.io.IOException;
import java.util.ArrayList;

/*
    Mock assignment Class
 */
public class Grading {

    private static int id;
    private static String firstName;
    private String lastName;
    ArrayList<Double> grades;

    public Grading() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Grading.id = id;
    }

    private static void doSomething(){

    }

    private static void doSomethingElse()throws IOException{

    }

}
