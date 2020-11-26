package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Street;

import java.awt.*;

public class Property extends GameSquare {
    private boolean owned;
    private String name;
    private int price;
    private String description;
    private Player owner;
    private Color bgColor;
    private Color fgColor;
    private GUI_Ownable fieldType;

    public Property(String name, int price, String description,Color bgColor, Color fgColor)
    {
        this.name = name;
        this.price = price;
        String priceString = Integer.toString(price);
        this.description = description;
        this.bgColor = bgColor;
        this.fgColor = fgColor;

        fieldType = new GUI_Street(name,priceString,description, priceString, bgColor,fgColor);
    }

    public void setOwner(Player player){}

    public Color getColor()
    {
        return bgColor;
    }

    @Override
    public void function(Player player) {

    }

    public boolean propertyNotOwned(Player player)
    {

    }

    @Override
    public String getName() {
        return name;
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
