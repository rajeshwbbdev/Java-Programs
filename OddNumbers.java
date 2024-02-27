import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num;i++){
            if(i%2 != 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total numbers of odd numbers from to " + num + " : " + count);
        
    }
}
