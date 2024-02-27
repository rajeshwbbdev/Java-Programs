import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int LastNum = 0, count = 0, rev = 0;
    while(num>0){
        LastNum = num%10;
        //count++;
        rev = rev*10 +LastNum;
        num = num/10;
        
    }
    System.out.println("The reversed Number of " + num + " is " + rev);
}
}
