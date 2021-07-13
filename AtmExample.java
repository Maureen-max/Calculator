package ATMSystem;

//java.util is a package with several classes such as sxanner
import java.util.Scanner;

//class has been created
public class AtmExample {
    public static void main(String[] args){
        //declare and initialize balance,withdrawal and deposit
        double balance = 100_000;
        double withdraw = 0;
        double  deposit = 0;

        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdrawal");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for  Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform");

//get choice from user
            int choice = sc.nextInt();

            //generate a  switch case statement
            switch(choice)
            {
                case 1:
                System.out.print("Enter the amount to be withdrawn");

                //get the withdrawal money from user
                withdraw = sc.nextInt();

            //check whether the balance is greater or equal to the withdrawal amount
                    if(balance >= withdraw){
                        //remove the withdrawal amount from the total balance
                        balance -=withdraw;
                        System.out.println("please collect your money");

                    }
                    else {
                        //show custom error messages
                        System.out.println("Insufficient funds");
                    }

                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposited");
                    deposit = sc.nextInt();

                        balance += deposit;
                        System.out.println("Your total amount is:" + deposit );
                        System.out.println("The total amount in your account is :" + balance);
                        System.out.println("");
                        break;

                case 3:
                    //display the balance
                    System.out.println("Balance :" + balance);

                    break;

                case 4:
                    System.out.println("exit");
                    System.exit(0);
                    break;

                default:
                   System.out.println("Operation not executable!!Please enter the operation you want to perform");
            }
            System.out.println("Thank you for transacting with M-Bank");
        }

    }
}
