//HOMEWORK
//res =  max (50,6);
//res = abs (-50) = 50
//res = min(50,6)

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("________TASK 1_______");
        double res = max( 50, 60);
        System.out.println("Max number = "+ res);
        System.out.println();

        System.out.println("_______TASK 2________");
        res = min(50,6);
        System.out.println("Min number = "+ res);
        System.out.println();

        System.out.println("_______TASK 3_______");
        res = abs (-50);
        System.out.println("Number abs = "+ res);
        System.out.println();


        System.out.println("_______TASK+ _____");
        int height = 195;
        String replay = height <= 185 ? "Not tall":"I am very tall" ;
        System.out.println(replay);
        System.out.println("My height " + height);


    }

    private static double abs(int y) {
        return y > 0 ? y : - y;
    }


    private static double min(int x, int y) {
        return  x < y ? x : y;
    }


    private static double max(int x, int y) {
        return x > y ? x: y;
    }

}

