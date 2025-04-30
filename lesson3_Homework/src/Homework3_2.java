public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("____TASK 1______");
        boolean res = DivisionByThree(10);
        if (res)
            System.out.println("Your number is divisible by 3");
        else
            System.out.println("Your number is NOT divisible by 3");
        System.out.println();


        System.out.println("____TASK 1.2______");
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


        System.out.println("___________TASK 2.2__________");
        result = SumPositiveEven( 10, 13,1);
        String replay1 = result > 0 && result % 2 == 0 ? "Positive even sum": "sum = "+ result;
        System.out.println(replay1);







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










