package assignment.ass03;

/**
 * @author lyq
 * @time 2023/12/1 20:20
 * 账户信息封装类
 */
public class AccountInfo {
//    帐号
    private String accountId;
//    密码
    private String password;
//    余额
    private double balance;

    @Override
    public String toString() {
        return "AccountInfo{" +
                "accountId='" + accountId + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public AccountInfo() {
    }

    public AccountInfo(String accountId, String password, double balance) {
        this.accountId = accountId;
        this.password = password;
        this.balance = balance;
    }
    public AccountInfo(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
        this.balance = 0.00;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
