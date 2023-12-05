package assignment.ass03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lyq
 * @time 2023/12/1 20:21
 * 银行业务处理类
 */
public class BankTransaction {
    ArrayList<AccountInfo> accountInfos = new ArrayList<AccountInfo>();

    /**
     * 无参构造函数中，先初始化一个数据案例
     */
    public BankTransaction() {
        AccountInfo accountInfo = new AccountInfo("111","111",66666);
        this.accountInfos.add(accountInfo);
    }

    public BankTransaction(ArrayList<AccountInfo> accountInfos) {
        this.accountInfos = accountInfos;
    }


    /**
     * 开户帐号
     * @param password
     */
    public AccountInfo createAccount(String password){
//        利用随机数随机生成账号
        String accountId = RandomNumber();
        AccountInfo accountInfo = new AccountInfo(accountId, password);
        accountInfos.add(accountInfo);
        return accountInfo;
    }

    /**
     * 注销帐号
     * @param accountId
     */
    public void deleteAccount(String accountId){
        for (int i = 0; i < accountInfos.size(); i++) {
            if(accountInfos.get(i).getAccountId().equals(accountId)){
                accountInfos.remove(i);
                break;
            }
        }
    }

    /**
     * 存款
     * @param accountId
     * @param password
     * @param money
     */
    public void deposit(String accountId,String password,double money) throws Exception {
        for (int i = 0; i < accountInfos.size(); i++) {
            AccountInfo info = accountInfos.get(i);
//            根据账号查询信息
            if(info.getAccountId().equals(accountId)){
//                判断密码是否正确
                if(info.getPassword().equals(password)){
                    double balance1 = info.getBalance();
                    accountInfos.get(i).setBalance(balance1 + money);
                }else {
                    throw new Exception("密码错误");
                }
            }
        }
    }

    /**
     * 取款
     * @param accountId
     * @param password
     * @param money
     * @throws Exception
     */
    public void withdraw(String accountId,String password,double money) throws Exception {
        for (int i = 0; i < accountInfos.size(); i++) {
            AccountInfo info = accountInfos.get(i);
//            根据账号查询信息
            if(info.getAccountId().equals(accountId)){
//                判断密码是否正确
                if(info.getPassword().equals(password)){
                    double balance1 = info.getBalance();
                    if(balance1 - money < 0){
                        throw new Exception("请输入正确的取款额");
                    }else {
                        accountInfos.get(i).setBalance(balance1 - money);
                    }
                }else {
                    throw new Exception("密码错误");
                }
            }
        }
    }

    /**
     * 判断是否登录成功
     * @param accountId
     * @param password
     * @return
     */
    public boolean login(String accountId,String password){
        for (int i = 0; i < accountInfos.size(); i++) {
            AccountInfo info = accountInfos.get(i);
//            根据账号查询信息
            if(info.getAccountId().equals(accountId)){
//                判断密码是否正确
                if(info.getPassword().equals(password)){
                   return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * 查询余额
     * @param accountId
     * @param password
     * @return
     */
    public Double getMoney(String accountId, String password) {
        for (int i = 0; i < accountInfos.size(); i++) {
            AccountInfo info = accountInfos.get(i);
//            根据账号查询信息
            if(info.getAccountId().equals(accountId)){
//                判断密码是否正确
                if(info.getPassword().equals(password)){
                    return info.getBalance();
                }
            }
        }
        return null;
    }


    /**
     * 生成十六位的随机数
     * @return
     */
    public static String RandomNumber(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }


}
