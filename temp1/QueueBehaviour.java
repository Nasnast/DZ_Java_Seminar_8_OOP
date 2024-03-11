package temp1;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); // добавлять в очередь

    void takeOrders(); // вызвать у Actor метод isTakeOrder()

    void giveOrders(); // вызвать у Actor метод isMakeOrder()

    void releaseFromQueue(); // удаление человека из очереди
}
