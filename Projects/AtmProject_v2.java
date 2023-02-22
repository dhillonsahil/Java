package Projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AtmProject_v2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Select an option : ");
        System.out.println(1 + " Register");
        System.out.println(2 + " Login");
        int opt1 = scan.nextInt();
        System.out.println("Enter your username : ");
        String username = scan.next();
        System.out.println("Enter a password : ");
        String password = scan.next();
        File file = new File("./" + username + ".txt");
        if (opt1 == 1) {
            if (file.exists()) {
                System.out.println("Sorry ! this username is already present start again with a unique username");
                System.exit(0);
            } else {
                System.out.println("Enter opening balance : ");
                int openingBalance= scan.nextInt();
                Customer user = new Customer();
                user.setData(openingBalance,username,password);
                user.createData(file);
                user.storeData();
            }
           
        } else if (opt1 == 2) {
            if(!file.exists()){
                System.out.println("User Doesn't exist");
                System.exit(0);
            }
            else{
                Scanner scan2= new Scanner(file);
                String usernameSaved="";
                String passwordSaved="";
                int bankBalanceSaved=0;

                // getting username , password and bank balance saved in a file
                String st[] = new String[3];
                int i=0;
                while(scan2.hasNextLine()){
                    st[i]=scan2.nextLine();
                    i++;
                }
                usernameSaved=st[0];
                passwordSaved=st[1];
                bankBalanceSaved=Integer.parseInt(st[2]);

                // creating instance 
                Customer user = new Customer();
                        user.setData(bankBalanceSaved, usernameSaved, passwordSaved);
                scan2.close();

                // ask for options
                if(username.equals(usernameSaved) && password.equals(passwordSaved)){
                    System.out.println("Enter an option : \n 1. Check Balance \n 2. Withdraw Balance \n 3. Deposit Money");
                int opt2=scan.nextInt();
                if(opt2==1){
                    System.out.println(bankBalanceSaved);
                }
                if(opt2==2){
                    System.out.println("enter an amount to withdraw :");
                    int WithrdrawAmount =scan.nextInt();
                    if(WithrdrawAmount>bankBalanceSaved){
                        System.out.println("Low balance");
                    }
                    else{
                        
                        user.withdrawMoney(WithrdrawAmount, bankBalanceSaved);
                        System.out.println("Remaining Balance : "+(bankBalanceSaved-WithrdrawAmount));                        
                    }
                }
                else if(opt2==3){
                    System.out.println("Enter an amount to deposit");
                    int depositAmount=scan.nextInt();
                    user.depositMoney(depositAmount, bankBalanceSaved);
                    System.out.println("Deposited Succesfully");
                    System.out.println("Available Balance : "+user.bankBalance);
                }
                }
                else{
                    System.out.println("Wrong password");
                    System.exit(0);
                }
               
            }
        }

        scan.close();
    }

}

class Customer {
    int bankBalance;
    String username;
    String password;
    String filepath;

    void setData(int bankBalance, String username, String password){
        this.bankBalance = bankBalance;
        this.username = username;
        this.password = password;
    }

    void createData(File file) {
        this.filepath = "./" + username + ".txt";

        try {
            file.createNewFile();
            System.out.println("Username created succesfully");
        } catch (Exception e) {
            System.out.println("Oops ! unable to create username");
        }

    }

    void storeData() {
        try {
            FileWriter writer = new FileWriter(username+".txt");
            writer.write(username + "\n" + password + "\n" + bankBalance);
            writer.close();
            System.out.println("Done succesfully");
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    void depositMoney(int depositAmount , int bankBalanceSaved) {
        this.bankBalance=bankBalanceSaved;
        this.bankBalance+=depositAmount;
        storeData();
    }

    void withdrawMoney(int withdrawAmount , int bankBalanceSaved) {
        this.bankBalance=bankBalanceSaved;
        this.bankBalance-=withdrawAmount;
        storeData();
    }

    void checkBalance(int bankBalanceSaved){
        System.out.println(bankBalanceSaved);
    }

}
