package ec.edu.epn.calculator;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value=Parameterized.class)
public class CalculatorParametersTest extends TestCase {
    private int a,b,expected;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,5,12});
        objects.add(new Object[]{22,4,26});
        return objects;
    }

    public CalculatorParametersTest(int a,int b,int expected){
        this.a=a;
        this.b=b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_Addition_then_summation(){
        Calculator c = new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected,actual);
    }
}