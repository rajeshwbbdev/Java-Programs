import java.util.Scanner;

public class First100Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("The first " + num + " Numbers : ");
        for(int i = 1; i<=num;i++){
            
            System.out.println(i);
            
        }
        
    }
}
