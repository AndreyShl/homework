package homeworkStack;
/*Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop().*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> startList=new ArrayList<>(Arrays.asList(2,3,4));
        System.out.println(startList);
        System.out.println(customPush(startList,12));
        System.out.println(customPop(startList));


    }

    public static List<Integer> customPop(List<Integer> resoultList){

        System.out.println("Элемент был вынут из стека: "+resoultList.removeFirst());
        return resoultList;
    }

    public static List<Integer> customPush(List<Integer> resoultList,Integer myInt){
        resoultList.addFirst(myInt);
        System.out.format("Элемент %d был добавлен в стек:",myInt);
        return resoultList;
    }
}
