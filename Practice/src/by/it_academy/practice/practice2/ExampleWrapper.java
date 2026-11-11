package by.it_academy.practice.practice2;

public class ExampleWrapper {
    public static void main(String[] args) {

        //wrapper example
        Integer i = Integer.valueOf(100);

        Double d = Double.valueOf(100);
        Float f = Float.valueOf(100);

        int intPrim = 10;
        //autoboxing
        Integer intWrap = intPrim;
        //unboxing
        int intPrim1 = intWrap.intValue();
        int intPrim2 = sum(intPrim1, intWrap);
        System.out.println(intPrim2);


    }

    private static int sum(int a, int b) {
        return a + b;
    }

}

