public class Acc {
    private int accID;
    private Cus customer;
    private double balance;

    public Acc(int accID, Cus customer, double balance) {
        this.accID = accID;
        this.customer = customer;
        this.balance = balance;
    }
    public Acc(int accID, Cus customer) {
        this.accID = accID;
        this.customer = customer;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public Cus getCustomer() {
        return customer;
    }

    public void setCustomer(Cus customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Acc desposit(double amount){
        Acc acc = new Acc(this.getAccID(), this.getCustomer(), this.getBalance());
        acc.setBalance(acc.getBalance() + amount);
        System.out.println("transaction successful");
        return acc;


    }

    public Acc withDraw(double amount){
        Acc acc = new Acc(this.getAccID(), this.getCustomer(), this.getBalance());
        if(acc.getBalance() >= amount){
            System.out.println("transaction successful");
            acc.setBalance(acc.getBalance() - amount);


        } else{
            System.out.println("transaction not successful");
        }
        return acc;
    }


    @Override
    public String toString(){
        return customer.toString() + "\n"
                +"ACCount ID :"+ accID + "\n"
                + "Banlance : " + String.format("%.2f", balance) +" $"+ "\n";
    }
}
