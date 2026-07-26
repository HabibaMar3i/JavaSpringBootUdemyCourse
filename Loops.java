class Loops{
    public static void main(String a[]){
        // while loop
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        // do while loop
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);

        // for loop
        for(int k=1;k<=5;k++){
            System.out.println(k);
            for (int m = 0; m < 2; m++) {
                System.out.println("m "+m);
            }
        }
    }
}