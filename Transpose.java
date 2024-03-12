public class Transpose {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};  
        int t[][] = new int[a.length][a[0].length];
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a[0].length;j++){
                t[i][j] = a[j][i];
            }
        }
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a[0].length;j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
