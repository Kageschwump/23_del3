package Controller;

import Model.Player;
import gui_fields.GUI_Car;

public class PlayerHandler {
    private Player[] players;
    private GuiHandler guiHandler;

    public PlayerHandler()
    {
        players = new Player[4];
    }

    public void createPlayer(String name, int age, GUI_Car gui_car){
        // Creation of id
        int playerGivenID;

        for(int i = 0; i <= players.length; i++)
        {
            if(players[i] == null)
            {
                playerGivenID = i + 1;
            }
        }
        // Creation of car and adding
        guiHandler.guiCreateCar();

        // Player Creation

    }
    public void readPlayer(Player player){

    }
    public void updatePlacement(Player player){

    }
    public void updateScore(Player player){

    }
    public void readProperties(Player player){

    }
}
