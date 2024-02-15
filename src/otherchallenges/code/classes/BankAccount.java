package otherchallenges.code.classes;

public class BankAccount {

    long accountNumber;
    String accountName;
    double balance;

    public void makeDeposit(double depositValue){
        balance += depositValue;

        if (depositValue < 0) {
            System.out.println("Please, depoist values hihger than 0");
        }
    }

    public void makeWithdraw(double withdrawValue){
        balance -= withdrawValue;

        if(withdrawValue > balance){
            throw new RuntimeException("Value higher than the value in balance");
        }
    }
}
