// class Computer {

// }
// class Laptop extends Computer {

// }

// class a{
//     public void show(){
//         System.out.println("In A Show");
//     }
// }
// class b extends a{
//     public void show(){
//         System.out.println("In B Show");
//     }
// }

// final class calc {
//     public final void show(){
//         System.out.println("in calc Show");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }


// Object Class equals tostring hashcode in java
// class Laptop {
//     int price;
//     String model;

//     @Override
//     public String toString() {
//         return "Laptop [price=" + price + ", model=" + model + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + price;
//         result = prime * result + ((model == null) ? 0 : model.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Laptop other = (Laptop) obj;
//         if (price != other.price)
//             return false;
//         if (model == null) {
//             if (other.model != null)
//                 return false;
//         } else if (!model.equals(other.model))
//             return false;
//         return true;
//     }
// }



// public class polymorphism {
//     public static void main(String[] args) {
        
//  Polymorphism:-  poly means many and morphism means behaviour, and there are two types - 1). Compile Time 2). Run time Polymorphism
//                  OverLoading is the part of compile time, and OverRiding is the part of Run time, 
//                  an object can take many forms, it allows one interface to be used for a general class of actions.
// OverLoading - same class, different method signatures or it can be parameters
// OverRiding - subclass modifies parent class method 
// this polymorphism will only work with inheritance  


        // a obj = new a();
        // obj.show();

// Computer lap = new Laptop();  // Laptop is a child class and computer is a parent class, We are creating a Laptop object 
        // but referencing it with a computer type this is called upcasting.
        // It allows runtime polymorphism, if laptop overRides a method from computer, the child's version runs. You can treat many subclasses as one type(parent)
        // Actual method depends on the object, not the reference type

        // obj = new b();
        // obj.show();

// Final keyword // variable/method/class
// final in variable - value connot be changed once assigned, if you try to do it, it will give an error
// final in method - connot be overriden by subclasses, it means if we use final in methods, it will not allow any subclass with same method to override it 
// final class - cannot be extended(no subclass can inherit from it ), in this another class cannot inherit from the final class, it stops the inheritance

        // final int num = 8;
        // System.out.println(num);


        // calc obj = new calc();
        // obj.show();
        // obj.add(4,10);


        // if we execute this part, java by default, it calls tostring() from object class and that returns garbage value
        // tostring() is a method in java used to return a string representation of an object
        // Every class in java inherits it from the object class, we use this method to decribe the object in a readable format. you override it to return object's details as a string 

        // Laptop obj = new Laptop();
        // obj.model = "HP Victus";
        // obj.price = 60000;
        // System.out.println(obj);

        // if you want proper output, overRide tostring() in laptop class
//         Laptop obj = new Laptop();
//         obj.model = "HP Victus";
//         obj.price = 60000;


//         Laptop obj1 = new Laptop();
//         obj1.model = "HP Victus";
//         obj1.price = 60000;

//         boolean result = obj.equals(obj1);

//         System.out.println(result);
        
//     }
// }
