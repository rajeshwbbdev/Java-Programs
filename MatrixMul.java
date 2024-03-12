public class MatrixMul {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};  
        int c[][] = new int[a.length][b[0].length];
        if(a[0].length == b.length){   
        for(int i = 0; i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                for(int k = 0;k<a.length;k++){
                c[i][j] += a[i][j] * b[j][i];
            }}
        }}
        for(int i = 0; i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
