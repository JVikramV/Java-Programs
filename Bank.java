
class Account
{
    String name;
    String accno;
    double balance;
    String accounttype;
    Account(String name,String accno,double balance,String accounttype)
    {
        this.name=name;
        this.accno=accno;
        this.balance=balance;
        this.accounttype=accounttype;
    }
    public void displayaccountdetails()
    {
        System.out.println("Account Holder="+name);
        System.out.println("Account number="+accno);
        System.out.println("Balance="+balance);
        System.out.println("Account Type="+accounttype);
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Deposited="+amount);
        System.out.println("New Balance="+balance);

    }
    public void withdraw(double amount)
    {
        balance-=amount;
        System.out.println("Withdrawn="+amount);
        System.out.println("New Balance="+balance);
    }
}
class Savacct extends Account{
    private final double interestrate=0.04;
    Savacct(String name,String accno,double balance)
    {
        super(name,accno,balance,"Savings");
    } 
    public void computeanddepositinterest()
    {
        double interest=balance*interestrate;
        balance+=interest;
        System.out.println("Interest deposited="+interest);
        System.out.println("New balance="+balance);
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Amount withdrawn="+amount);
            System.out.println("New balance="+balance);
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}
class Curacct extends Account{
    private final double minbalance=1000.0;
    private final double penalty=50.0;
    Curacct(String name,String accno,double balance)
    {
        super(name,accno,balance,"Current Account");
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Amount Withdrawn="+amount);
            System.out.println("New balance="+balance);
        }
        else{
            System.out.println("Balance is below minimum balance required.Penalty imposed!");
            balance-=penalty;
            System.out.println("Penalty of"+penalty+"has been imposed.");
            System.out.println("New balance after penalty="+balance);
        }

    }
    public void checkminbalance()
    {
        if(balance<minbalance)
        {
            balance-=penalty;
            System.out.println("Service charge imposed due to low balance.");
            System.out.println("New balance="+balance);
        }
    }

}
public class Bank
{
    public static void main(String[] args)
    {
        Savacct savings_account=new Savacct("John Doe","DA12345",5000.0);
        savings_account.displayaccountdetails();
        savings_account.deposit(2000.0);
        savings_account.computeanddepositinterest();
        savings_account.withdraw(1000.0);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Curacct current_account=new Curacct("Jane Smith","HG98765",1500.0);
        current_account.displayaccountdetails();
        current_account.deposit(500.0);
        current_account.withdraw(1200.0);
        current_account.checkminbalance();
        current_account.displayaccountdetails();

    }
}
