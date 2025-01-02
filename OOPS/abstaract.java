public class abstaract {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();

        Human man = new Human();
        man.eat();
        man.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("They can eat!!");
    }

    abstract void walk();
}

class Tiger extends Animal{
    void walk(){
        System.out.println("Tiger walk on 4 legs!");
    }
}

class Human extends Animal{
    void walk(){
        System.out.println("Human walk on 2 legs!!");
    }
}


