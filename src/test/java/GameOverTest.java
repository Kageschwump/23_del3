import Controller.GameHandler;
import Model.Player.Player;
import Model.RuleSet;
import org.junit.Assert;
import org.junit.Test;

public class GameOverTest {

    @Test
    public void determineWinnerTest()
    {
        Player[] players = new Player[4];
        players[0] = new Player(0,"HC",22,null,5);
        players[1] = new Player(1,"Kasper",22,null,10);
        players[2] = new Player(2,"Henrik",21,null,-4);
        players[3] = new Player(2,"Filip",23,null,0);

        RuleSet ruleSet = new RuleSet(null,null);


        Assert.assertEquals(ruleSet.determineWinner(players),players[1]);

        //
    }

    @Test
    public void ChecksIfGameEnds(){
        RuleSet ruleset = new RuleSet(null, null);
        Player[] players = new Player[4];
        players[0] = new Player(0,"HC",22,null,5);
        players[1] = new Player(1,"Kasper",22,null,10);
        players[2] = new Player(2,"Henrik",21,null,-4);
        players[3] = new Player(2,"Filip",23,null,0);

        Assert.assertTrue(ruleset.gameOver(players));
    }
}
