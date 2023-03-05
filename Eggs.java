public class Eggs extends Meal {
    private int packages;
    protected Eggs(String name, int cost, int quantity, String measure, String date, int packages) {
        super(name, cost, quantity, measure, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Кол-во: %d; Ед. изм.: %s; Срок годности: %s; Кол-во в уп.: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packages);
    }
}
