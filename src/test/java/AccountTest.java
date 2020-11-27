import Model.Player.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest
{
    @Test
    public void accountUpdateTestAdd()
    {
        boolean test = false;
        int add = 5;
        Account account = new Account(5);

        account.updateScore(add);
        if(account.getBalance() == 10)
        {
            test = true;
        }
        Assert.assertTrue(test);
    }

    @Test
    public void accountUpdateTestSubtrakt()
    {
        boolean test = false;
        int subtrakt = -5;
        Account account = new Account(5);

        account.updateScore(subtrakt);
        if(account.getBalance() == 0)
        {
            test = true;
        }

        Assert.assertTrue(test);
    }
}
