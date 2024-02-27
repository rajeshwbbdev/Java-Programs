public class NFOneToTenE5 {
    public static void main(String[] args) {
        int num = 10;
        for(int i = 1; i<=num; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
