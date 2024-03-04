import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = i;k>=1;k--){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = i;k>=1;k--){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
    }
}