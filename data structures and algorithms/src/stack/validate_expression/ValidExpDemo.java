package stack.validate_expression;

public class ValidExpDemo {

    public static void main(String[] args) {
        String expression = "((1+2)<> - [])";

        Expression check = new Expression();
        System.out.println(check.validExpression(expression));
    }
}
