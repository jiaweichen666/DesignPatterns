package Command.Examples;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Order> orders = new ArrayList<>();
    public void AddOrders(Order order) throws ClassNotFoundException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:");
        if (order.getClass().getSimpleName() == "Coke"){
            System.out.println("Coke is out of stoke!");
        }else {
            System.out.println("Add order: "+order.getClass().getSimpleName()+",Time: "+simpleDateFormat.format(new Date()) );
            orders.add(order);
        }
    }
    public void CancleOrders(Order order){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Cancle order: "+order.getClass().getSimpleName()+",Time: "+simpleDateFormat.format(new Date()) );
        orders.remove(order);
    }
    public void Notify(){
        for (Order o :orders) {
            o.MakeFood();
        }

    }
}
