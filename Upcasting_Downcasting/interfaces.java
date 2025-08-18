// abstract class A{
//     public abstract void show();

// }

// Interface // -> An interface is a collection of abstract methods (no body), and constants. It’s used to achieve abstraction and multiple inheritance. 
// All the methods in interface are public and abstract by default. All variables are public static and final, a class implements an interface. we can implement multiple interfaces (Java doesn't allow multiple classes to be extended, but interfaces? Go wild).

// interface A {

//     int age = 20;
//     String area = "gwl";

//     void show();
//     void config();
// }

// interface x{
//         void run();
// }

// interface Y extends x{

// }

// class B implements A,Y{ 
// // to inherit an interface we use implements

//     public void show(){
//         System.out.println("In a show");
//     }
//     public void config(){
//         System.out.println("In config");
//     }
//     public void run(){

//     }
// }


// interface computer {
//     public abstract void code();
// }
// class Laptop implements computer{
//     public void code(){
//         System.out.println("Code, compile, run");
//     }
// }
// class Dev{
//     public void devapp(computer lap){
//         lap.code();
//     }
// }
// class Desktop implements computer{
//     public void code(){
//         System.out.println("Code, compile, run: faster");
//     }
// }




// enum Status{
//         Running, Failed, pending, success;
// }
// enum Laptop{
//         MacBook(2000), Victus(1500), LOQ(1400), Omen(1900);

//         private int price;

//         private Laptop(int price) {
//                 this.price = price;
//         }

//         public int getPrice() {
//                 return price;
//         }

//         public void setPrice(int price) {
//                 this.price = price;
//         }  

// }

// @FunctionalInterface
// interface A{
//         void show(int i);
// }

// @FunctionalInterface
// interface B{
//         int show(int i, int j);
// }



// instantiate - to create a an instance(object) of a class.
// public class interfaces {
//     public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In new show");
        //     }
        // };
        // obj.show();


        // interface // one
        // A obj;
        // obj = new B();
        // obj.show();
        // obj.config();

        // System.out.println(A.area);

// 2nd 

        // computer lap = new Laptop();
        // computer desk = new Desktop();


        // Dev adi = new Dev();
        // adi.devapp(desk);


// ********************************************* // 

// Enum - An enum lets you define a fixed list of things that won’t change. A special type of class, used to define a collection of contants, you can't instantiate them using new

        // int i = 5;
        // Status[] ss = Status.values();
        // System.out.println();

        // System.out.println(ss[0]);

        // Status s = Status.Running;
        // if(s == Status.Running){
        //         System.out.println("Good Running");
        // }      
        // else if(s == Status.Failed){
        //         System.out.println("Try Again");
        // } else if(s == Status.pending){
        //         System.out.println("Please wait");
        // } else {
        //         System.out.println("done");
        // }

        // switch(s){
        //         case Running -> System.out.println("Good Running");
        //         case Failed -> System.out.println("Try Again");
        //         case pending -> System.out.println("Please wait");
        //         case success -> System.out.println("done");
        // }
        

        // Laptop lap1 = Laptop.MacBook;
        // System.out.println(lap1 + ": " + lap1.getPrice());

        // for(Laptop lap : Laptop.values()){
        //         System.out.println(lap + " : " + lap.getPrice());
        // }
//////////////////////  Annotation  ////////////////////
        // Annotations in Java are like metadata tags—they don’t do anything themselves, but they give instructions to the compiler or tools.They’re marked with @.


// types of interfaces // 
// 1). Normal interface 2). Functional/SAM  interface 3). Marker interface.

// normal interface only declares methods NO body.
// Marker interface Empty. No methods. Used to mark classes.Example: Serializable, Cloneable
// Functional interface Has only one abstract method. Used in lambda expressions.
// functional interfaces works with only one mehtod because, lambda expressions don't have names and java wouldn't know which method to call if there were more than one.

// Lambda expression in Java is a short-cut for writing anonymous functions—mainly used with functional interfaces.
        // A obj = (int i) -> {
        //                 System.out.println("in show " + i);
        //         };
        // obj.show(10);
        // A obj = i -> {
        //                 System.out.println("in show " + i);
        //         };
        // obj.show(10);



        // B obj = (int i, int j) -> i+j;

        // int result = obj.show(10, 10);
        // System.out.println(result);


//     }
