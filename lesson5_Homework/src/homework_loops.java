public class homework_loops {
    public static void main(String[] args) {
        System.out.println("_________TASK 1_________");
        int res =countDigits(122333);
        System.out.println("Count digits = " + res);
        System.out.println();

//        res = countDigits2(14566);
//        System.out.println("Count digits = " + res);
//        System.out.println();

        System.out.println("____________TASK 2__________");
        luckyNumber(173854);


    }

    private static int countDigits(int i) {
        int counter = 0;
        if( i ==0){
            return 1;
        }
        while(i !=0){
            int temp = i % 10;
            counter+=1;
             i = i/10;
        }
        return counter;
    }


    private static void luckyNumber(int num){
        int sum1 = 0;
        int sum2 = 0;
        while( num !=0 ){
            sum1 += num%10;
            num = num/10;
            sum2 += num%10;
            num = num/10;
        }
        if (sum1 == sum2)
            System.out.println("Lucky ticket");
        else
            System.out.println("Unlucky ticket =(");


    }


}
/*
1)public static void main(String[] args) {
int res = countDigits( num: 123);
System.out.println("Count digits = " + res); 1/3
res = countDigits( num: 8); //1
res = countDigits( num: 0); //1

private static int countDigits(int num) { 3 usages
return 0;

2)LuckyNumber (1: 173854); 1/1 + 3+5!= 7+8 + 4 - luckyNumber (i: 173867) ;
private static void luckyNumber(int i) { 2 usages
 */