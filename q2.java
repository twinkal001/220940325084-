import java.util.Scanner;

class BankAccount{
    int accno;
    int balance;
    int amount;
    BankAccount(int p, int q) {
        this.accno = p;
        this.balance = q;
    }
    void withdraw(int r){
        this.amount = r;
        try{
            if(balance < amount){
                throw new ArithmeticException("LOW BALANCE ");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        if(balance > amount) {
            balance = balance - amount;
        }
        System.out.println("The New Balance is "+balance);
    }
    void deposit(int bank) {
        this.amount = bank;
        balance = balance + amount;
        System.out.println("The New Balance Is "+balance);
    }
    void show(){
        System.out.println("The Account number is "+accno);
        System.out.println("The bank balance is "+balance);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bank;
        System.out.println("Enter the account number");
        int p = input.nextInt();
        System.out.println("Enter your account balance");
        int q = input.nextInt();
        bank = new BankAccount(p,q);
        s:while(true){
            System.out.println("1.Withdraw Money");
            System.out.println("2.Deposit Money");
            System.out.println("3.Account Balance");
            System.out.println("4.Exit");
            int a = input.nextInt();
            switch (a){
                case 1:
                    System.out.println("Enter your withdraw amount :");
                    int b = input.nextInt();
                    bank.withdraw(b);
                    break;
                case 2:
                    System.out.println("Enter your deposit amount :");
                    int c = input.nextInt();
                    bank.deposit(c);
                    break;
                case 3:
                    System.out.println("Account Details are : ");
                    bank.show();
                    break;
                case 4:
                    break s;
            }

        }

    }
}
