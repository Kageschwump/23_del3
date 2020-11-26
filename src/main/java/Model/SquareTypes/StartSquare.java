package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import Model.RuleSet;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;

import java.awt.*;

public class StartSquare extends GameSquare {

    private String name = "Start";
    private String description = "Klar, parat, start";
    private GUI_Field fieldType;

    public StartSquare()
    {
        fieldType = new GUI_Start(name, "", description, Color.white, Color.black);
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

    @Override
    public String getDesc() {
        return description;
    }
}
