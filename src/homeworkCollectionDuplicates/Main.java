package homeworkCollectionDuplicates;
/*Реализуйте функцию для подсчета количества вхождений каждого элемента в список
и возврата списка элементов, которые встречаются более одного раза.
Для этого используйте метод Collections.frequency
Сигнатура функции public List<T> findDuplicates(List<T> list)
Пример:
учитывая список [1,2,3,1,4,5,2] функция должна вернуть [1,2]*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> startList =new ArrayList<>(Arrays.asList(1,2,3,1,4,5,2));
        System.out.println(startList);
        System.out.println(findDuplicates(startList));

    }
    public static List<Integer> findDuplicates(List<Integer> list){
        Set<Integer> resoultSet = new HashSet<>();
        for (Integer integer: list){
            if (Collections.frequency(list,integer)>1){
                resoultSet.add(integer);
            }
        }

        return new ArrayList<>(resoultSet);
    }

}
