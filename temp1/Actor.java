package temp1;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    abstract String getName();
}
