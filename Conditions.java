public class Conditions {
    public static void main(String a[]){
        // if else
        int x = 6;
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


        // ternary
        boolean isEven; 
        isEven = x%2==0 ? true : false;
        System.out.println(isEven);

        // switch
        int n = 1;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}