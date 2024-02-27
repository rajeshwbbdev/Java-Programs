import java.util.Scanner;

public class SecLastDigit {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int LastNum = 0, count = 0;
    while(num>0){
        LastNum = num%10;
        count++;
        num = num/10;
        if(count == 2){
            break;
        }
    }
    System.out.println("The Last digit of " + num + " is " + LastNum);
}
}
