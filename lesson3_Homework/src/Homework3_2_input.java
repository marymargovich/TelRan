import java.util.Scanner;

public class Homework3_2_input {
    public static void main(String[] args) {
        System.out.println("___________Task 1_DivisionByThree _ input");
        System.out.println("Enter number: ");
        Scanner console1 = new Scanner(System.in);
        while (!console1.hasNextInt()) {
            System.out.println("That's not a number! Try again:");
            console1.next();
        }
        int number = console1.nextInt();

        boolean res = DivisionByThree(number);
        if (res)
            System.out.println("Your number is divisible by 3");
        else
            System.out.println("Your number is NOT divisible by 3");
        System.out.println();



        System.out.println("___________TASK 2_SumPositiveEven_input_________");
        Scanner console2 = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        while (!console2.hasNextInt()) {
            System.out.println("That's not a number! Try again:");
            console2.next();
        }
        int x = console2.nextInt();


        System.out.print("Enter number 2: ");
        while (!console2.hasNextInt()) {
            System.out.println("That's not a number! Try again:");
            console2.next();
        }
        int y = console2.nextInt();

        System.out.print("Enter number 3: ");
        while (!console2.hasNextInt()) {
            System.out.println("That's not a number! Try again:");
            console2.next();
        }
        int z = console2.nextInt();
        int result = SumPositiveEven(x, y, z);

        if (result > 0 && result % 2 == 0)
            System.out.println("Positive even sum");
        else
            System.out.println("sum = " + result);
        System.out.println();

        System.out.println("___________TASK 2_2_SumPositiveEven__Ternary operator_input_________");
        String replaySum = result > 0 && result % 2 == 0 ? "Positive even sum" : "sum = " + result;
        System.out.println(replaySum);






        System.out.println("__________TASK 3***_input___________");
        Scanner console3 = new Scanner(System.in);


        System.out.print("Enter age: ");
        while (!console3.hasNextInt()) {
            System.out.println("That's not a valid age! Try again.");
            console3.next();
            System.out.print("Enter age: ");
        }
        int age = console3.nextInt();

        System.out.print("Enter your income per month: ");
        while (!console3.hasNextFloat()) {
            System.out.println("That's not a valid income! Try again.");
            console3.next();
            System.out.print("Enter your income per month: ");
        }
        float incomePerMonth = console3.nextFloat();

        System.out.print("Enter if you have debt (+/-): ");
        char debt = console3.next().charAt(0);
        boolean debtB = false;
        if (debt == '+')
            debtB = true;

        boolean loanResult = loanPermission(age, incomePerMonth, debtB);
        if (loanResult) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }

        System.out.println("__________TASK 3.2***_Ternary operator_input___________");
        String replayLoan = (age >= 21) && (incomePerMonth >= 12000) && !debtB ?
                "Loan approved" : "Loan denied";
        System.out.println(replayLoan);


    }
        private static boolean loanPermission(int age, float incomePerMonth, boolean debtB) {
             if (((age >= 21) && (incomePerMonth >= 12000) && !debtB)) {
                 return true;
            } else {
                 return false;
             }

    }



        private static int SumPositiveEven ( int x, int y, int z) {
            return x + y + z;
        }



        public static boolean DivisionByThree(int number) {
            return number % 3 == 0;
        }
    }



