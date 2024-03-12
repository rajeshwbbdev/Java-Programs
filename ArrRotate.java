import java.util.Scanner;

public class ArrRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] arr= new int[] {1, 2,3,4, 5};
        for(int i = 0; i<times;i++){
            int first = arr[0],j;
            for(j =0;j<arr.length -1;j++){
                arr[j] = arr[j+1];

            }
            arr[j] = first;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
