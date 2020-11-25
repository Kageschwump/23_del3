package Model.Player;

import Model.Player.Player;

public class Account {
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void updateScore(int balanceUpdate){
        if(balance+balanceUpdate < 0)
        {
           balance = 0;
        } else {
            balance += balanceUpdate;
        }
    }

    public int getBalance(){return balance;}

}
