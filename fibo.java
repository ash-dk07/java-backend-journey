import java.util.*;

public class fibo {
    public static void main (String args[]){

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int t=1;
        for (int i = 1;i<=n;i++){
            t=t*i;
            System.out.println(t);
        }
        System.out.println("ans is :"+t);
    }
}