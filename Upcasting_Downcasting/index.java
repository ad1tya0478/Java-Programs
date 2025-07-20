class A{
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void Show1(){
        System.out.println("In B show");
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

        A obj = new B();
        obj.show();


        // To solve the method problem we can use - Downcasting
        // DownCasting - Downcasting is the process of converting a superclass reference back into a subclass reference,
        // It's done explicitly using a cast operator and is used when you need to access subclass-specific methods or fields
        // has for this one - You can only call B's Methods after telling java
        // converting the A reference (obj) back to B. Now obj1 can see everything in class B
        B obj1 = (B) obj;
        obj1.show();
        obj1.Show1();



    }
}
