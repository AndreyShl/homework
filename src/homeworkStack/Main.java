package homeworkStack;
/*Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop().*/

public class Main {
    public static void main(String[] args) {
        customStack customStack = new customStack();
        customStack.customPush(5);
        customStack.customPush(4);
        customStack.customPush(3);
        customStack.customPush(1);
        customStack.customPush(6);
        customStack.customPop();
    }
}