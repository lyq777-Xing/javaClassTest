package assignment.ass03.v1array.dao;

import assignment.ass03.v1array.AccountInfo;

import java.util.ArrayList;

/**
 * @author lyq
 * @time 2023/12/22 20:01
 */
public interface AccountDao {

    /**
     * ��ѯ�����˻���Ϣ
     * @return
     */
    public ArrayList<AccountInfo> getAll();

    /**
     * ִ�в���ǰ�������ʻ�����Ϣ�Ƿ�Ϸ�
     * @param id �ʻ�ID
     * @return true ���û�������
     */
    public boolean isAccountExist(String id);

    /**
     * �����˻���ѯ
     * @param accountId
     * @return
     */
    public int findById(String accountId);

    /**
     * ����˻�����
     * @param acc
     * @return
     */
    public ArrayList<AccountInfo> add(AccountInfo acc);

    /**
     * ɾ���˻�
     * @param accountId
     */
    public void remove(String accountId);

    /**
     * ���
     * @param accountId
     * @param money
     */
    public AccountInfo deposit(String accountId, double money);

    /**
     * ȡ��
     * @param accountId
     * @param money
     * @return
     */
    public AccountInfo withdraw(String accountId, double money);

    /**
     * �����ʻ��Ƿ��Ƿ�Ϸ�
     * @param id �ʻ�ID
     * @return true ���˻�����
     */
    public boolean checkAccount(String id, String pass);
}
