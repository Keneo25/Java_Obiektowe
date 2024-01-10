package Bank_Pack;

public class Test_Account {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("3323434", 445.89);
        BankAccount bankAccount2 = new BankAccount("332343k");
        BankAccount bankAccount3 = new BankAccount("332343k", -445.89);


        System.out.println(bankAccount1+ "\n");
        System.out.println(bankAccount2+ "\n");
        System.out.println(bankAccount3+ "\n");
    }




}
