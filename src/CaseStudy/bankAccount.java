package CaseStudy;

public class bankAccount {
    private String id;
    private double balance;
    private Customer name;

    public bankAccount(String id, double balance, Customer name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }
    public String checkBalance(){
        return this.balance;
    }
    private void doposit (double amount){
        this.balance += amount; // this.balance = this.balance+amount;
    }
}//class
