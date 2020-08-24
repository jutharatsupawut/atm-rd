package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BackAccount peter = new BackAccount(1,"Peter","Saving");
        BackAccount nancy = new BackAccount(2,"Nancy","Checking",1000);
        peter.deposit(500);
        nancy.withdraw(200);
        System.out.println(peter);
        System.out.println(nancy);
    }
}
