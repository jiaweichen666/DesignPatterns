package Command.Examples;
/*命令模式下模仿餐馆点餐的功能，餐馆有服务员和大厨，顾客点菜生成订单交给服务员，服务员通知大厨干活*/
/*输出：
Add order: FriedChicken,Time: 2017-12-28 15:34:42:
Add order: Humburger,Time: 2017-12-28 15:34:43:
Add order: Coke,Time: 2017-12-28 15:34:43:
Add order: Icecream,Time: 2017-12-28 15:34:43:
Cancle order: Icecream,Time: 2017-12-28 15:34:48
Make some fried chichen!
Make a humburger!
Get a cup of Coke!
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        Waiter waiter = new Waiter();//餐馆有服务员
        Chef chef = new Chef();//餐馆有厨师
        /*客人的下单命令*/
        FriedChicken friedChicken = new FriedChicken(chef);
        Humburger humburger  = new Humburger(chef);
        Coke coke = new Coke(chef);
        Icecream icecream = new Icecream(chef);
        waiter.AddOrders(friedChicken);
        waiter.AddOrders(humburger);
        waiter.AddOrders(coke);
        waiter.AddOrders(icecream);
        Thread.sleep(5000);//等了五秒钟还没来不要了
        waiter.CancleOrders(icecream);
        //服务员通知大厨做饭
        waiter.Notify();
    }
}
