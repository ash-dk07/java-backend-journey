
import java.util.Scanner;

class bank_account{
    int deposit;
    int withdraw;
    int checkbalance;

    void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void setCheckbalance(int checkbalance) {
        this.checkbalance = checkbalance;
    }

    public int getCheckbalance() {
        return checkbalance;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }
}


public class ATM {

    public static void main(String[] args) {
        bank_account D =new bank_account();
        Scanner sc =new Scanner(System.in);
        int balance =50000;
        int pin = 1234;
        System.out.println("welcome to ICICI BANK ");
        System.out.print("enter pin:");
        int eneteredPin =sc.nextInt();
        if (pin==eneteredPin){
            System.out.println();
            System.out.println("hey user your pin is accepted");
            System.out.println();
            System.out.println("select the option between this ");
            System.out.println("1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.check balance");
            System.out.println("4.exit");

            int option =sc.nextInt();

            switch (option){
                case 1:

                    System.out.print("enter the amount:");

                    D.setDeposit(sc.nextInt());
                    System.out.println(D.getDeposit()+ " deposited to your account");
                    balance =balance+D.getDeposit();
                    break;
                case 2:
                    System.out.print("enter the amount:");

                    D.setWithdraw(sc.nextInt());
                    System.out.println(D.getWithdraw()+ " withdrawed to your account");
                    balance =balance- D.getWithdraw();
                    break;
                case 3:
                    D.setCheckbalance(balance);
                    System.out.println("you balance is:"+D.getCheckbalance());
                    break;
                case 4:
                    break;

            }
          if(option==1 ||option==2){
              System.out.println("your new balance is "+balance);
          }
        }else{
            System.out.println("wrong pin");

        }


    }

}
