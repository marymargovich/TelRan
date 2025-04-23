public class TypesAppl {
    public static void main(String[] args) {
        byte b = -128;
        System.out.println("byte: " + b); // from -128 to 127

        short a = 32767;// from -32768 to 32767
        System.out.println("short: " + a);

        int c = -2_147_483_648; // from 2_147_483_647 to 2_147_483_647
        System.out.println("int: "+ c);

        long l = 2_147_483_649L; //-9223372036854775808 to 9223372036854775808
        System.out.println("long: "+ l);

        float f = 20.9f;//  from 3.4e-038 to 3.4e+038
        System.out.println("float: "+ f);

        double d = 4.2;// // from 1.7e-308 to 1.7e+308
        System.out.println("double: "+ d);

        char ch = 'j';//a single character/letter
        System.out.println("char: "+ ch);

        char ch1 = 50;// ASCII values
        System.out.println("char1: "+ ch1);

        boolean flag = true;// true , false
        System.out.println("boolean: "+ flag);

























    }

}
