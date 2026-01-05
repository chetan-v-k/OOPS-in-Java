package DSA.OOPs;
public class Access_Specifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Chetan V K";
        myAcc.setPassword("123fwer");
    }
}

class BankAccount {
    public String name;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
