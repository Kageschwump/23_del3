package Model.SquareTypes;

import Controller.ChanceCardHandler;
import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;

import java.awt.*;

public class ChanceCardSquare extends GameSquare {

    private String name = "?";
    private String subText = "Chancen";
    private String description = "Prøv lykken, tag et kort";
    private Color bgColor = Color.orange;
    private Color fgColor = Color.black;
    private GUI_Field fieldType;
    ChanceCardHandler chanceCardHandler;

    public ChanceCardSquare(ChanceCardHandler chanceCardHandler)
    {
        fieldType = new GUI_Chance(name,subText,description,bgColor,fgColor);
        this.chanceCardHandler = chanceCardHandler;
    }

    @Override
    public void function(Player player)
    {
        chanceCardHandler.drawCard(player);
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

    @Override
    public Color getColor() {
        return bgColor;
    }
}
