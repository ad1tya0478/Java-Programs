import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object named scanner that reads input from the keyboard. 
        // System.in is java's input stream, used to read input.

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();   // We use nextline when we want to read an entire line of text. 
        // We can use next() but it will only print one word, after a space it will not read anything

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();  // nextInt() used to input for the integers 

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();  // for double 

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);

        scanner.close();  // This method is used to close the scanner object and release the system resources associated with it.
    }
}
