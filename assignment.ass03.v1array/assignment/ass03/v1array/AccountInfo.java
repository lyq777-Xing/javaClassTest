package assignment.ass03.v1array;

/**
 * 银行账户类
 * 
 */
public class AccountInfo {
	/** 帐号 */
	private String accountId = null;
	/** 密码 */
	private String password = null;
	/** 余额 */
	private double balance;
	
	/**
	 * Constructor of BankTransaction
	 * @param id 用户帐号
	 * @param password 用户密码
	 * @param balance 用户余额
	 */
	public AccountInfo(String id, String password, double balance) {
		this.accountId = id;
		this.password = password;
		this.balance = balance;
	}
	
	public AccountInfo(String id) {
		this(id, "123456", 0);
	}
	
	public AccountInfo(String id, String password) {
		this.accountId = id;
		this.password = password;
	}
	
	/** OverRiding toString() */
	public String toString() {
		return
			"帐户: " + accountId + '\t' +
			"密码: " + password + '\t' +
			"余额: " + balance;
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
