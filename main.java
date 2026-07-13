import java.util.Scanner;
class BankAccount {

    private int balance;

    void setBalance(int balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }

    }

    int getBalance() {
        return balance;
    }

}

public class main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int password = 54321;



        BankAccount account = new BankAccount();

        account.setBalance(-5000);
        System.out.print("enter password:");
        int key =sc.nextInt();
        if(key==password){
            System.out.println(account.getBalance());
        }else{
            System.out.println("invalid password");
        }



    }

}