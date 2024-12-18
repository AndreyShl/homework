package homeworkCollection;

public class Item {
    private String itemName;
    private int ItemCount;

    public Item(String itemName, int itemCount) {
        this.itemName = itemName;
        ItemCount = itemCount;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCount() {
        return ItemCount;
    }

    @Override
    public String toString() {
        return
                "itemName='" + itemName + '\'' +
                ", ItemCount=" + ItemCount ;
    }


}
