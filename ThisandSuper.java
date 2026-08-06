class A{
    public A(){
        super(); // calls object
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("Int: In A");
    }
}

class B extends A{
    public B(){
        super(); // calls a
        System.out.println("In B");
    }
    public B(int n){
        // this(); // calls both b constructors
        super(n); // calls both a constructors
        System.out.println("Int: In B");
    }
}

public class ThisandSuper {
    public static void main(String[] args) {
        B obj = new B(4);
    }
}
