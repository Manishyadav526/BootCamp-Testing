package com.No_Argument_Constructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    void noArgConstructorThenDeposit() {
        // Arrange - create an account using the no-argument constructor
        Account account = new Account();

        // Act - deposit 10
        account.deposit(10);

        // Assert - check that the balance is 10
        assertEquals(10, account.getBalance());
    }

    @Test
    void parameterizedConstructorDepositThenWithdraw() {
        // Arrange - create a checking account using the parameterized constructor
        Account checking = new Account(0, 1001, AccountType.CHECKING);

        // Act - deposit 10
        checking.deposit(10);

        // Act - withdraw 20
        checking.withdraw(20);

        // Assert - check that the resulting balance of the account is -10
        assertEquals(-10, checking.getBalance());
    }

    /* EXCEPTIONS */
    @Test
    void withdrawFromNewSavingsAccountThrowsException() {
        // create a new savings account and immediately try to withdraw 10 from it
        Account savings = new Account(0, 2001, AccountType.SAVINGS);

        assertThrows(ArithmeticException.class, () -> savings.withdraw(10));
    }

    /* PARAMETERIZED TEST */
    // For every iteration: create a new savings account, deposit 10, then withdraw the given amount.
    // Iteration 1: withdraw 0  -> balance should be 10
    // Iteration 2: withdraw 5  -> balance should be 5
    // Iteration 3: withdraw 10 -> balance should be 0
    @ParameterizedTest
    @CsvSource({
            "0, 10",
            "5, 5",
            "10, 0"
    })
    void withdrawFromSavingsAccount(int withdrawAmount, int expectedBalance) {
        Account savings = new Account(0, 3001, AccountType.SAVINGS);
        savings.deposit(10);
        savings.withdraw(withdrawAmount);
        assertEquals(expectedBalance, savings.getBalance());
    }
}
