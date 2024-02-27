import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in Ascending Order : ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
