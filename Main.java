
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");   //hello world

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a%2==1){
            System.out.println("odd");
        }else{
            System.out.println("even");  // even odd
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x>=y && x>=z){
            System.out.println("largest number is x:"+x);
        }else if(y>=x&&y>=z){
            System.out.println("largest number is y:"+y);
        }else if(z>=x&&z>=y){
            System.out.println("largest number is z:"+z);
        }                                                       //largerst number


        //table
        int n = sc.nextInt();

        for (int i =0;i<=10;i++){
            int t=n*i;
            System.out.println(n+"x"+i+"="+t);
        }







    }

    }
