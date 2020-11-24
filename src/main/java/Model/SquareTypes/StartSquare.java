package Model.SquareTypes;

import Model.GameSquare;
import Model.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;

import java.awt.*;

public class StartSquare extends GameSquare {

    private String name = "Start";
    private String description = "You're on the start";
    private GUI_Field fieldType;
    private int passStart = 2;

    public StartSquare()
    {
        fieldType = new GUI_Start(name, "", description, Color.RED, Color.red);
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
