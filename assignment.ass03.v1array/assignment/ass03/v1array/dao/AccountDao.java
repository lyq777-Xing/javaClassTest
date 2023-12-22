package assignment.ass03.v1array.dao;

import assignment.ass03.v1array.AccountInfo;

import java.util.ArrayList;

/**
 * @author lyq
 * @time 2023/12/22 20:01
 */
public interface AccountDao {

    /**
     * 查询所有账户信息
     * @return
     */
    public ArrayList<AccountInfo> getAll();

    /**
     * 执行操作前，检验帐户的信息是否合法
     * @param id 帐户ID
     * @return true 若用户名存在
     */
    public boolean isAccountExist(String id);

    /**
     * 根据账户查询
     * @param accountId
     * @return
     */
    public int findById(String accountId);

    /**
     * 添加账户操作
     * @param acc
     * @return
     */
    public ArrayList<AccountInfo> add(AccountInfo acc);

    /**
     * 删除账户
     * @param accountId
     */
    public void remove(String accountId);

    /**
     * 存款
     * @param accountId
     * @param money
     */
    public AccountInfo deposit(String accountId, double money);

    /**
     * 取款
     * @param accountId
     * @param money
     * @return
     */
    public AccountInfo withdraw(String accountId, double money);

    /**
     * 检验帐户是否是否合法
     * @param id 帐户ID
     * @return true 若账户存在
     */
    public boolean checkAccount(String id, String pass);
}
