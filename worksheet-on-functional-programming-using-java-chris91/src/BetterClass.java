import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BetterClass {

    public static String betterString(String s1, String s2, TwoStringPredicate t){

        if(t.decideBetter(s1, s2)){
            return s1;
        }
        return s2;
    }

    public static <E> E betterElement(E e1, E e2, TwoElementPredicate t){

        if(t.decideBetter(e1, e2)){
            return e1;
        }
        return e2;
    }

    @FunctionalInterface
    public interface TwoElementPredicate<E>{
        Boolean decideBetter(E e1, E e2);
    }

    @FunctionalInterface
    public interface TwoStringPredicate{
        Boolean decideBetter(String s1, String s2);
    }

    // 5.
    public static List<String> allMatches(List<String> inputList, Predicate<String> pr){
        List<String> matched = new ArrayList<>();
        for(String s : inputList){
            if(pr.test(s)){
                matched.add(s);
            }
        }
        return matched;
    }

    // 6. Same as 5. with generics
    public static <E> List<E> allMatchesGeneric(List<E> inputList, Predicate<E> pr){
        List<E> matched = new ArrayList<>();
        for(E e : inputList){
            if(pr.test(e)){
                matched.add(e);
            }
        }
        return matched;
    }

    public static void main(String[] args){
        String result = BetterClass.betterString("haha", "hoho", (x, y) -> x.length() > y.length());
        System.out.println(result);


        result = BetterClass.betterElement("haha", "hoho", Object::equals);
        System.out.println(result);


        List<String> input = new ArrayList<>();
        input.add("Hello");
        input.add("World");
        input.add("Chris");
        input.add("Here");

        List<String> matchedResults = allMatches(input, s -> s.length() < 5);
        for(String s : matchedResults){
            System.out.println(s);
        }


    }
}
