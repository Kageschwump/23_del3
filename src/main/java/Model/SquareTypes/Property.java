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
    private Player owner = null;
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

    @Override
    public Color getColor()
    {
        return bgColor;
    }

    @Override
    public void function(Player player) {
        if(propertyNotOwned())
        {
            owner = player;
            player.getAccount().updateScore(-price);
            player.getGuiPlayer().setBalance(player.getAccount().getBalance());
            fieldType.setOwnerName(player.getName());
        }
        else if(player != owner){
             player.getAccount().updateScore(-price);
             player.getGuiPlayer().setBalance(player.getAccount().getBalance());
             owner.getAccount().updateScore(price);
             owner.getGuiPlayer().setBalance(owner.getAccount().getBalance());
        }


    }

    public boolean propertyNotOwned()
    {
        if(owner == null){
            return true;
        }
        else
            return false;
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
