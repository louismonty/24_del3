package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getBalance() {
        Account account = new Account(200);
        assertEquals(account.getBalance(),200);
    }

    @Test
    void setBalance() {
        Account account = new Account(200);
        account.setBalance(300);
        assertEquals(account.getBalance(),300);
    }

    @Test
    void subtractBalance() {
        Account account = new Account(200);
        account.subtractBalance(20);
        assertEquals(account.getBalance(),180);
    }
    @Test
    void addBalance(){
        Account account = new Account(200);
        account.addBalance(100);
        assertEquals(account.getBalance(),300);
    }
}