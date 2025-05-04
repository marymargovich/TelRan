public class homework4_calculator {
    public static void main(String[] args) {
        System.out.println("_______________Switch expression____________________");
        double res = calculatorSwitch(5, 6, '&');
        System.out.println("Result = " + res);
        System.out.println();

        System.out.println("_______Arrow syntax in switch expression_____________");
        res = calculatorSwitch2(5,34,'^');
        System.out.println("Result = "+ res);


    }

    public static double calculatorSwitch(double num1,
                                          double num2,
                                          char action) {
        double result = 0;
        switch (action) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            case '%': result = num1 * num2 / 100; break;
            case '^': result = 1;
                while (num2 > 0) {
                    result *= num1;
                    num2--;
                }
                return result;
            default:
                System.out.println("\u001B[31m" + "Wrong action!" + "\u001B[0m");
                result = 0. / 0.;

        }
        return result;

    }

    public static double calculatorSwitch2(double num1,
                                           double num2,
                                           char action) {
        double result2 = switch (action) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '/' -> num1 / num2;
            case '*' -> num1 * num2;
            case '%' -> num1 * num2 / 100;
            case '^' -> {
                double result = 1;
                while (num2 > 0) {
                    result *= num1;
                    num2--;
                }
                yield result;
            }
            default -> {
                System.out.println("\u001B[31m" + "Wrong action!" + "\u001B[0m");
                yield 0. / 0.;

            }
        };
        return result2;
    }
}