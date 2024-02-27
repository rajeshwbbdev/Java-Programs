import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter a limt : ");
        int limit = sc.nextInt();
        System.out.println("Multiplication Table Of " + num + " : ");
        for(int i = 1; i<=limit; i++){
            System.out.println(num + " + " + i + " = " + num*i);
        }
    }
}
