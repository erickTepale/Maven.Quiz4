package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{
    private Double balance;

    public BankAccount(){
        balance = 0.0;
    }
    public BankAccount(Double balance){
        this.balance = balance;
    }

    public void setBalance(Double val) {
        balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
            balance+= amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
