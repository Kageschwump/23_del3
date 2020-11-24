package Model.SquareTypes;

import Model.GameSquare;
import Model.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;

import java.awt.*;

public class VisitJailSquare extends GameSquare {

    private String name = "Visit jail";
    private String description = "Hope you are just visiting";
    private Color bgColor = Color.blue;
    private Color fgColor = Color.cyan;
    private GUI_Field fieldType;

    public VisitJailSquare()
    {
        fieldType = new GUI_Jail("GUI_Field.Image.GoToJail",name,"", description,bgColor,fgColor);
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
