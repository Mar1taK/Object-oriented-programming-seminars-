public class Masks extends ItemsOfHygiene {
    protected Masks(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure, size);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Кол-во: %d; Ед. изм.: %s; Кол-во в уп.: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }
}
