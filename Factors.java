import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("Factors of "+ num + " is ");
        for(int i = 1; i<=num;i++){
            if(num%i == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of factors is " + count);
    }
}
