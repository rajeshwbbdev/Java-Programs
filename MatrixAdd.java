public class MatrixAdd {
    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
        int c[][] = new int[a.length][b[0].length];
        if(a[0].length == b.length){   
        for(int i = 0; i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }}
        for(int i = 0; i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
