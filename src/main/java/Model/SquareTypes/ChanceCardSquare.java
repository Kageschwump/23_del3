package Model.SquareTypes;

import Controller.ChanceCardHandler;
import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;

import java.awt.*;

public class ChanceCardSquare extends GameSquare {

    private ChanceCardHandler chanceCardHandler = new ChanceCardHandler();

    private String name = "Chance";
    private String subText = "Grab a card";
    private String description = "Grap a card and you might get lucky";
    private Color bgColor = Color.GRAY;
    private Color fgColor = Color.WHITE;
    private GUI_Field fieldType;

    public ChanceCardSquare()
    {
        fieldType = new GUI_Chance(name,subText,description,bgColor,fgColor);
    }

    @Override
    public void function(Player player) {
        chanceCardHandler.drawChanceCard();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public GUI_Field getGuiField() {
        return null;
    }
}
