public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("____TASK 1______");
        boolean res = DivisionByThree(10);
        if (res)
            System.out.println("Your number is divisible by 3");
        else
            System.out.println("Your number is NOT divisible by 3");
        System.out.println();


        System.out.println("____TASK 1.2_Ternary operator_____");
        int number = 12;
        String replay = number % 3 == 0 ?
                "Your number is divisible by 3" : "Your number is NOT divisible by 3";
        System.out.println(replay);
        System.out.println();


        System.out.println("___________TASK 2__________");
        int result  = SumPositiveEven(3,12,-4);
        if ( result > 0 && result % 2 == 0)
            System.out.println("Positive even sum");
        else
            System.out.println("sum = "+ result);
        System.out.println();


        System.out.println("___________TASK 2.2_Ternary operator_________");
        result = SumPositiveEven( 10, 13,1);
        String replay1 = result > 0 && result % 2 == 0 ? "Positive even sum": "sum = "+ result;
        System.out.println(replay1);



        System.out.println("__________TASK 3***/char/___________");
        int age = 34;
        float incomePerMonth = 11000;// denied
        char debtC = '-';
        if (((age >= 21) && (incomePerMonth >= 12000) && debtC == '+')) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }


        System.out.println("__________TASK 3.2_Ternary operator***___________");
        age = 28;
        incomePerMonth = 21000;
        boolean debtB = false; //approved
        String replayLoan = (age >= 21) && (incomePerMonth >= 12000) && !debtB ?
                "Loan approved" : "Loan denied";
        System.out.println(replayLoan);


        System.out.println("__________TASK 3.3_method/boolean/***___________");
        age = 10;//denied
        incomePerMonth = 11000;
        debtB = true;
        boolean resultLoan = LoanPossibility(age, incomePerMonth, debtB);
        if (resultLoan) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }

    }

    private static boolean LoanPossibility(int age, float incomePerMonth, boolean debt1) {
        if ((age >= 21) && (incomePerMonth >= 12000) && !debt1) {
            return true;
        } else {
            return false;
        }
    }



    private static boolean DivisionByThree(int number) {
        if (number % 3 == 0)
            return true;
        return false;
    }


    private static int SumPositiveEven(int x, int y, int z) {
        int sum = 0;
        sum = x + y + z;
        return sum;
    }
}










