package Controller;

import Model.Player.Player;
import gui_fields.GUI_Car;

public class PlayerHandler {

    private Player[] players;

    public PlayerHandler(int amountOfPlayers)
    {
        players = new Player[amountOfPlayers];
    }

    public Player createPlayer(int id,String name, int age, GUI_Car gui_car, int startBalance){
        return new Player(id,name,age,gui_car,startBalance);
    }

    public Player readPlayerByName(String name){
        Player givenPlayer = null;

        for (int i = 0; i < players.length; i++)
        {
            if (players[i].getName().equals(name))
            {
                givenPlayer = players[i];
            }
        }
        return givenPlayer;
    }

    public void updatePlacement(int newPlacement, Player player){
       player.updatePlacement(newPlacement);
    }

    public void updateScore(Player player){

    }
    public void readProperties(Player player){

    }


    public Player[] getPlayers() {
        return players;
    }
}
