package homeworkHashMap;

import java.util.*;

//Реализуйте метод, который поменяет ключи и значения в HashMap местами.
//На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "Вадим");
        hashMap.put(14, "Кирилл");
        hashMap.put(16, "Анатолий");
        hashMap.put(9, "Владимир");
        hashMap.put(15, "Владимир");
        System.out.println("Начальная коллекция: "+ hashMap);

        HashMap<String, Integer> resoultHashMap = reverseKeyValue(hashMap);
        System.out.println("Итоговая коллекция: "+resoultHashMap);


    }

    private static HashMap<String, Integer> reverseKeyValue(HashMap<Integer, String> startHashMap) {
        Set<Integer> setKeysInt = startHashMap.keySet();
        List<Integer> intList = new ArrayList<>(setKeysInt);

        Collection<String> collValue = startHashMap.values();
        List<String> valList = new ArrayList<>(collValue);


        HashMap<String, Integer> resoultHashMap = new HashMap<>();
        int i = 0;
        while (startHashMap.size() > i) {
            resoultHashMap.put(valList.get(i), intList.get(i));
            i++;
        }
        return resoultHashMap;
    }
}
