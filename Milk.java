public class Milk extends Meal{
    private int fat;
    protected Milk(String name, int cost, int quantity, String measure, String date, int fat) {
        super(name, cost, quantity, measure, date);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Кол-во: %d; Ед. изм.: %s; Срок годности: %s; Процент жирности: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.fat);
    }
}
