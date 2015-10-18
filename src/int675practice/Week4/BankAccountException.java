/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week4;

/**
 *
 * @author INT675
 */
public class BankAccountException extends Exception {

    public BankAccountException() {
        super("unknow Exception");
    }
    public BankAccountException(String message) {
        super(message);
    }
    
}
