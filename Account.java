package Inheritance;

class Account1
{
    public String accNumber;
    public String name;
    public String address;
    public String phNo;
    public String dateOfBirth;
    public double balance=0;
    public double loan=0;
              
    
    public String getAccNumber()
    {
        return accNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhNo()
    {
        return phNo;
    }
    public String getDOB()
    {
        return dateOfBirth;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getLoan()
    {
        return loan;
    }
    public void setAccNumber(String accNumber)
    {
        this.accNumber = accNumber;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhNo(String phNo)
    {
        this.phNo = phNo;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setLoan(double amnt)
    {
        loan = amnt;
    }
}

class SavingsAccount extends Account1
{
    public double depAmount;
    public double withDrawAmount;
    public double fixedDeposit;
    
    public String deposit(double depAmount)
    {
        balance += depAmount;
        return "Balance: "+balance;
    }
    public String withDraw(double withDrawAmount)
    {
        balance -=  withDrawAmount;
        return "Balance: "+balance;
    }

    
    public double calculateFixedDeposit(double principal, double annualRate, 
           int years, int compoundingPerYear)
    {
        double interestRate = annualRate / 100.0;
        double maturityAmount = principal * 
                Math.pow((1 + interestRate / compoundingPerYear), compoundingPerYear * years);

        return maturityAmount;
    }

}

class LoanAccount extends Account1
{
    public void payEMI(double amnt)
    {
        loan -= amnt;
    }
    public void repay(double amnt)
    {
        if(loan == amnt)
            loan = 0; 
    }
}

public class Account {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        LoanAccount l = new LoanAccount();
        s.deposit(700000);
        System.out.println("Fixed Deposit maturity amount "+s.calculateFixedDeposit(100000, 4.5, 5, 4));
        l.setLoan(50000);
        l.payEMI(20500);
        System.out.println(l.getLoan());
        
    }
    
}