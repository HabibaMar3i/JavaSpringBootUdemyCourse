public class Conditions {
    public static void main(String a[]){
        // if else
        int x = 5;
        int y = 7;
        int z = 9;
        if(x>y)
        {
            System.out.println("x is greater than y");
        }
        else
        {
            System.out.println("y is greater than x");
        }
        
        // if else if 
        if(x>y && x>z)
            System.out.println("x is the greatest");
        else if(y>z)
            System.out.println("y is the greatest");
        else
            System.out.println("z is the greatest");
    }
}