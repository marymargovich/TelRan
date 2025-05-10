public class hw_for_additional {
    public static void main(String[] args) {
        System.out.println("_________TASK 1_________");
        digitsInRow(7,8);
        System.out.println();

        System.out.println("_____________TASK 2________");
        int a = 12;
        int b = 5;
        digitsBetween(a,b);
        a = 3;
        b = 12;
        digitsBetween(a,b);

        System.out.println("_____________TASK 3________");
        a = 4;
        b = 13;
        digitsBetweenReverse(a,b);


        System.out.println("_____________TASK 4________");
        costOfCandies(15);







    }


    public static void digitsInRow(int k, int n) {
        for (int counter = k; counter != 0; counter--) {
            System.out.print(n);
        }
    }


    public static void digitsBetween(int a, int b){
        if (a >= b) {
            System.out.println("ERROR: 'a' should be less then 'b' ");
            return;
        }
        int counter = 0;
        for(int temp = a ; temp <= b; temp++) {
            System.out.print(temp + " | ");
            counter++;
        }
        System.out.println("\n counter =  " + counter);
        }


    public static void digitsBetweenReverse(int a, int b){
        if (a >= b) {
            System.out.println("ERROR: 'a' should be less then 'b' ");
            return;
        }
        int counter = 0;
        for(int temp = b ; temp >= a; temp--) {
            System.out.print(temp + " | ");
            counter++;
        }
        System.out.println("\n counter =  " + counter);
    }

    public static void costOfCandies(int moneyPerKg){
        for(int counter = 10; counter > 0;counter -- ){
           int value = counter * moneyPerKg;
            System.out.println(counter+ " kg - "+ value+ "nis");
        }

    }






    }
//For1. Даны целые числа K и N (N > 0). Вывести N раз число K.
//For2. Даны два целых числа A и B (A < B).
// Вывести в порядке возрастания все целые числа, расположенные между
// A и B (включая сами числа A и B), а также количество N этих чисел.
//For3. Даны два целых числа A и B (A < B). Вывести в порядке
// убывания все целые числа, расположенные между
// A и B (не включая числа A и B), а также количество N этих чисел.
//For4. Дано вещественное число — цена 1 кг конфет.
// Вывести стоимость 1, 2, …, 10 кг конфет.