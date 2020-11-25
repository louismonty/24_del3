package Game;

public class Account {

    //balance Getter
    public int getBalance()
    {
        return balance;
    }

    //balance Setter
    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    //Class attributes
    private int balance;

    //Class constructor for the Account class
    public Account(int balance)
    {
        this.balance = balance;
    }

    //Add to Balance method
    public int addBalance(int addition)
    {
        return balance += addition;
    }

    //Subtract from Balance method
    public int subtractBalance(int subtraction)
    {
        return balance -= subtraction;
    }
}
