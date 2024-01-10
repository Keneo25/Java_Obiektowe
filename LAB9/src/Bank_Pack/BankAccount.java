package Bank_Pack;

public record BankAccount(String numberOfAccount, double balance){
    public BankAccount {
        if(balance < 0){
            balance = 0;
        }
    }

    public BankAccount(String numberOfAccount) {
        this(numberOfAccount, 0);
    }
}
