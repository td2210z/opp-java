public class ivoke {

    private Customer customer;
    private int idIvo;
    private double amount;


    public ivoke(Customer customer, int idIvo, double amount) {
        this.customer = customer;
        this.idIvo = idIvo;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = this.amount - this.amount*customer.getDiscount() / 100;

    }

    public int getIdIvo() {
        return idIvo;
    }

    public void setIdIvo(int idIvo) {
        this.idIvo = idIvo;

    }

    @Override
    public String toString() {
        return customer.toString() + "\n"
                + "Amount : "
                + amount +"$" + "\n"
                + "-".repeat(20);
    }
}
