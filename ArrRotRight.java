import java.util.Scanner;

public class ArrRotRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] arr= new int[] {1, 2,3,4, 5};
        for(int i = 0; i<times;i++){
            int first = arr[arr.length-1],j;
            for(j =arr.length -1;j>0;j--){
                arr[j] = arr[j-1];
                
            }
            arr[0] = first;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
