package logic.item;

public abstract class Item {

    public abstract String getItemName();
    public abstract String getShortItemName();
    @Override
    public String toString() {
        return getItemName();
    }

}
