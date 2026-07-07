import java.util.*;
public class loops {

    public static void main(String[] args) {
        //Print numbers 1 to 100

//        for (int i=1;i<=100;i++){
//            System.out.println(i);
//        }

        //Print numbers 1 to n
       Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int og=n;
//        for (int i=1;i<=n;i++){
//            System.out.println(i);

            //Reverse a number
        int r =0;

        while (n!=0){
            int digit =n%10;
            r=r*10+digit;
            n=n/10;
        }
        System.out.println(r);

        //prime number

        if(og==r){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
