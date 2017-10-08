/**
 * Created by stephenboynton on 6/29/17.
 */
public class VIPaccount {

    private String VIPname;
    private double creditLimit;
    private String VIPemail;

    public VIPaccount(String VIPname, double creditLimit, String VIPemail) {
        this.creditLimit = creditLimit;
        this.VIPname = VIPname;
        this.VIPemail = VIPemail;
    }

    public VIPaccount() {
        this("Default", 5000.00, "No e-mail received");
    }

    public VIPaccount(String VIPname, double creditLimit) {
        this.VIPname = VIPname;
        this.creditLimit = creditLimit;
        this.VIPemail = "No e-mail recieved";
    }

    public void statusCheck () {
        System.out.println(this.VIPemail);
        System.out.println(this.VIPname);
        System.out.println(this.creditLimit);
    }
}
