package Model;

public class RuleSet {

    public boolean checkForPropertyPair(Player player)
    {
        boolean flag = false;

        for(int i = 0; i <= player.getProperties().length; i++)
        {
            for (int q = i + 1; q <= player.getProperties().length; q++)
            {
                if(player.getProperties()[i].getColor() == player.getProperties()[q].getColor())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean gameOver(){

        return true;
    }

    public int determineStarter(Player[] players)
    {

        if (players.length == 0)
            return -1;

        int index = 0;
        int min = players[index].getAge();

        for (int i = 1; i < players.length; i++){
            if (players[i].getAge() <= min){
                min = players[i].getAge();
                index = i;
            }
        }
        return index;
    }

}
