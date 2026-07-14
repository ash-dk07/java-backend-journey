package DSA;

public class DSA2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int odd=0;
        int even=0;
        for(int i=0;i <n ;i++){
         if(arr[i]%2==0){
             even++;
         }else{
             odd++;
         }
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);
    }
}
