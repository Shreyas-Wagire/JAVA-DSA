
public class MyClass {

public static void main(String[] args) {
    
}

}

// base class 

class Animal {

    String color;

    void eat(){
        System.out.println("They can eat.");
    }

    void breath(){
        System.out.println("They also Breath.");
    }

}


// derive class / sub class

class Mammals extends Animal{
    void walk(){
        System.out.println("They Walk !!");
    }
}

class Bird extends Animal{
    void fly() {
        System.out.println("They can Flys!");
    }
}

class Fish extends Animal{
    void swim() {
        System.out.println("They can swin!!");
    }
}

