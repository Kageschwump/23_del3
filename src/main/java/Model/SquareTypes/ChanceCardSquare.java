package Model.SquareTypes;

import Controller.ChanceCardHandler;
import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;

import java.awt.*;

public class ChanceCardSquare extends GameSquare {

    private ChanceCardHandler chanceCardHandler = new ChanceCardHandler();

    private String name = "?";
    private String subText = "Chancen";
    private String description = "Prøv lykken, tag et kort";
    private Color bgColor = Color.orange;
    private Color fgColor = Color.black;
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
        return fieldType;
    }

    @Override
    public String getDesc() {
        return description;
    }
}
