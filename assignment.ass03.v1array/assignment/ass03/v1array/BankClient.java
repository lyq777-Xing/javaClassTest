package assignment.ass03.v1array;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 银行系统的客户端
 * 接受客户端的输入，并进行处理
 * 
 */
public class BankClient {
	private static BankTransaction bt = new BankTransaction();

	public static void main(String[] args) throws Exception {
		while (true) {
			mainMenu();  // 显示主菜单
			BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
			String cmd = br.readLine();
			if (cmd == null || "".equals(cmd.trim()))
				continue;
			if ("1".equals(cmd)) {
				createAccount();
				continue;
			} else if ("2".equals(cmd)) {
				//
				continue;
			} else if ("3".equals(cmd)) {
				deposit();
				continue;
			} else if ("4".equals(cmd)) {
				//
				continue;
			} else if ("5".equals(cmd)) {
				//
				continue;
			} else if ("6".equals(cmd)) {
				bt.printAllAcount();
				continue;
			} else if ("help".equalsIgnoreCase(cmd.trim())) {
				mainMenu();
				continue;
			} else if ("quit".equalsIgnoreCase(cmd.trim())) {
				break;
			} else {
				System.out.println("Error Command，请输入help查询！");
				continue;
			}
		}
	}
	/**
	* 创建帐号处理
	* @return true 创建成功
	*/
	private static boolean createAccount() throws Exception {
		System.out.println("请输入帐号和密码，以空格分开");
		BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		String temp = br1.readLine();
		//如果未输入或者输入全是空格，取消本次操作
		if (temp == null || temp.trim().equals("")) {
			System.out.println("操作无效！");
			return false;
		}

		String id, password;
		//以一个空格为分隔符
		//检查输入的单词是否两个
		if (countWords(temp) != 2) {
			System.out.println("操作无效！");
			return false;
		}
		//获得输入的ID（ID和密码中只能包括英文、数字和下划线的检查略去）
		id = temp.substring(0, temp.indexOf(" "));
		//获得输入的密码
		password = temp.substring(temp.indexOf(" ") + 1).trim();
		//创建帐户
		if (!bt.createAccount(id, password)) {
			//若失败则打印错误信息
			System.out.println("帐户已经存在");
			return false;
		}
		System.out.println("祝贺您，账户创建成功!");
		System.out.println("按回车键返回主菜单！");
		br1.readLine();
		return true;
	}
	/**
	* 存款处理
	* @return true 创建成功
	*/
	private static boolean deposit() throws Exception {
		System.out.println("请输入要存款的帐号和存入金额，以空格分开");
		Scanner sin = new Scanner(System.in);
		String temp = sin.nextLine();
		//如果未输入或者输入全是空格，取消本次操作
		if (temp == null || temp.trim().equals("")) {
			System.out.println("操作无效！");
			return false;
		}
		String id, money;
		//以一个空格为分隔符
		//检查输入的单词是否两个
		if (countWords(temp) != 2) {
			System.out.println("操作无效！");
			return false;
		}
		//获得输入的ID（ID和密码中只能包括英文、数字和下划线的检查略去）
		id = temp.substring(0, temp.indexOf(" "));
		//获得输入的金额
		money = temp.substring(temp.lastIndexOf(" ") + 1).trim();

		//存款
		if(!bt.deposit(id,Double.parseDouble(money))) {
			//若失败则打印错误信息
			System.out.println("操作错误");
			return false;
		}
		System.out.println("祝贺您，存款成功!");
		System.out.println("按回车键返回主菜单！");
		sin.nextLine();
		return true;
	}
	
	/**
	 * 输出帮助信息
	 */
	public static void mainMenu() {
		System.out.println("*********************************");
		System.out.println("        银行账户管理系统");
		System.out.println("*********************************");
		System.out.println("1.创建帐户；2.注销帐号；3.存款；4.取款；5.转帐；6.打印所有帐号");
		System.out.println("help:帮助；quit：退出");
		System.out.println("-------------------------------");
		System.out.println("请选择服务种类：");
	}
	
	/** 
	 * 计算字符串中的单词个数
	 * 默认以空格、TAB、换行符、制表符为分隔
	 */
	public static int countWords(String str) {
		if (str == null || str.trim().equals("")) return 0;
		StringTokenizer st = new StringTokenizer(str);
		return st.countTokens();		
	}
}
