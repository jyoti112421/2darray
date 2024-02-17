
public class reverse {

    
    public static void print(int[][]arr){  }
        public static void main(String args) {
       int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n=arr[0].length;
        print(arr);
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                int temp=arr[i][j];
        arr[i][j]=arr[i][j];
        arr[i][j]=temp;
                

                
            }
            
        
    }
    print(arr);
    
for(int i=0;i<m;i++){
    int a=0, b=m-1;
    while(a<b){
        int temp=arr[i][a];
        arr[i][a]=arr[i][a];
        arr[i][b]=temp;
        a++;
        b--;
    }

}

        }
}
