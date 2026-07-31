class Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }

    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public double add(double num1, int num2){
        return num1+num2;
    }
}
public class Overloading {
    public static void main(String a[]){
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        System.out.println(result);
        int total = calc.add(3, 2, 7);
        System.out.println(total);
        double add = calc.add(5.5, 9);
        System.out.println(add);
    }
}
