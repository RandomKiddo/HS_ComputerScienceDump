public class AccountArray{
  public static void main(String [] args){
    Account[] accounts = new Account[10];
    for (int a = 0; a < 5; a++){
      accounts[a] = new Checking(100 + a, 1000 + (1000 * a));
    }
    for (int a = 5; a < 10; a++){
      accounts[a] = new Savings(100 + a, 1000 + (1000 * a), .02);
    }
    for (Account acc : accounts){
      System.out.println(acc);
      System.out.println("Interest Earned = " + acc.computeInterest(3));
      System.out.println();
    }
  }
}
abstract class Account{
  private int accountNumber;
  private double balance;
  public Account(int accNum, double bal){
    accountNumber = accNum;
    balance = bal;
  }
  public int getAccountNumber(){ return accountNumber; }
  public double getBalance(){ return balance; }
  public void setAccountNumber(int to){ accountNumber = to; }
  public void setBalance(double to){ balance = to; }
  public String toString(){
    String tos = "Account # = " + accountNumber;
    tos += "\nAccount Balance = " + balance;
    return tos;
  }
  public abstract double computeInterest(int period);
}
class Checking extends Account{
  public Checking(int accNum, double bal){
    super(accNum, bal);
  }
  public String toString(){
    String tos = "Checking\n";
    tos += super.toString();
    return tos;
  }
  public double computeInterest(int period){
    double interest = 0.02 * (getBalance() - 700) * period;
    double rounded = Math.round(interest * 100) / 100.0;
    return rounded;
  }
}
class Savings extends Account{
  private double interestRate;
  public Savings(int accNum, double bal, double rate){
    super(accNum, bal);
    interestRate = rate;
  }
  public double getInterestRate(){ return interestRate; }
  public void setInterestRate(int to){ interestRate = to; }
  public String toString(){
    String tos = "Savings\n";
    tos += super.toString();
    return tos;
  }
  public double computeInterest(int period){
    double interest = Math.pow(1+interestRate, period);
    interest--;
    interest *= getBalance();
    double rounded = Math.round(interest * 100) / 100.0;
    return rounded;
  }
}