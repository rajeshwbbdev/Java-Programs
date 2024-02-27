import java.util.Scanner;

public class DivisibleBy2A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num;i++){
            if(i%3 == 0 && i%2 == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total numbers which are divisible by 3 and 2 from 1 to " + num + " : " + count);
        
    }
}
