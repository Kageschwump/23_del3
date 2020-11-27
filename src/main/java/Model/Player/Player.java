package Model.Player;

import Model.ChanceCard;
import Model.SquareTypes.Property;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

public class Player {

    private String name;
    private int age;
    private int id;
    private GUI_Car car;
    private GUI_Player player;
    private Account account;
    private int placement;
    private boolean jailFreeCard;

    public Player(int id, String name,int age, GUI_Car car, int startBalance){
        this.name = name;
        this.id = id;
        this.age = age;
        this.player = new GUI_Player(name, startBalance,car);
        this.car = car;
        account = new Account(startBalance);
    }

    public String getName(){return name;}

    public int getId(){return id;}

    public GUI_Player getGuiPlayer(){return player;}

    public int getAge() {
        return age;
    }

    public Account getAccount() {
        return account;
    }

    public int getPlacement() {
        return placement;
    }

    public void updatePlacement(int newPlacement) {
        int rest;

        if(placement+newPlacement >= 24){
            rest = placement + newPlacement - 24;

            setPlacement(rest);
            account.updateScore(2);
            player.setBalance(account.getBalance());
        }
        else
        placement += newPlacement;
    }

    public void setPlacement(int placement)
    {
        this.placement = placement;
    }

    public GUI_Player getPlayer() {
        return player;
    }

    public void setJailFreeCard(boolean jailFreeCard) {
        this.jailFreeCard = jailFreeCard;
    }

    public boolean isJailFreeCard() {
        return jailFreeCard;
    }

}
