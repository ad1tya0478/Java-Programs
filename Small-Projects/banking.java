import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("-------------------");
            System.out.println("Banking Program\n");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("--------------------");
    
            System.out.print("Enter Your Choice (1-4): ");
            choice = scanner.nextInt();
    
            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("Thank you, Have a Nice Day\n");
        
        scanner.close();
    }

    static void showbalance(double balance){
        System.out.println("\nYour Balance:-");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter some amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter Amount to Withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Balance");
            return 0;
        } else if(amount < 0){
            System.out.println("Invalid Input");
            return 0;
        } else {
            return amount;
        }
    }

}
