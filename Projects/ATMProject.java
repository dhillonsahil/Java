package Projects;
import java.util.Scanner;

class Users{
    String Username;
    String Password;
    int BankBalance;
    void setData(String Username,String Password, int BankBalance){
        this.Password= Password;
        this.Username=Username;
        this.BankBalance=BankBalance;
    }

    int CheckBalance(){
        return BankBalance;
    }

    void Deposit(int amountToBeDeposited){
        this.BankBalance +=amountToBeDeposited;
    }
    void Withdraw(int amountToBeDeposited){
        this.BankBalance -=amountToBeDeposited;
    }

}


public class ATMProject{
    public static void main(String[] args) {
        Users[] users= new Users[3];
        for(int i=0;i<users.length;i++){
            users[i]=new Users();
        }
        users[0].setData("sahil", "1492", 50000);
        users[1].setData("mohit", "0002", 10000);
        users[2].setData("ajay", "7056", 2000);
        Scanner scan= new Scanner(System.in);
        System.out.print("enter a username : ");
        String enteredUsername= scan.next();
        System.out.print("Enter your pin : ");
        String pin = scan.next();
        System.out.println();
        for(int i=0;i<3;i++){
            // System.out.println(users[i].Username);
            if(enteredUsername.equalsIgnoreCase(users[i].Username) && pin.equalsIgnoreCase(users[i].Password)){
                System.out.println("welcome "+ users[i].Username);
                System.out.println("select an option : ");
                System.out.println("1. Deposit");
                System.out.println("2. withdraw");
                System.out.println("3. Check Balance");
                int option = scan.nextInt();
                if(option>3 || option==0){
                    System.out.println("select correct option");
                }
                else if(option==1){
                    System.out.print("Enter deposit amount : ");
                    int amountTodeposit=scan.nextInt();
                    users[i].Deposit(amountTodeposit);
                    System.out.println("deposit successful");
                    System.out.println("Current balance : "+users[i].BankBalance);
                }
                else if(option==2){
                    System.out.print("Enter Withdraw amount : ");
                    int amountToWithdraw=scan.nextInt();
                    users[i].Withdraw(amountToWithdraw);
                    System.out.println("Withdraw successful");
                    System.out.println("Current balance : "+users[i].BankBalance);
                }
                else if(option==3){
                    System.out.println("Current balance : "+users[i].BankBalance);
                }
                else{
                    System.out.println("Invalid option Logged out");
                    break;
                }
            }

        }
        scan.close();

    }
}