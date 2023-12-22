package assignment.ass03.v1array;

import assignment.ass03.v1array.dao.AccountDao;
import assignment.ass03.v1array.dao.impl.AccountDaoImpl;
import jdk.jfr.Registered;

import java.beans.JavaBean;
import java.util.ArrayList;

/**
 * ���������ࣺ�����������ҵ����������ȡ�ת�˵ȡ�
 * �Ľ�����AccountInfo����װ�˻���Ϣ
 * 
 */
public class BankTransaction {
	AccountDao accountDao = new AccountDaoImpl();;


	/**
	 * ����һ���µ��ʺ�
	 * 
	 * @param newId     �µ��ʻ�ID
	 * @param password  ���������
	 * @return true  �����ɹ�
	 */
	public boolean createAccount(String newId, String password) {
		try {
			// ���Ҫ�������ʺ��Ƿ��Ѿ�����
			if (accountDao.isAccountExist(newId)) return false;
			// ����һ���µ��ʺ�
			AccountInfo acc = new AccountInfo(newId, password);
			// ����˺�
			ArrayList<AccountInfo> accountInfos = accountDao.add(acc);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * ɾ���ʺ�
	 * 
	 * @param accountId   ��ɾ�����ʻ�ID
	 * @return true  ɾ���ɹ�
	 */
	public boolean deleteAccount(String accountId) {
		try{
			// ɾ��ǰ�����˻��Ƿ����
			if (!accountDao.isAccountExist(accountId)) {
				System.out.println("���˻�������!");
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
	 * �������Ĵ���
	 * 
	 * @param accountId  Ҫ�����ʻ�ID
	 * @param money      �����Ľ����
	 * @return true  �����ɹ�
	 */
	public boolean deposit(String accountId, double money) {
		try{
			if(! accountDao.isAccountExist(accountId)){
				System.out.println("���˺Ų�����");
				return false;
			}
			AccountInfo info = accountDao.deposit(accountId, money);
			System.out.println("���ɹ���");
			System.out.println(info);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * ȡ������Ĵ���
	 * 
	 * @param accountId   Ҫȡ����ʻ�ID
	 * @param money       �����Ľ����
	 * @return true  �����ɹ�
	 */
	public boolean withdraw(String accountId, double money) {
		try{
			if(! accountDao.isAccountExist(accountId)){
				System.out.println("���˺Ų����ڣ�");
				return false;
			}
			AccountInfo info = accountDao.withdraw(accountId, money);
			if(info != null){
				System.out.println("ȡ��ɹ�!");
				System.out.println(info);
			}else {
				System.out.println("����");
				return false;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * ת�ʲ����Ĵ���
	 * 
	 * @param fromId   Ҫת�����ʻ�ID
	 * @param toId     Ҫת����ʻ�ID
	 * @param money    �����Ľ����
	 * @return true  �����ɹ�
	 */
	public boolean transfer(String fromId, String toId, double money) {
		// �����֤
		if (!accountDao.isAccountExist(fromId) || !accountDao.isAccountExist(toId))
			return false;
		if (withdraw(fromId, money) && deposit(toId, money)) {
			return true;
		}
		return false;
	}

	/**
	 * �����ʻ��Ƿ��Ƿ�Ϸ�
	 * @param id �ʻ�ID
	 * @return true ���˻�����
	 */
	public boolean checkAccount(String id, String pass) {
		return accountDao.checkAccount(id,pass);
	}

	/**
	 * ��ӡ���ʺź����
	 */
	public void printAllAcount() {
		System.out.println("--------------------------------");
		System.out.println("accountId\t\tbalance");
		System.out.println("--------------------------------");
		System.out.println(accountDao.getAll().toString());
		System.out.println("--------------------------------");
	}

	
}
