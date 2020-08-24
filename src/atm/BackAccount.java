package atm;

public class BackAccount {

    private int id;
    private String name;
    private String type;
    private double balance;

    public BackAccount(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = 0;

    }

    public BackAccount(int id, String name, String type, double Balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;

    }




    public void deposit(double amount){
        balance = balance + amount;

    }

    public void withdraw (double amount){
        balance = balance - amount;

    }



    //------------ getters -------------------------


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BackAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
