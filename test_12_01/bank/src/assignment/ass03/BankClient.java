package assignment.ass03;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * @author lyq
 * @time 2023/12/1 20:55
 */
public class BankClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BankTransaction bankTransaction = new BankTransaction();
        System.out.println("----欢迎来到银行管理系统----");
        System.out.println("请选择需要进行的操作：");
        System.out.println("1、开户------------------");
        System.out.println("2、登录------------------");
        System.out.println("3、退出------------------");
        while (true){
            int oneChoice = scanner.nextInt();
            switch (oneChoice){
                case 1:{
                    try{
                        System.out.println("请输入密码：");
                        String pwd = scanner.next();
                        AccountInfo account = bankTransaction.createAccount(pwd);
                        System.out.println("开户成功！详细信息如下：");
                        System.out.println(account.toString());
                        String accountId = account.getAccountId();
                        while (true){
                            System.out.println("请选择需要进行的操作：");
                            System.out.println("1、注销用户---------------");
                            System.out.println("2、存款------------------");
                            System.out.println("3、取款------------------");
                            System.out.println("4、查询余额---------------");
                            System.out.println("5、退出登录---------------");
                            int twoChoice = scanner.nextInt();
                            switch (twoChoice){
                                case 1:{
                                    try{
                                        System.out.println("请问确认要注销该用户吗？若确定请按1，反之请按0");
                                        int choice = scanner.nextInt();
                                        if(choice == 1){
                                            bankTransaction.deleteAccount(accountId);
                                            System.out.println("注销成功");
                                            scanner.close();
                                            exit(1);
                                        }else if (choice == 0){
                                            System.out.println("已取消");
                                        }
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("注销失败");
                                    }
                                    break;
                                }
                                case 2:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        System.out.println("请输入存款金额：");
                                        double money = scanner.nextDouble();
                                        bankTransaction.deposit(accountId,pw,money);
                                        System.out.println("存款成功");
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("存款失败");
                                    }
                                    break;
                                }
                                case 3:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        System.out.println("请输入取款金额：");
                                        double money = scanner.nextDouble();
                                        bankTransaction.withdraw(accountId,pw,money);
                                        System.out.println("取款成功");
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("取款失败");
                                    }
                                    break;
                                }
                                case 4:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        if(bankTransaction.getMoney(accountId,pw) != null){
                                            System.out.println("余额为：" + bankTransaction.getMoney(accountId,pw));
                                        }else {
                                            System.out.println("请确定输入信息是否正确");
                                        }
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("查询余额失败");
                                    }
                                    break;
                                }
                                case 5:{
                                    System.out.println("bye~~");
                                    scanner.close();
                                    exit(1);
                                }
                            }
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("开户失败");
                    }
                }
                case 2:{
                    System.out.println("请输入账号：");
                    String accountId = scanner.next();
                    System.out.println("请输入密码：");
                    String pwd = scanner.next();
                    if(bankTransaction.login(accountId,pwd)){
                        System.out.println("登录成功！");
                        while (true){
                            System.out.println("请选择需要进行的操作：");
                            System.out.println("1、注销用户---------------");
                            System.out.println("2、存款------------------");
                            System.out.println("3、取款------------------");
                            System.out.println("4、查询余额---------------");
                            System.out.println("5、退出登录---------------");
                            int twoChoice = scanner.nextInt();
                            switch (twoChoice){
                                case 1:{
                                    try{
                                        System.out.println("请问确认要注销该用户吗？若确定请按1，反之请按0");
                                        int choice = scanner.nextInt();
                                        if(choice == 1){
                                            bankTransaction.deleteAccount(accountId);
                                            System.out.println("注销成功");
                                            scanner.close();
                                            exit(1);
                                        }else if (choice == 0){
                                            System.out.println("已取消");
                                        }
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("注销失败");
                                    }
                                    break;
                                }
                                case 2:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        System.out.println("请输入存款金额：");
                                        double money = scanner.nextDouble();
                                        bankTransaction.deposit(accountId,pw,money);
                                        System.out.println("存款成功");
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("存款失败");
                                    }
                                    break;
                                }
                                case 3:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        System.out.println("请输入取款金额：");
                                        double money = scanner.nextDouble();
                                        bankTransaction.withdraw(accountId,pw,money);
                                        System.out.println("取款成功");
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("取款失败");
                                    }
                                    break;
                                }
                                case 4:{
                                    try{
                                        System.out.println("请输入账户密码：");
                                        String pw = scanner.next();
                                        if(bankTransaction.getMoney(accountId,pw) != null){
                                            System.out.println("余额为：" + bankTransaction.getMoney(accountId,pw));
                                        }else {
                                            System.out.println("请确定输入信息是否正确");
                                        }
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.out.println("查询余额失败");
                                    }
                                    break;
                                }
                                case 5:{
                                    System.out.println("bye~~");
                                    scanner.close();
                                    exit(1);
                                }
                            }
                        }
                    }else {
                        System.out.println("用户名或密码错误，请重新登录！");
                    }
                }
                case 3:{
                    scanner.close();
                    exit(1);
                }
            }
        }
    }
}
