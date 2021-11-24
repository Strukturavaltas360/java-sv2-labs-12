package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {

            for (BankAccount actual: accounts)
                if (actual.getBalance() > min) {
                    return true;
                }
        return false;
    }
}
