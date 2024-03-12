public class ArrLar {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2,4,3,9,0, 5,8,6,7};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            
                if(max > arr[i]){
                    max = arr[i];
                }
            
        }
        System.out.println(max);
    }
}
