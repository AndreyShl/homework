package homeworkHashMap.CallBook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> callBook = new HashMap<>();

        callBook.put("Вадим", new ArrayList<>());
        callBook.put("Кирилл", new ArrayList<>());
        callBook.put("Андрей", new ArrayList<>());
        callBook.get("Вадим").add(37593829);
        callBook.get("Вадим").add(123);
        callBook.get("Вадим").add(345);
        callBook.get("Кирилл").add(1569);
        callBook.get("Кирилл").add(25874);
        callBook.get("Андрей").add(112255);
        callBook.get("Андрей").add(223345);


        for (Map.Entry<String, List<Integer>> entry : callBook.entrySet()) {

            String name = entry.getKey();
            List<Integer> numbers = entry.getValue();
            System.out.println(name+": "+numbers);


        }


    }


}


