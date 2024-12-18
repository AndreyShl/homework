package homeworkCollection;

import java.util.List;
//программа должна позволять добавлять новые заказы, удалять заказы, а также вычислять общую сумму всех заказов;
//также необходимо реализовать методы для добавления заказа, удаления заказа и вычисления общей суммы всех заказов
public class magazine {
    private List<Order> orderList;

    public magazine(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return
                "orderList=" + orderList +
                '}';
    }
    public int recoultCountAllOrders(){
        int countAllOrders=0;
        for (Order order:orderList){
            countAllOrders+=order.generalCount();
        }
        return countAllOrders;
    }

    public List<Order> addNewOrder (Order newOrder){
        this.orderList.add(newOrder);
        return  this.orderList;
    }

    public List<Order> deleteOrder (Order newOrder){
        this.orderList.remove(newOrder);
        return  this.orderList;
    }

}
