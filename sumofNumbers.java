import java.util.Scanner;
    import java.util.*;

    public class sumofNumbers {
        public static void main (String args[]){

            Scanner sc =new Scanner(System.in);

            int n = sc.nextInt();
            int t=0;
            for (int i = 1;i<=n;i++){
                t=t+i;
               // System.out.println(t);
            }
            System.out.println("ans is :"+t);
        }
    }

