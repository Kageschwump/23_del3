package Controller;

import Model.Player.Player;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class GuiHandler
{
    private GUI gui;

    public GuiHandler(GUI_Field[] guiFields)
    {
        this.gui = new GUI(guiFields, Color.LIGHT_GRAY);
    }

    public void guiAddPlayer(Player player)
    {
        gui.addPlayer(player.getGuiPlayer());
    }

    public void guiCreateCar()
    {


    }

    public void guiMenu()
    {

    }
}
