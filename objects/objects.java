package objects;

// class calculator {

//     int a;

//     public int add(int n1, int n2){
//         int r = n1 + n2;
//         return r;
//     }
// } 

// public class objects {
//     public static void main(String a[]){

//         // Object oriented programming 
//         // Objects - Properties and behaviours 
        
//         int num1 = 4, num2 = 5;
//         // int res = num1 + num2;
//         // System.out.println();

//         calculator cal = new calculator();

//         int result = cal.add(4,5);
//         System.out.println(result);

//     }
// }





// Q.1 
// class student {
//     String name = "Aditya";
//     int age = 19;
//     void display(){
//         System.out.println("Nmae: " + name);
//         System.out.println("Age: " + age);
//     }
// }
// public class objects {
//     public static void main(String a[]){
//         student st = new student();
//         st.display();
//     }
// }



// Q.2
// class Car {
//     String Model = "EX90";
//     int year = 2020;
//     void start(){
//         System.out.println("Car Started");
//     }
// }
// public class objects {
//     public static void main(String a[]){
//         Car c = new Car();
//         c.start();
//     }
// }


// Q.3
// class Calculator {
//     public int add(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
// }
// public class objects {
//     public static void main(String a[]){
//         Calculator calc = new Calculator();
//         int result = calc.add(5,5);
//         System.out.println(result);
//     }
// }

// Q.4 
// class Dog {
//     String name;
    
//     void kutta() {
//         System.out.println(name + " says: woof");
//     }
// }
// public class objects {
//     public static void main(String[] args) {
//         Dog dog1 = new Dog();
//         dog1.name = "Ghost";
        
//         Dog dog2 = new Dog();
//         dog2.name = "Pillu";
        
//         dog1.kutta();
//         dog2.kutta();
//     }
// }


// Q.5 
// class Rectangle {
//     int length;
//     int width;
//         public int area(){
//             int a = length * width;
//             System.out.println(a + " is the area for this");
//             return 0;
//         }
// }
// public class objects {
//     public static void main(String[] args) {
//         Rectangle rec1 = new Rectangle();
//         rec1.length = 10;
//         rec1.width = 20;
        
//         Rectangle rec2 = new Rectangle();
//         rec2.length = 20;
//         rec2.width = 40;
        
//         Rectangle rec3 = new Rectangle();
//         rec3.length = 5;
//         rec3.width = 10;
        
//         rec1.area();
//         rec2.area();
//         rec3.area();
//     }
// }


//////// Methods /////

// class computer {
//     public void playmusic(){
//         System.out.println("Music playing");
//     }
//     public String getmeapen(int cost){
//         if(cost >= 10 ){
//         return "pen";
//         } else 
//             return "Nothing";
//     }
// }
// public class objects {
//     public static void main(String a[]){
//         computer com = new computer();
//         com.playmusic();
//         String str = com.getmeapen(5);
//         System.out.println(str);
//     }
// }


/////////// Method overloading /////////
// class Calculator {
//     public int add(int n1, int n2){
//         return n1 + n2;
//     }
//     public int add(int n1, int n2, int n3){
//         return n1 + n2 + n3;
//     }
// }
// public class objects {
//     public static void main(String a[]){
//         Calculator cal = new Calculator();
//         int num = cal.add(10,10);
//         System.out.println("addition in add = " + num);

//         // int num1 = cal.add1(10,10,10);
//         // System.out.println("Adittion in add1 = " + num1);
//     }
// }


/////// Stack and heap memory ///// 

class Calculator {

    int num;   /// Stored in heap  

    public int add(int n1, int n2){
        int a = n1 + n2; // Stored in Stack 
        return a;
    }
}
public class objects {
    public static void main(String a[]){
        Calculator cal = new Calculator(); // Object create with new lies in heap
        int num = cal.add(10,10);
        System.out.println("addition in add = " + num);
    }
}

