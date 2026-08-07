class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class UpcastingandDowncasting{
    public static void main(String args[]){
        Animal a = new Dog(); // Upcasting
        a.sound();

        Dog d = (Dog) a; // Downcasting
        d.sound();
    }
}