import java.util.Scanner;

class ArmStrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, res = 0;
        int temp = num;
        int size = String.valueOf(num).length();
        while(num>0){
            rem = num%10;
            res = res + (int) Math.pow(rem, size);
            num = num/10;
        }
        if(temp == res)
            System.out.println(temp + "is a palindrome");
        else
            System.out.println(temp + "is  not a Palindrome");
    }
}