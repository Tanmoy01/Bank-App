import java.util.Objects;
import java.util.UUID;

public class SBIuser implements BankInterface {
    private String name;
    private String accountNo;
    private Double balance;
    private String password;
    private static double rateOfInterst;

    public SBIuser(String name, Double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterst =6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterst() {
        return rateOfInterst;
    }

    public static void setRateOfInterst(double rateOfInterst) {
        SBIuser.rateOfInterst = rateOfInterst;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
       balance = balance + amount;
       return "paisa hi paisa" +" "+ balance;
    }

    @Override
    public String withDrawMoney(int amount, String enterPassword) {
        if(Objects.equals(enterPassword,password)){
            if(amount>balance){
                return "bhag yaha se";
            }
            else{
                balance= balance - amount;
                return "utha le sare paisa";
            }
        }
        else{
            return "phir hera pheri";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return(balance*years*rateOfInterst)/100;
    }
}
