package control_state;       // Package files - a package in java is a namespace that groups related classes
//                              and interfaces together.
//                    import tools.calc; = By using this command we can access a class from a different file, first we use the key word import and then the folder name and then class name 
//    Whichever in-built class you use, belongs to a package 
//     to import all the files we can use - import java.lang.*; - by using this star we can import all files



public class switch_package {
    public static void main(String a[]) {
        // int n = 1;

        // switch(n){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2: 
        //         System.out.println("Tuesday");
        //         break;
        //     case 3: 
        //         System.out.println("Wednesday");
        //         break;
        //     case 4: 
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        // }   


        // UPDATED VERSION OF SWITCH 

        String n = "Monday";
        String res = "";
        switch (n) {
            case "Saturday", "Sunday" -> res = "6am";
            case "Monday" -> res = "8am";
            default ->  res = "7am";
        }
        System.out.println(res);
    }
}