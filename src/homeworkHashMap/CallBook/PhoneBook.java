package homeworkHashMap.CallBook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final HashMap<String, List<Integer>> callBook =new HashMap<>();

    public PhoneBook() {
    }

    public void addContact(String name,Integer number){
        if (!(callBook.containsKey(name))){
            callBook.put(name,new ArrayList<>());
        }
        callBook.get(name).add(number);

    }

   public void printContacts(){
        for (Map.Entry<String, List<Integer>> callBook:callBook.entrySet()){
            String name = callBook.getKey();
            List<Integer> numbers = callBook.getValue();
            System.out.println(name+": "+numbers);
        }
    }


}
