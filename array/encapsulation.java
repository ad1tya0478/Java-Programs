// class Human {
// private - It means the variable, method, or constructor is accessible only inside the same class. No other class, not even subclasses, can touch it directly.
//     private int age = 11;
//     private String name = "Aditya";

//     public int getage(){
//         return age;
//     }
//     public String getname(){
//         return name;
//     }
// }
// public class encapsulation {
//     public static void main(String a[]){

//         Human obj = new Human();
//         // obj.age = 11;
//         // obj.name = "Aditya";

//         System.out.println(obj.getname() + " : " + obj.getage());

//     }
// }

// getSomething() → returns the value of a private variable
// setSomething(value) → sets the value of that private variable


/////// .this() ///// -- points to the current object, the one that called the method 

/// Constructor — a special method used to initialize objects in Java.
//                It's called automatically when you use new. Never returns anything
//                will have the same name as the class name

class Human {
    private int age;
    private String name;

    // constuctor 
    public Human(){
        age = 12;
        name = "Adi";
    }

    public Human(String name) {
        this.name = name;
    }

    // Parameterized constructor 
    public Human(int a, String n) {
        age = a;
        name = n;
    }

    public int getage(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class encapsulation {
    public static void main(String a[]){

        Human obj = new Human();
        Human obj1 = new Human(18,"AdiS");
        //Human obj3 = new Human("AdiS");
        System.out.println(obj.getname() + " : " + obj.getage());
        System.out.println(obj1.getname() + " : " + obj1.getage());


        obj.setAge(90);
        obj.setName("Aditya"); 

        // System.out.println(obj.getname() + " : " + obj.getage());

    }
}