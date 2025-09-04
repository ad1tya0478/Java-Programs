// Every class in java extends Object class, even if you mention or not mention, its the same thing 
class A  extends Object{
    public A(){
        super();
        System.out.println("in A");   // Now whenever you got an object of a class it will call 
//                                         the constructor of subclass and superclass both. 
    }
    public A(int n){
        super();
        System.out.println("in A Int");
    }
}
class B extends A {
    public B() {   // Constructor

        super();  // Super() - this keyword lets a child use stuff from its parent class, well it is already present in code, if you mention it ot not, it will be present.
//                             in simple way, super means call the constructor of the parent class
        System.out.println("in B");
    }
    public B(int n){
        // super(n);    // Super paramter calls the constructor of the parent class with the given aregument.
        
        this(); // Execute the constructor of the same class 

        
        System.out.println("In B int");
    }
}
public class thiss {
    public static void main(String a[]){
        // B obj = new B(5);   // Whenever you Create the object it wil call the constructor of the class.
    }
}



