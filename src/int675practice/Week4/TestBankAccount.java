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
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount bc = new BankAccount(7000700,"Dakota",50000);
        
        //ba.deposit(6000);
        ba.setAccountId(8000800);
        ba.setName("Alex");
        ba.setBalance(1020);
        ba.deposit(500);
        ba.withdraw(1000);
        System.out.println(ba.getAccountId() +":"+ba.getName() +":"+ ba.getBalance());
        System.out.println(bc.getAccountId() +":"+bc.getName() +":"+ bc.getBalance());
    }
}
