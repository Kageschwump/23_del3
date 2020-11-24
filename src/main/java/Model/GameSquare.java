package Model;

import gui_fields.GUI_Field;

public abstract class GameSquare {
    private String name;
    private int squareNumber;
    private GUI_Field fieldType;

    public abstract void function(Player player);

    public abstract String getName();

    public abstract GUI_Field getGuiField();

}

