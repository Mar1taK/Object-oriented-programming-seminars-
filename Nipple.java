public class Nipple extends ProductOfChildren{
    protected Nipple(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
    }
    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Кол-во: %d; Ед. изм.: %s; Мин. возраст: %d; Гипоаллергенность: %s;", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getMinAge(), getHypoallergenic());
    }
}
