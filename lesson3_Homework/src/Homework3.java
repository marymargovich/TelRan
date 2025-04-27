//HOMEWORK
//res =  max (50,6);
//res = abs (-50) = 50
//res = min(50,6)

public class Homework3 {
    public static void main(String[] args) {
        double res = max( 50, 60);
        System.out.println("Max number = "+ res);
        System.out.println();

        res = min(50,6);
        System.out.println("Min number = "+ res);
        System.out.println();

        res = abs (-50);
        System.out.println("Number abs = "+ res);
        System.out.println();


        System.out.println("+");
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

