class MyException extends Exception{
    public MyException(String string){

    }
}

public class exceptions {
    public static void main(String[] args) {

        System.out.println();

        // An exception in Java is an event that disrupts the normal flow of a program during execution.
         
        // exception handling // 

        // Try catch // 
        // int i = 0;
        // int j = 0;
        // try 
        // {
        //     j = 18/i;
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong");
        // }
        // System.out.println(j);

        // System.out.println("bye");



        // int i = 2;
        // int j = 0;

        // int nums[] = new int[5];
        // String str = null;

        // try 
        // {
        //     j = 18/i;
        //     System.out.println(str.length());
        //     System.out.println(nums[1]);
        //     System.out.println(nums[5]);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Something went wrong. " + e);
        // } catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Stay in the limit." + e);
        // } catch(Exception e){
        //     System.out.println("Something went wrong..." + e);
        // }
        // System.out.println(j);

        // System.out.println("bye");

// Throw - this keyword is used to manually display an error, only one exception can be thrown at a time using throw.
        // int a = 20;
        // int b = 0;
        // try{
        //     b = 18/a;
        //     if(b==0){
        //         throw new MyException("Hmmmmm");
        //     }
        // } catch(MyException e){
        //     b = 18/1;
        //     System.out.println("That's the default output");
        // } catch(Exception  e){
        //     System.out.println("Something went wrong" + e);
        // }
        // System.out.println(b);
        // System.out.println("Bye");

// throws - declares that a method might throw one or more exceptions. It lets the caller the know it must handle or further declare the exception

        try{
            Class.forName("Demo");
        } catch(ClassNotFoundException e){
            System.out.println("Not able to find the class " + e);
        }


    }    
}
