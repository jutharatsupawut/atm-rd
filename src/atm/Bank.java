package atm;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

   public Bank(String name){
       this.name = name;
       this.customers = new ArrayList<>();
   }

   public void addCustomer(Customer c){
       customers.add(c);
   }

   public Customer findCustomer(int id){
       for ( Customer element : customers){
           if (element.getId() == id)
               return element;
       }
       return null;
   }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
