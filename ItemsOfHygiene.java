public class ItemsOfHygiene extends Product{
    private int size;
    
    protected ItemsOfHygiene(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
