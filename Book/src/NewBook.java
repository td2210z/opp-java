public class NewBook {

    private String name;
    private Auther author;
    private double price;
    private int quantity;

    public NewBook(String name , Auther author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;

    }

    public NewBook(String name , Auther author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auther getAuthor() {
        return author;
    }

    public void setAuthor(Auther author) {
        this.author = author;
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
                + name + "\n"
                + price + "\n"
                + quantity + "\n"
                + "Author Information :" + "\n"
                + author + "\n"
                + "-".repeat(20) + "\n";
    }
}