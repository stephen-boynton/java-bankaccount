/**
 * Created by stephenboynton on 6/28/17.
 */
public class Main {

    public static void main (String[] args) {

        Account boynton = new Account();
        Account smothers = new Account(78432, 105.00, "Charlie Smothers", "johnie123@gmail.com", "(864)123-4567");

        boynton.deposit(100.00);
        boynton.withdraw(150.00);
        boynton.withdraw(200.00);

        smothers.withdraw(200.00);

        System.out.println("================================");

        VIPaccount greenblat = new VIPaccount();
        greenblat.statusCheck();

        VIPaccount martin = new VIPaccount("Butts Martin", 5000.00,"ass@mail.com");
        martin.statusCheck();

        VIPaccount george = new VIPaccount("RR Martin", 500.00);
        george.statusCheck();


    }

}
