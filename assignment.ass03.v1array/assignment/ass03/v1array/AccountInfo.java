package assignment.ass03.v1array;

/**
 * �����˻���
 * 
 */
public class AccountInfo {
	/** �ʺ� */
	private String accountId = null;
	/** ���� */
	private String password = null;
	/** ��� */
	private double balance;
	
	/**
	 * Constructor of BankTransaction
	 * @param id �û��ʺ�
	 * @param password �û�����
	 * @param balance �û����
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
			"�ʻ�: " + accountId + '\t' +
			"����: " + password + '\t' +
			"���: " + balance;
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
