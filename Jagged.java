public class Jagged {
    public static void main(String a[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[3];

        int threed[][][] = new int[2][3][1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 1; k++) {
                    threed[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(threed[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
