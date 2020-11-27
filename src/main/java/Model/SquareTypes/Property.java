package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import Model.RuleSet;
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
    private RuleSet ruleSet;

    public Property(String name, int price, String description, Color bgColor, Color fgColor, RuleSet ruleSet)
    {
        this.name = name;
        this.price = price;
        String priceString = Integer.toString(price);
        this.description = description;
        this.bgColor = bgColor;
        this.fgColor = fgColor;
        this.ruleSet = ruleSet;

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
            fieldType.setOwnableLabel(player.getName());
            fieldType.setBorder(player.getGuiPlayer().getPrimaryColor());
        }
        else if(player != owner){
             if(ruleSet.checkForPropertyPair(owner,bgColor))
             {
                 player.getAccount().updateScore(-price * 2);
                 player.getGuiPlayer().setBalance(player.getAccount().getBalance());
                 owner.getAccount().updateScore(price * 2);
                 owner.getGuiPlayer().setBalance(owner.getAccount().getBalance());
             } else
                 {
                     player.getAccount().updateScore(-price);
                     player.getGuiPlayer().setBalance(player.getAccount().getBalance());
                     owner.getAccount().updateScore(price);
                     owner.getGuiPlayer().setBalance(owner.getAccount().getBalance());
                 }
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

    @Override
    public Player getOwner()
    {
        return owner;
    }

}
