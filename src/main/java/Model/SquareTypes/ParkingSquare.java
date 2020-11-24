package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;

import java.awt.*;

public class ParkingSquare extends GameSquare {

    private String name;
    private GUI_Field fieldType;

    public ParkingSquare()
    {
        fieldType = new GUI_Empty(Color.WHITE, Color.black, name, "", "Peter park here");
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
        return fieldType;
    }
}
