import java.util.Scanner;

public class max2duserinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][]arr= new int[4][3];
        int m= arr.length;
        int n= arr[0].length;
        int mx=Integer.MIN_VALUE;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                mx=Math.max(mx,arr[i][j]);

            }
        }
        System.out.println(mx);
    }

}
