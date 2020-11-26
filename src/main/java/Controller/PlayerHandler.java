package Controller;

import Model.Player.Player;
import gui_fields.GUI_Car;

public class PlayerHandler {

    private Player[] players;
    int counter = 0;
    public PlayerHandler()
    {
        players = new Player[4];
    }

    public Player createPlayer(String name, int age, GUI_Car gui_car, int startBalance){
        // Creation of id

        Player player = new Player(counter,name,age,gui_car,startBalance);
        players[counter] = player;
        counter++;
        return player;
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

    public Player[] getPlayers() {
        return players;
    }
}
