package ec.edu.epn.calculator;

public class CalculatorExecute {

    public static void main(String[] args) {
        System.out.println("Calculator Execute");
        Calculator c = new Calculator();
        int add = c.addition(4,8);
        System.out.println("c.addition(4,8)= "+add);
        int resta = c.subtraction(8,2);
        System.out.println("c.subtraction(8,2)= "+resta);

    }
}
