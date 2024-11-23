package homeworkCollection;

import java.util.List;
import java.util.UUID;

//создать класс Order, который содержит информацию о заказе (например номер заказа, список товаров (Item) и их стоимость)
//и методы для добавления товаров, удаления товаров, вычисления общей стоимости заказа;
public class Order{
    private UUID numOrder;
    private List<Item> itemsList;

    public Order( List<Item> items) {
        this.numOrder = UUID.randomUUID();
        this.itemsList = items;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "IdOrder=" + numOrder +
                ", items=" + itemsList +
                '}';
    }

    public int generalCount() {
        int resultCount = 0;
        for (Item item : itemsList) {
            resultCount +=item.getItemCount();
        }
        return resultCount;
    }
    public List<Item> addItemInOrder(Item nowItem){
        this.itemsList.add(nowItem);

        return this.itemsList;
    }
    public List<Item> deleteItemInCount(Item nowItem){
        this.itemsList.remove(nowItem);

        return this.itemsList;
    }



}
