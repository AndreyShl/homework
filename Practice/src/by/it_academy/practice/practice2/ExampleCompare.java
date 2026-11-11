package by.it_academy.practice.practice2;

public class ExampleCompare {
    public static void main(String[] args) {
        int a = 11;
        int b = 10;
//        boolean result = a == b;
//        System.out.println("a == b :" + result);


        System.out.println("a == b :" + (a == b));
        int c = sum(a, b);
        String str = "Hello \nWorld";
        System.out.println(str);



//        String str2 = str.toLowerCase();
//        System.out.println(str2);
//        int[] intAray = {1,3,4};



/*        System.out.println("a == b :" + (a == b));
        int c100 = sum(a, b);
        String str = "Hello \nWorld";
        System.out.println(str);*/
    }

    private static int sum(int a, int b) {
        return a + b;
    }

}
