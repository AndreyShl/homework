package homeworkCollection;

import java.util.ArrayList;
import java.util.List;

//Программа для учета заказов в интернет-магазине:
//создать класс Order, который содержит информацию о заказе (например номер заказа, список товаров (Item) и их стоимость)
//и методы для добавления товаров, удаления товаров, вычисления общей стоимости заказа;
//программа должна позволять добавлять новые заказы, удалять заказы, а также вычислять общую сумму всех заказов;
//также необходимо реализовать методы для добавления заказа, удаления заказа и вычисления общей суммы всех заказов
public class main {
    public static void main(String[] args) {
        Item i1 = new Item("холодильник", 54);
        Item i2 = new Item("роутер", 23);
        Item i3 = new Item("вилка", 2);
        Item i4 = new Item("стиральная машина", 66);
        Item i5 = new Item("машина", 111);
        List<Item> items1 = new ArrayList<>();
        List<Item> items2 = new ArrayList<>();
        items2.add(i1);
        items2.add(i5);

        items1.add(i1);
        items1.add(i2);
        items1.add(i3);
        items1.add(i4);

        Order order1 = new Order(items1);
        Order order2 = new Order(items2);
        order1.addItemInOrder(i5);
        order1.deleteItemInCount(i1);
        System.out.println(order1.generalCount());

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        System.out.println(orders);
        magazine allOrders =new magazine(orders);
        allOrders.addNewOrder(order2);
        allOrders.deleteOrder(order1);
        System.out.println("общая сумма всех заказов-"+allOrders.recoultCountAllOrders());


    }
}
