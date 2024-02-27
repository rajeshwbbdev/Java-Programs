import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int LastNum = 0, sum = 0;
    while(num>0){
        LastNum = num%10;
        sum = sum +LastNum;
        num = num/10;
        
    }
    System.out.println("The sum of Number " + num + " is " + sum);
    
}
}
