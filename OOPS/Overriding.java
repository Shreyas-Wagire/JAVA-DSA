
public class Overriding {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("They can eat");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger eats Deers!!");
    }
}