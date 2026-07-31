class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
public class Objects {
    public static void main(String a[]){
        int num1 = 4;
        int num2 = 5;
        int result;

        Calculator calc = new Calculator();
        result = calc.add(num1, num2);
        System.out.println(result);
    }
}
