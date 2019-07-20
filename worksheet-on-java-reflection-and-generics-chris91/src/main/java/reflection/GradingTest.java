package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static java.lang.reflect.Modifier.isPrivate;
import static org.junit.jupiter.api.Assertions.*;

/*
   Write a JUnit test to help grade the internal correctness of a student’s
   submitted program for a hypothetical assignment.
 */
public class GradingTest {

    // 1.
    @Test
    public void shouldHaveLessThanFourFields() {
        Class c = Grading.class;
        int numOfFields = c.getDeclaredFields().length;
        assertTrue(numOfFields < 4, "Fields of your Class should be less than 4");
    }

    // 2.
    @Test
    public void shouldHaveOnlyPrivateFields(){
        Class c = Grading.class;
        for(Field f : c.getDeclaredFields()){
            assertTrue(isPrivate(f.getModifiers()), "Fields of your Class are not allowed to be non-static");
        }
    }

    // 3.
    @Test
    public void shouldNotHaveArrayListFields(){
        Class c = Grading.class;
        for(Field f : c.getDeclaredFields()) {
            assertNotEquals("java.util.ArrayList",f.getType().getName(),"Should not have any ArrayList" +
                    " type Field");

        }
    }

    // 4.
    @Test
    public void shouldNotHaveMoreThanTwoPrivateMethods(){
        Class c = Grading.class;
        int methCount = 0;
        for(Method m : c.getDeclaredMethods()){
            if(isPrivate(m.getModifiers())){
                methCount++;
            }
        }
        assertTrue(methCount>=2, "Class has less than two helper methods");
    }

    // 5.
    @Test
    public void shouldNotHaveThrowClause(){
        Class c = Grading.class;
        for(Method m : c.getDeclaredMethods()){
            for(Type t : m.getExceptionTypes()){
                assertTrue(t.getTypeName()==null, "Class has method that throws exception");
            }
        }
    }

    // 6.
    @Test
    public void shouldNotReturnInt(){
        Class c = Grading.class;
        for(Method m : c.getDeclaredMethods()){
            assertNotEquals("int", m.getGenericReturnType().getTypeName(), "Class has method that " +
                    "returns int");
        }
    }

    // 7.
    @Test
    public void shouldHaveEmptyConstructor(){
        Class c = Grading.class;
        for(Constructor con : c.getDeclaredConstructors()){
            assertEquals(0, con.getParameterCount(), "Missing empty Constructor");
        }
    }

}
