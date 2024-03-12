public class ArrFreq {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,3,4,5,2,5,2};
        int freq[] = new int[arr.length];
        int visited = -1;
        for(int i = 0; i<arr.length;i++){
            int  count = 1;   
            for(int j = i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                        freq[j] = visited;
                    }
                }
            if(freq[i] != visited){
                    freq[i] = count;
                }
        }
        printt(arr, freq);
    }
    static void printt(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != -1) {
                System.out.println("Element: " + arr1[i] + ", Frequency: " + arr2[i]);
            }
        }
    }

    }

