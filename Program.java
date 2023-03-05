public class Program {
    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("****************************************************************************************************************");
        }
    }

    public static void main(String[] args){
        Product bread = new Bread("Пшеничный", 2, 1, "шт", "4 дня", "высший сорт");
        Product diapers = new Diapers("Pampers", 55, 56, "шт.", 2, "да", 2, 5, 7, "Ультравпитывающий");
        Product eggs = new Eggs("Кобринские", 4, 10, "шт", "3 нед", 10);
        Product lemonade = new Drinks("Fanta", 4, 6, "литр", 2);
        Product masks = new Masks("Belita", 10, 12, "шт", 2);
        Product paper = new ToiletPaper("Zeva", 10, 10, "шт", 12, 5);
        Product nipple = new Nipple("Соска", 10, 1, "шт.", 0, "да");
        Product milk = new Milk("Брест-Литовск", 4, 5, "Литр", "1 месяц", 3);

        Product[] product = new Product[] {bread, diapers, eggs, lemonade, masks, paper, nipple, milk};

        ShowProducts(product);
    }
}
