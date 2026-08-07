final class A{ // can't be inherited
    public void show(){
        System.out.println("In A");
    } 
}

// class B extends A{ 
//     public void show(){
//         System.out.println("In B");
//     }
// }

class Computer{
    final public void test(){ // can't be overridden
        System.out.println("testtt");
    }
}

class Laptop extends Computer{
    // final public void test(){ 
    //     System.out.println("testtt");
    // }
}

public class Final {
    public static void main(String[] args) {
        final int num = 5;
        // num = 7; constant can't be assigned 
        System.out.println(num);
    }
}
