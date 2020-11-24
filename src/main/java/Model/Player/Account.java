package Model.Player;

import Model.Player.Player;

public class Account {
    private int balance;
    private Player player;

    public Account(int balance, Player player){
        this.balance = balance;
        this.player = player;
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
