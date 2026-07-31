class Calculator{
    int num= 5;
    public int add(int num1, int num2){
        return num1+num2;
    }
}

public class StackandHeap {
    public static void main(String a[]){
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        calc.num = 7;
        System.out.println(calc.num);
        System.out.println(calc1.num);
    }
}
