public class max2d {
    public static void main(String[] args) {
        int [][]arr={{3,4,5}, {5,7,9} ,{3,2,1}};
        int mx=Integer.MIN_VALUE;
        int m= arr.length;
        int n= arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                mx=Math.max(mx,arr[i][j]);


            }

        }
        System.out.println(mx);

    }
}
