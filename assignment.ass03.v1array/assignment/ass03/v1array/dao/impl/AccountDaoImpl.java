package assignment.ass03.v1array.dao.impl;

import assignment.ass03.v1array.AccountInfo;
import assignment.ass03.v1array.dao.AccountDao;

import java.util.ArrayList;

public class AccountDaoImpl implements AccountDao {
    /** ’Àªß */
    ArrayList<AccountInfo> users = new ArrayList<AccountInfo>();
    @Override
    public ArrayList<AccountInfo> getAll(){
        return users;
    }

    @Override
    public boolean isAccountExist(String id) {
        for (AccountInfo account :
                users) {
            if (account.getAccountId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int findById(String accountId) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getAccountId().equals(accountId)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<AccountInfo> add(AccountInfo acc) {
        users.add(acc);
        return users;
    }

    @Override
    public void remove(String accountId) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getAccountId().equals(accountId)){
                users.remove(i);
                break;
            }
        }
    }

    @Override
    public AccountInfo deposit(String accountId, double money) {
        int index = findById(accountId);
        users.get(index).setBalance( users.get(index).getBalance() + money);
        return users.get(index);
    }

    @Override
    public AccountInfo withdraw(String accountId, double money){
        int index = findById(accountId);
        double balance = users.get(index).getBalance();
        if (balance - money < 0){
            return null;
        }else {
            users.get(index).setBalance(balance - money);
            return users.get(index);
        }
    }

    @Override
    public boolean checkAccount(String id, String pass) {
        int index = findById(id);
        if(index == -1){
            return false;
        }
        if(users.get(index).getPassword().equals(pass)){
            return true;
        }
        return false;
    }
}
