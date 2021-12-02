package ec.edu.epn.calculator;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{
    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("SetUpClass");
    }
    @Before
    public void setUp(){
        System.out.println("SetUp()");
        c = new Calculator();
    }
    @Test
    public void given_two_integers_when_add_then_ok(){
       assertEquals(6, c.addition(3,3));
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(7, c.subtraction(10,3));
    }
    @Test(expected = ArithmeticException.class)
    public void give_two_integers_when_division_then_exeption(){
        assertEquals(1,c.division(1,0),0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exeption(){
        c.timeOut(100);
    }

    @After
    public void tearDown(){
        c.setAnswer(0);
    }




}