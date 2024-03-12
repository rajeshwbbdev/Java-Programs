public class ArrAscending {
    public static void main(String[] args) {
        int arr[] = new int[] {2,4,1,2,3,5,5,2};
        int val = arr[0];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
