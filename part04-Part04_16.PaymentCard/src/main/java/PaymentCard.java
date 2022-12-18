/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAMIDME
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return String.format("The card has a balance of %s euros", this.balance);
    }

    public void eatAffordably() {

        this.balance -= 2.6;
        if (this.balance < 0) {
            this.balance += 2.6;
        }
    }

    public void eatHeartily() {
        this.balance -= 4.6;
        if (this.balance < 0) {
            this.balance += 4.6;
        }
    }
    
    public void addMoney(double amount){
        if (amount < 0){
            this.balance -= amount;
        }
        this.balance += amount;   
        if (this.balance > 150){
            this.balance = 150.0;
        }
        
    }
}
