import java.util.Scanner;

public class ATM{
    String requiredPin;
    double balance;


    public ATM(String requiredPin, double balance) {
        this.requiredPin = requiredPin;
        this.balance = balance;
    }


    public String getRequiredPin() {
        return requiredPin;
    }


    public void setRequiredPin(String requiredPin) {
        this.requiredPin = requiredPin;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean allowAccess(String enteredPin){
        return enteredPin.equals(this.requiredPin);

        // Scanner userPin= new Scanner(System.in);
        // System.out.println("enter your pin");
        // String pin = userPin.nextLine();

        // if(pin.length()==4){
        //     for(int i=0; i<pin.length(); i++){
        //         if(Character.isDigit(i)){
        //             return true;
        //         }
        //     }
            
        // }else{
            
        //     return false;
        // }userPin.close();
        // return false;
        

    }

    public void deposit(double amount){
        balance+=amount;
        
    }

    public void withdraw(double amount){
        if (amount> balance){
            System.out.println("insufficient funds");
        }
        balance -=amount;
        
        
    }


    

    
}