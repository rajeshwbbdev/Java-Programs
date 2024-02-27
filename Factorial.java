import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact;
        fact = fact(num);
        System.out.println(fact);
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
