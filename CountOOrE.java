public class CountOOrE {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,9,8};
        int countEven = 0, countAdd = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]%2 == 0){
                countEven++;
            }
            else{
                countAdd++;
            }
        }
        System.out.println(countEven + "  " + countAdd);
    }
}
