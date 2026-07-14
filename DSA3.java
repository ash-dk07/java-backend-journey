package DSA;

public class DSA3 {
    public static void main(String[] args) {
        int n =12345;
        int reverse=0;
        while (n>0){
         int ld = n%10;
         reverse=reverse*10+ld;
         n=n/10;
        }
        System.out.println(reverse);
    }
}
