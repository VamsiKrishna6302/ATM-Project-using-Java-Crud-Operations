import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ATM {
    static int balance=10000;
        public static void main(String args[] ) {
            Operations o=new Operations();
            o.setBalance(balance);
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("=======================================================================");
                System.out.println("Automated Teller Machine");
                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.MiniStatement");
                System.out.println("5.EXIT");
                System.out.println("Available Balance : "+balance);
                System.out.print("Enter Your choice: ");
                Map<Integer,String> m=new HashMap<Integer,String>();
                int choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.print("Enter money to be withdrawn: ");
                        int withdraw1=sc.nextInt();
                       if((withdraw1>0) && (withdraw1<=balance)){
                           balance=balance-withdraw1;
                           m.put(withdraw1," Amount Withdrawn ");
                           System.out.println(withdraw1+" Withdrawn successfully !! ");
                        }
                       else{
                           System.out.println("Please check the balance you had entered or Insufficient Balance");
                       }
                        System.out.println("");
                        System.out.println("=======================================================================");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited: ");
                        int deposit = sc.nextInt();
                        if(deposit>0){
                            balance = balance + deposit;
                            m.put(deposit,"Amount Deposited");
                            System.out.println("Your Money has been successfully deposited !! ");
                            System.out.println("");
                        }
                        else{
                            System.out.println("Check the  number you had entered ");
                        }
                        System.out.println("=======================================================================");
                        break;

                    case 3:
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        System.out.println("=======================================================================");
                        break;
                    case 4:
                        for(Map.Entry<Integer,String> a:m.entrySet()){
                            System.out.println(a.getKey()+" "+a.getValue());
                        }
                        System.out.println("=======================================================================");
                        break;
                    case 5:
                        System.out.println("Thanks for visiting the ATM Machine");
                        System.out.println("=======================================================================");
                        System.exit(0);
                    default:
                        System.out.println("Please check what u have entered ");
                        System.exit(0);
                        break;
                }
            }
        }
    }

