package temp1;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + "пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + "добавлен в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder != true) {
                actor.setMakeOrder();
                System.out.println(actor.getName() + "сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() == true) {
                actor.setTakeOrder();
                System.out.println(actor.getName() + "получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                actors.add(actor);
                System.out.println(actor.getName() + "ушел из очереди");
            }
        }
        releaseFromMarket(actors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + "ушел из магазина");
            queue.remove(actor);
        }
    }

    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

}
