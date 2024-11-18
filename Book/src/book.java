public class book extends Auther{
    private String nameSach;
    private double price;
    private int quantity;

    public book(String nameSach, double price, int quantity , String name , String enail , char ger) {
        super(name, enail, ger);
        this.nameSach = nameSach;
        this.price = price;
        this.quantity = quantity;

    }

    public String getNameSach() {
        return nameSach;
    }

    public void setNameSach(String nameSach) {
        this.nameSach = nameSach;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book Details :" + "\n"
                + nameSach + "\n"
                + price + "\n"
                + quantity + "\n"
                + "Author Information :" + "\n"
                + super.toString() + "\n"
                + "-".repeat(20) + "\n";
    }
}
