package algorithmscount.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountConditionCounter {

    public int CountWithBalanceGreaterThan(List<BankAccount> bankAccounts, int limit) {
        int count = 0;
        for (BankAccount actual: bankAccounts) {
            if (actual.getBalance()>limit) {
                count ++;
            }
        }
        return count;

    }


}
