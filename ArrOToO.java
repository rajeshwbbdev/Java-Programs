class ArrOToO {
    static void prinnt(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void coopy(int arr[]){
        int arr2[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        prinnt(arr2);

    }
    public static void main(String[] args) {
        int arr1[] = new int[] {1, 2, 3, 4, 5};
        coopy(arr1);
    }
}
