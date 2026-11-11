package by.it_academy.practice.practice2;

public class ExampleLiteral {
    public static void main(String[] args) {
        String str = "Hello";

        int num10 = 10; // 10 metric sys
        System.out.println("num10 = " + num10);
        int num13 = 0b1101; // 2 metric sys
        System.out.println("num13 = " + num13);
        int num8 = 010; // 8 metric sys
        System.out.println("num8 = " + num8);
        int num111 = 0x6F; // 16 metric sys  0123456789ABCDEF
        System.out.println("num111 = " + num111);

        int num123 = 123_123_123;
        System.out.println("num123 = " + num123);

        char c1 = '5';
        System.out.println("c1 = " + c1);
        char c2 = 35;
        System.out.println("c2 = " + c2);
        char c3 = '\u0066';
        System.out.println("c3 = " + c3 );


    }
}
