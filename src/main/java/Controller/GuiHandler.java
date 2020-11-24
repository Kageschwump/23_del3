package Controller;

import Model.Player.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class GuiHandler
{
    private GUI gui;
    private GameHandler gameHandler = new GameHandler();

    public GuiHandler(GUI_Field[] guiFields)
    {
        this.gui = new GUI(guiFields, Color.LIGHT_GRAY);
    }

    public void guiAddPlayer(Player player)
    {
        gui.addPlayer(player.getGuiPlayer());
    }

    public GUI_Car guiCreateCar()
    {
        String primaryColorString;
        Color primaryColor;
        String patternColorString;
        Color patternColor;
        String patternString;
        GUI_Car.Pattern pattern;
        String typeString;
        GUI_Car.Type type;

        primaryColorString = gui.getUserSelection("What color car?", "Black","Blue","Red","Gray","Green","Yellow");
        switch (primaryColorString)
        {

        }

    }

    public void guiMenu()
    {
        int playerAmount = gui.getUserInteger("How many players?",2,4);
        playerCreation(playerAmount);
    }

    public void playerCreation(int playerCount)
    {
        String name;
        int age;

        for(int i = 0; i < playerCount; i++)
        {
            name = gui.getUserString("Name of player");
            age = gui.getUserInteger("Age of player");
            gameHandler.getPlayerHandler().createPlayer(name,age,guiCreateCar());
        }
    }
}
