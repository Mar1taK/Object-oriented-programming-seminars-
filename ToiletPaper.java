public class ToiletPaper extends ItemsOfHygiene {
    private int layers;
    protected ToiletPaper(String name, int cost, int quantity, String measure, int size, int layers) {
        super(name, cost, quantity, measure, size);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Кол-во: %d; Ед. изм.: %s; Кол-во в уп.: %d; Кол-во слоев: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize(), this.layers);
    }
}
