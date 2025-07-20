import java.util.Scanner;

public class number {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        boolean play = true; 

        while(play){
            int secretNum = (int)(Math.random() * 13) + 1;
            int attempts = 5;
            boolean rightGuess = false;

            System.out.println("Guess The Number between 1 to 13.");
            System.out.println("You have: " + attempts + " Attempts to guess right.");

            int errorcount = 0;
            int maxerrors = 3;

            while(attempts > 0){
                System.out.print("Enter your Guess: ");
                int guess;

                if(!scanner.hasNextInt()){
                    System.out.println("Are you an Asshole, This is not a Number.");
                    scanner.next();
                    errorcount++;

                    if(errorcount >= maxerrors){
                        System.out.println("\nI do not play with a fool.\n");
                        break;
                    }
                    continue;
                }
                errorcount = 0;
                guess = scanner.nextInt();

                if(guess < 1 || guess > 13){
                    System.out.println("Number must be be between 1 and 13.");
                    continue;
                }

                if(guess == secretNum){
                    System.out.println("\nI didn't knew you had brain, Congrats You gussed it right.\n");
                    rightGuess = true;
                    break;
                } else if(guess < secretNum){
                    System.out.println("\nGo Up, you Brainless Fool.");
                } else if (guess > secretNum){
                    System.out.println("\nDown, you go, like the dead weight you are!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);

            }

            if(!rightGuess){
                System.out.println("\nGame over, brain-dead son of a bitch.");
                System.out.println("The Number was: " + secretNum);
            }

            System.out.print("\nWanna Play again Empty Skull..?? (yes/no): ");
            scanner.nextLine();
            String response = scanner.nextLine().trim().toLowerCase();
            play = response.equals("yes") || response.equals("y");
        }

        System.out.println("Thanks For playing, Brain-less Idiot.");
        scanner.close();

    }    
}
