package DSA;

public class DSA1 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 99, 45};
        int n = arr.length;
        int max= arr[0];

      for(int i=1;i<n;i++){
          if(arr[i]>max){
              max=arr[i];
          }
      }
        System.out.println(max);
    }
}
