public class Homework3_Task3 {
    public static void main(String[] args) {
        System.out.println("__________TASK 3***___________");
        int age = 34;
        int incomePerMonth = 11000;
        boolean debt = true;
        if (((age >= 21) && (incomePerMonth >= 12000) && !debt)) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }


        age = 28;
        incomePerMonth = 21000;
        debt = false;
        System.out.println("__________TASK 3.2***___________");
        String replay = (age >= 21) && (incomePerMonth >= 12000) && !debt ?
                "Loan approved" : "Loan denied";
        System.out.println(replay);


        System.out.println("__________TASK 3.3***___________");
        age = 10;
        incomePerMonth = 11000;
        debt = true;
        boolean result = LoanPossibility(age, incomePerMonth,debt);
        if (result){
            System.out.println("Loan approved");
        }else{
            System.out.println("Loan denied");
        }

    }

    private static boolean LoanPossibility(int age, int incomePerMonth, boolean debt) {
        if((age >= 21) && (incomePerMonth >= 12000) && !debt ){
            return true;
        }else{
            return false;
        }

    }


}

