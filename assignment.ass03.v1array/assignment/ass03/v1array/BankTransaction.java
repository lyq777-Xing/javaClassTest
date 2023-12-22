package assignment.ass03.v1array;

import assignment.ass03.v1array.dao.AccountDao;
import assignment.ass03.v1array.dao.impl.AccountDaoImpl;
import jdk.jfr.Registered;

import java.beans.JavaBean;
import java.util.ArrayList;

/**
 * 银行事务类：处理各类银行业务操作，如存款、取款、转账等。
 * 改进：用AccountInfo来封装账户信息
 * 
 */
public class BankTransaction {
	AccountDao accountDao = new AccountDaoImpl();;


	/**
	 * 创建一个新的帐号
	 * 
	 * @param newId     新的帐户ID
	 * @param password  输入的密码
	 * @return true  创建成功
	 */
	public boolean createAccount(String newId, String password) {
		try {
			// 检查要创建的帐号是否已经存在
			if (accountDao.isAccountExist(newId)) return false;
			// 创建一个新的帐号
			AccountInfo acc = new AccountInfo(newId, password);
			// 添加账号
			ArrayList<AccountInfo> accountInfos = accountDao.add(acc);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 删除帐号
	 * 
	 * @param accountId   待删除的帐户ID
	 * @return true  删除成功
	 */
	public boolean deleteAccount(String accountId) {
		try{
			// 删除前检验账户是否存在
			if (!accountDao.isAccountExist(accountId)) {
				System.out.println("该账户不存在!");
				return false;
			}
			accountDao.remove(accountId);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 存款操作的处理
	 * 
	 * @param accountId  要存款的帐户ID
	 * @param money      操作的金额数
	 * @return true  操作成功
	 */
	public boolean deposit(String accountId, double money) {
		try{
			if(! accountDao.isAccountExist(accountId)){
				System.out.println("该账号不存在");
				return false;
			}
			AccountInfo info = accountDao.deposit(accountId, money);
			System.out.println("存款成功！");
			System.out.println(info);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 取款操作的处理
	 * 
	 * @param accountId   要取款的帐户ID
	 * @param money       操作的金额数
	 * @return true  操作成功
	 */
	public boolean withdraw(String accountId, double money) {
		try{
			if(! accountDao.isAccountExist(accountId)){
				System.out.println("该账号不存在！");
				return false;
			}
			AccountInfo info = accountDao.withdraw(accountId, money);
			if(info != null){
				System.out.println("取款成功!");
				System.out.println(info);
			}else {
				System.out.println("余额不足");
				return false;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 转帐操作的处理
	 * 
	 * @param fromId   要转出的帐户ID
	 * @param toId     要转入的帐户ID
	 * @param money    操作的金额数
	 * @return true  操作成功
	 */
	public boolean transfer(String fromId, String toId, double money) {
		// 身份验证
		if (!accountDao.isAccountExist(fromId) || !accountDao.isAccountExist(toId))
			return false;
		if (withdraw(fromId, money) && deposit(toId, money)) {
			return true;
		}
		return false;
	}

	/**
	 * 检验帐户是否是否合法
	 * @param id 帐户ID
	 * @return true 若账户存在
	 */
	public boolean checkAccount(String id, String pass) {
		return accountDao.checkAccount(id,pass);
	}

	/**
	 * 打印出帐号和余额
	 */
	public void printAllAcount() {
		System.out.println("--------------------------------");
		System.out.println("accountId\t\tbalance");
		System.out.println("--------------------------------");
		System.out.println(accountDao.getAll().toString());
		System.out.println("--------------------------------");
	}

	
}
