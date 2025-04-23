public class HW2 {
    public static void main(String[] args) {
        System.out.println("Hello, programmer");
        function6();
        function1();
        function2();
        System.out.println("Bye-bye, programmer");
    }

    private static void function2() {
        System.out.println("f2");
        function6();
    }

    private static void function1() {
        System.out.println("f1");
        function4();
    }

    private static void function6() {
        System.out.println("f6");

        
    }

    private static void function4() {
        System.out.println("f4");
        function5();
    }

    private static void function5() {
        System.out.println("f5");
        function6();
    }

    private static void function3(){
        System.out.println("f3");

    }

}
