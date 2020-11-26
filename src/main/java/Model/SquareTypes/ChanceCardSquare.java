package Model.SquareTypes;

import Model.ChanceCard;
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
    private ChanceCard[] chanceCards;

    public ChanceCardSquare()
    {
        fieldType = new GUI_Chance(name,subText,description,bgColor,fgColor);
        chanceCards = new ChanceCard[20];
    }

    @Override
    public void function(Player player)
    {

    }

    public void createChanceCards()
    {

    }

    public void shuffle()
    {

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
