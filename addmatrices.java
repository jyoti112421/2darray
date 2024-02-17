import java.util.Scanner;

public class addmatrices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a=new int [3][3];
        int[][] b= new int[3][3];
        int m= a.length;
        int n=b[0].length;
        int[][] res=new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
                b[i][j]=sc.nextInt();
                res[i][j]=a[i][j]+b[i][j];
            }

        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");

            }
            System.out.println( );
        }


    }
}
