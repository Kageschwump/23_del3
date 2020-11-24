package Model.SquareTypes;

import Model.GameSquare;
import Model.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;

import java.awt.*;

public class PrisonSquare extends GameSquare {

    private String name = "Jail";
    private String description = "Welp you are in jail";
    private Color bgColor = Color.blue;
    private Color fgColor = Color.cyan;
    private GUI_Field fieldType;

    public PrisonSquare()
    {
        fieldType = new GUI_Jail("GUI_Field.Image.Jail",name,"", description,bgColor,fgColor);
    }

    @Override
    public void function(Player player) {
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
