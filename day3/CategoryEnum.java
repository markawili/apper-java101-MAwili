public class CategoryEnum {
    public static void main(String[] args) {
        Category category = Category.GRANDPA;

        switch(category) {
            case MEN: System.out.println("Price is " + Category.MEN.getPrice()); break;
            case WOMEN: System.out.println("Price is " + Category.WOMEN.getPrice()); break;
            case KID: System.out.println("Price is " + Category.KID.getPrice()); break;
            case GRANDMA: System.out.println("Price is " + Category.GRANDMA.getPrice()); break;
            case GRANDPA: System.out.println("Price is " + Category.GRANDPA.getPrice()); break;
        }

    }

    public enum Category {
        MEN(13.57), WOMEN(20.45), KID(45.6), GRANDMA(56.67), GRANDPA(3.56);
        private double price;

        Category(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
