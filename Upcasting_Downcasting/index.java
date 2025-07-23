// class A{
//     public void show(){
//         System.out.println("In A Show");
//     }
// }
// class B extends A{
//     public void Show1(){
//         System.out.println("In B show");
//     }
// // }

// abstract class Car {
//     public abstract void drive();
//     public abstract void fly();

//     public void playMusic(){
//         System.out.println("Play music");
//     }
// }
// abstract class G_Wagon extends Car {

//     public void drive(){
//         System.out.println("Driving...");
//     }

//     // public void fly(){
//     //     System.out.println("flying...");
//     // }
// }

// class UpdateWagon extends G_Wagon{   // Concrete class

//     @Override
//     public void fly() {
//         System.out.println("Flying...");
//     }
    
// }


// Inner class
// class A {

//     int age; 

//     public void show(){
//         System.out.println("In show");
//     }
//     static class B {
//         public void config(){
//             System.out.println("In config");
//         }
//     }
// }



// Anonymus inner class
class A {
    public void show(){
        System.out.println("In a show");
    }
} 


public class index {
    public static void main(String[] args) {
        // double d = 4.5;
        
        // int i = (int) d;
        // System.out.println(i);

        // Now here you cannot call a method of B from the class A object, because it's an object of class 
        // A and class A has no idea what show1() is. You cannot call subclass methods from a superclass reference, 
        // unless you downcast.

        // A obj = new A();
        // obj.show();


        // This is upcasting, converting subclass b into parent class a. obj is treated as an A, even though the actual object is a B.
        // why use it ? - to treat different child classes the same way through their parent
        // You Upcast to write genral code that works with many subclasses. Use the parent's name, let the child decide the action
        // But you still can't call the method of B, reason - Even though the object is a B, the refernece is of type A. And java only allows you to call methods available in the reference type
        // you can only use what the reference type Knows and A doesn't know what Show1() is...

        // A obj = new B();
        // obj.show();


        // To solve the method problem we can use - Downcasting
        // DownCasting - Downcasting is the process of converting a superclass reference back into a subclass reference,
        // It's done explicitly using a cast operator and is used when you need to access subclass-specific methods or fields
        // has for this one - You can only call B's Methods after telling java
        // converting the A reference (obj) back to B. Now obj1 can see everything in class B
        // B obj1 = (B) obj;
        // obj1.show();
        // obj1.Show1();



// Wraapper class - means converting primitive types (int, float, double) into objects(intger, character, double)
// int - Integer
// char - Character
// double - Double

        // int num = 7;
        // Integer num1 = 8;
        // Integer num2 = num;  // Auto-boxing -> it's the automatic conversion of a primitive data type into its corresponding wrapper class object

        // Integer num3 = num2; // auto-unboxing -> it's the reverse, converting a wrapper class object  back to its primitive type

        // String str = "12";
        // int num4 = Integer.parseInt(str);  // parseInt() - takes a string, takes the digit out and turns it into an int.
        // System.out.println(num4);

        // System.out.println(num1);

// Abstract Keyword -> used to declare a class or method that is incomplete.
// A class marked as abstract cannot be instantiated and may contain abstract methods(methods without a body).
// A method marked abstract has no body and must be overriden in a sublass 
// we cannot create a obj of an abstract class

        // Car obj = new UpdateWagon();
        // obj.drive();
        // obj.playMusic();
        // obj.fly();


// Inner class // - a class within a class, declared inside another class

        // A obj = new A();
        // obj.show();  
        
        // to execute a method of inner class, first you need to point to the inner class with the main class, 
        // A.B obj1 = obj.new B();   // if you want to access anything in a class you need an object, same for the inner class, you need an object
//                                   so if you want to create an object of b, you need an object of a, because that is a non static method

        // A.B obj2 = new A.B(); // if the inner class is static
        // obj2.config();


// Anonymus Inner class //
// An anonymus inner class in java is a class declared and instantiated in a single expression without a name, used to create a one time object
// with custom behaviour, usually by extending a class or implementing an interface

// new A() {.... : creates an anonymus inne class that extends class A. Inside the {.....} you override the show() method of class A.
// obj is a reference type A, but it's pointing to the anonymus subclass object.
        A obj = new A(){  
            public void show(){
                System.out.println("IN new SHOW");
            }
        };
        obj.show();


    }
}
