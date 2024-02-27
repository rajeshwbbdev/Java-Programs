import java.util.Scanner;

/**
 * PrimeNum
 */
public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        while (num>1) {
            if(num == 2){
                System.out.println("2 is a prime number");
                break;
            }
            else{
                for(int i = 2; i<num;i++){
                    if(num%i == 0){
                        System.out.println(num + " is not a prime number");
                        break;
                    }
                    else{
                        System.out.println(num + " is a prime number");
                        break;
                    }
                }
                break;
            }
        }
    }
}