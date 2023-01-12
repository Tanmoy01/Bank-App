import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Password, Balance to create an account");

        //Create User
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIuser user = new SBIuser(name, balance, password);

        //add Money
        String message = user.addMoney(10000);
        System.out.println(message);

        //withdraw money
        System.out.println("enter amount");
        int money = sc.nextInt();
        System.out.println("enter your password");
        String pass = sc.next();
        System.out.println(user.withDrawMoney(money,pass));

        //rate of Interest
        System.out.println(user.calculateInterest(10));
    }
}