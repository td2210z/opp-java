public class Book {
    private String nameBook;
    private  Author[] authors;
    private double price;
    private int tg;
    private int quantity;
    public static  int dem = 1;


    public Book(String nameBook, Author[] authors, double price) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.price = price;
    }

    public Book(String nameBook, double price, int quantity , int tg , Author[] authors) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.price = price;
        this.tg = tg;
        this.quantity = quantity;

    }

    public int getTg(){
        return this.tg;
    }

    public String check(){
        String tmp = "#" + dem;
        dem++;
        return tmp;
    }

    public String getNameBook() {
        return nameBook;
    }
    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
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


    public void display(int n){
        System.out.println("-".repeat(20));
        System.out.println("Book information :");
        System.out.println("Name: " + nameBook);
        System.out.println("Price: " + Math.round(price));
        System.out.println("Quantity: " + quantity);
        System.out.println("Authors: ");
        for (int i = 0 ; i < n ;i++){
            System.out.println("#" + (int)(i+1));
            System.out.println(authors[i]);
        }

    }


}
