package homeworkStack;

import java.util.ArrayList;
import java.util.List;

public class customStack {
    private final List<Integer> startList=new ArrayList<>();

    public customStack() {
    }

    public void customPush(int item){
        startList.addFirst(item);
        System.out.println("Элемент "+item+" был добавлен в стек:"+startList);

    }
    public void customPop(){
        System.out.println("Элемент "+startList.removeFirst()+" был вынут из стека: "+startList);

    }

}
