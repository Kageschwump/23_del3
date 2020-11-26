package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;

import java.awt.*;

public class PrisonSquare extends GameSquare {

    private String name = "Fængsel";
    private String description = "Surt show, du røg i fængsel";
    private Color bgColor = Color.white;
    private Color fgColor = Color.black;
    private GUI_Field fieldType;

    public PrisonSquare()
    {
        fieldType = new GUI_Jail("default",name,"Gå i fængsel", description,bgColor,fgColor);
    }

    @Override
    public void function(Player player)
    {
        player.setPlacement(6);
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
