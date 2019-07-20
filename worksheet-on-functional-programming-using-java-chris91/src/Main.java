import java.util.Arrays;
import java.util.Comparator;



public class Main {

    // 2.
    public static int eChecker(String input){
        if(input.contains("e")){
            return 0;
        }
        return 1;
    }


    public static void main(String... args) {
        // 1. String Array sorting exercise
        String[] stringArray = {"Hello", "World", "Chris", "Here"};
        System.out.println(Arrays.asList(stringArray));

        // a)
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        System.out.println(Arrays.asList(stringArray));

        // b)
        Arrays.sort(stringArray, Comparator.comparing(String::length, Comparator.reverseOrder()));
        System.out.println(Arrays.asList(stringArray));

        // c)
        Arrays.sort(stringArray, Comparator.comparing(s -> s.charAt(0)));
        System.out.println(Arrays.asList(stringArray));

        // d)
        Arrays.sort(stringArray, Comparator.comparing(s -> !s.contains("e")));
        System.out.println(Arrays.asList(stringArray));

        // 2.
        Arrays.sort(stringArray, Comparator.comparing(Main::eChecker));
        System.out.println(Arrays.asList(stringArray));


    }
}
