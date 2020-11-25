package Controller;

import Model.Player.Player;
import gui_fields.GUI_Car;

public class PlayerHandler {

    private Player[] players;

    public PlayerHandler()
    {
        players = new Player[4];
    }

    public void createPlayer(String name, int age, GUI_Car gui_car, int startBalance){
        // Creation of id
        int playerGivenID;

        for(int i = 0; i <= players.length; i++)
        {
            if(players[i] == null)
            {
                playerGivenID = i + 1;
                players[i] = new Player(playerGivenID,name,age,gui_car,startBalance);
            }
        }


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
    public void updatePlacement(Player player){

    }
    public void updateScore(Player player){

    }
    public void readProperties(Player player){

    }
}
