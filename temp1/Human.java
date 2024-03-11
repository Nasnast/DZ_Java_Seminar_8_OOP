package temp1;

public class Human extends Actor {

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    String getName() {
        return name;
    }

    public Human(String name) { //
        this.name = name;
    }

}
