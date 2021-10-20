package com.atmmachine.state;

//import required classes and packages   
import java.util.Scanner;
import com.atmmachine.state.HasDebitCardState;
import com.atmmachine.observor.Message;
import com.atmmachine.observor.MessagePublisher;
import com.atmmachine.observor.MessageUserDeposit;
import com.atmmachine.observor.Observer;

//create ATMExample class to implement the ATM functionality  
public class AtmMachineTest {
    public static final String balance = null;

    // main method starts
    public static void main(String args[]) {

        // declare and initialize balance, withdraw, and deposit
        int balance = 0;
        int deposit;
        int withdraw = 0;

        // create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Machine\n");
            System.out.println("Select the options for the below options: ");
            System.out.println("1.To deposit the amount");
            System.out.println("2. To withdraw the amonut");
            System.out.println("3. To check the balance ");
            System.out.println("4. EXIT\n");
            System.out.print("Choose the operation:");

            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter money to be withdrawn:");

                HasDebitCardState obj = new HasDebitCardState();
                obj.withdrawMoney(withdraw, balance);

                balance = balance - withdraw;

                //get the withdrawl money from user
                withdraw = sc.nextInt();

                //check whether the balance is greater than or equal to the withdrawal amount
                if(balance >= withdraw)
                {
                //remove the withdrawl amount from the total balance
                balance = balance - withdraw;
                System.out.println("Please collect your money");
                }
                else
                {
                //show custom error message
                System.out.println("Insufficient Balance");
                }
                System.out.println("");

        

                break;

            case 2:

                System.out.print("Enter money to be deposited:");

                // get deposite amount from te user
                deposit = sc.nextInt();

                // add the deposit amount to the total balanace
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");

                MessageUserDeposit msg = new MessageUserDeposit();

                MessagePublisher p = new MessagePublisher();
                p.attach(msg);
                p.notifyUpdate(new Message(balance));
            
                break;

            case 3:
                // displaying the total balance of the user
                System.out.println("Balance : " + balance);
                System.out.println("");
                break;

            case 4:
                // exit from the menu
                System.exit(0);
            }
        }
    }


}
