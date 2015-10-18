/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week4;

/**
 *
 * @author Student Lab
 */
public class BankAccount {

    private int accountId;
    private String name;
    private double balance;

    //constructor default value
    public BankAccount() {
        this(999999, "No Name", 0.0);
    }

    public BankAccount(int accountId) {
        this(accountId, "No Name", 0.0);
    }

    public BankAccount(int accountId, String name) {
        this(accountId, name, 0.0);
    }

    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
//        this(accountId , name,balance);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount) throws BankAccountException {
        if (balance < amount) {
            throw new BankAccountException("Balance not enough !!!");
            //System.out.println("Balance is not enough");
        } else if(amount < 0) {
            throw new BankAccountException("Witdraw with Negative Balance!!!");
        }
        else {
            setBalance(balance - amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountId=" + accountId + ", name=" + name + ", balance=" + balance + '}';
    }
}
