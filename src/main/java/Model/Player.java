package Model;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

public class Player {

    private String name;
    private int age;
    private int id;
    private GUI_Car car;
    private GUI_Player player;
    private Account account;
    private int placement;
    private Property[] properties = new Property[16];

    public Player(int id, String name, GUI_Player player, GUI_Car car, Account account){
        this.name = name;
        this.id = id;
        this.player = player;
        this.car = car;
        this.account = account;
    }

    public String getName(){return name;}

    public int getId(){return id;}

    public GUI_Player getGuiPlayer(){return player;}

    public void updatePlacement(int newPlacement){

    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperty(Property property) {
        for (int i=0;i <= properties.length; i++)
        {
            if(properties[i]==null)
            {
                properties[i] = property;
            }
        }
    }

    public int getAge() {
        return age;
    }

}
