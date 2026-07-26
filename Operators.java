class Operators {
    public static void main(String a[]){
        // arithmetic operator
        int b = 2;
        int c = 3;
        int x = 9;
        int y = 5;
        int addition = b+x;
        int subtraction = c-y;
        int multiplication = b*c;
        int division = x/y; 

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        System.out.println(b++);
        System.out.println(++b);
        System.out.println(y--);
        System.out.println(--y);
        System.out.println(x+=2);
        System.out.println(y%b);
    }
}
