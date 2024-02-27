import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp;
        System.out.println("Original Numbers ");
        System.out.println("Number 1 : " + n1 + "\nNumber 2 : "+ n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After Swapping : ");
        System.out.println("Number 1 : " + n1 + "\nNumber 2 : "+ n2);
    }
}
