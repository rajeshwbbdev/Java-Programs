public class SofRACinArr {
    public static void main(String[] args) {
        int a[][] = {       
            {1, 2, 3},    
            {4, 5, 6},    
            {7, 8, 9}    
        };   
        int c =0, n =0;
        for(int i = 0; i<a.length;i++){
            c=0;
            for(int j =0;j<a.length;j++){
                c += a[i][j];
            }
            System.out.println("sum of row "+ ++n +" "+ c);
        }
        for(int i = 0; i<a.length;i++){
            c=0;
            n=0;
            for(int j =0;j<a.length;j++){
                c += a[j][i];
            }
            System.out.println("sum of column "+ ++n +" "+ c);
        }
    }
}
