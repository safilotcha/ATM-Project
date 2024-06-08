import java.util.Scanner;

public class AtmClientApp {
public static void main(String[] args) {
    //enter pin

    ATM one = new ATM("1234", 2000.0);

    Scanner userPin= new Scanner(System.in);
    System.out.println("enter your pin");
    String pin = userPin.nextLine();

    
    if(pin.length()==4){
        System.out.println("success");
    }else{
        System.out.println("wrong pin or format. try again.");
    }

    System.out.println("Press 1 to deposit funds. Press 2 to withdraw. Press 3 to check balance. Press 4 to exit.");
    int menu= userPin.nextInt();

    if(menu==1){
        System.out.println("how much would you like to deposit?");

        double deposit= userPin.nextInt();

        System.out.println("depositing $ "+ deposit+ ". Your balance: " + one.deposit(deposit));

    }else if(menu==2){
        System.out.println("how much would you like to withdraw?");

        double withdrawing= userPin.nextInt();

        if ( withdrawing<balance){
            System.out.println("success! you've withdrawn $"+withdrawing+ ". your remaining balance: " +one.withdraw(withdrawing));
        }
    }




















userPin.close();
}
}
