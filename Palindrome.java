import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rem,sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum*10 +rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");

        }
    }
}
