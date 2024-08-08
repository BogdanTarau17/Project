package homeworks.bogdantarau.homework1;

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result = 0;

            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
            }
            System.out.println("The result is " + result);
        } else {
            System.err.println("3 args are needed");
        }
    }
}
