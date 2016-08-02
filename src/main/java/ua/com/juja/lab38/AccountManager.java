package ua.com.juja.lab38;

/**
 * Created by asu06 on 21.07.16.
 */
public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        int k = 0;
        while (k < accounts.length) {
            try {
                accounts[k].change(delta[k]);
            } catch (TryAgainException e) {
                continue;
            } catch (BlockAccountException e) {
                try {
                    for (int i = 0; i < k; i++) {
                        accounts[i].change(-delta[i]);
                    }
                } catch (TryAgainException e1) {
                    e1.printStackTrace();
                } catch (BlockAccountException e1) {
                    e1.printStackTrace();
                }
                return false;
            }
            k++;
        }
        return true;
    }

    abstract class Account {
        protected int amount;

        public Account(int amount) {
            this.amount = amount;
        }

        public abstract void change(int delta) throws TryAgainException, BlockAccountException;

        public int getAmount() {
            return amount;
        }
    }
}