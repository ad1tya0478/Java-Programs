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
// class B implements A{
// // to inherit an interface we use implements

//     public void show(){
//         System.out.println("In a show");
//     }
//     public void config(){
//         System.out.println("In config");
//     }
// }



class Dev{
    public void devapp(){
        System.out.println("coding....");
    }
}


// instantiate - to create a an instance(object) of a class.
public class interfaces {
    public static void main(String[] args) {
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

        Dev adi = new Dev();
        adi.devapp();


    }
}
