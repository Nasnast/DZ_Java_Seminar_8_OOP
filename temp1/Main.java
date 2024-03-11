package temp1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human = new Human("Покупатель №1 ");
        System.out.println(human.getName());
        Actor human1 = new Human("Покупатель №2 ");
        System.out.println(human1.getName());

        market.acceptToMarket(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();

        market.acceptToMarket(human1);
        market.update();

        // System.out.println(human.isMakeOrder);
        // System.out.println(human.isTakeOrder);
        // human.setMakeOrder();
        // human.setTakeOrder();
        // System.out.println(human.isMakeOrder);
        // System.out.println(human.isTakeOrder);

    }
}
