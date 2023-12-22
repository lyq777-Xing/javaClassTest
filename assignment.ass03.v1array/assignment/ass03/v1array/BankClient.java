package assignment.ass03.v1array;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * ����ϵͳ�Ŀͻ���
 * ���ܿͻ��˵����룬�����д���
 * 
 */
public class BankClient {
	private static BankTransaction bt = new BankTransaction();

	public static void main(String[] args) throws Exception {
		while (true) {
			mainMenu();  // ��ʾ���˵�
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
				System.out.println("Error Command��������help��ѯ��");
				continue;
			}
		}
	}
	/**
	* �����ʺŴ���
	* @return true �����ɹ�
	*/
	private static boolean createAccount() throws Exception {
		System.out.println("�������ʺź����룬�Կո�ֿ�");
		BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		String temp = br1.readLine();
		//���δ�����������ȫ�ǿո�ȡ�����β���
		if (temp == null || temp.trim().equals("")) {
			System.out.println("������Ч��");
			return false;
		}

		String id, password;
		//��һ���ո�Ϊ�ָ���
		//�������ĵ����Ƿ�����
		if (countWords(temp) != 2) {
			System.out.println("������Ч��");
			return false;
		}
		//��������ID��ID��������ֻ�ܰ���Ӣ�ġ����ֺ��»��ߵļ����ȥ��
		id = temp.substring(0, temp.indexOf(" "));
		//������������
		password = temp.substring(temp.indexOf(" ") + 1).trim();
		//�����ʻ�
		if (!bt.createAccount(id, password)) {
			//��ʧ�����ӡ������Ϣ
			System.out.println("�ʻ��Ѿ�����");
			return false;
		}
		System.out.println("ף�������˻������ɹ�!");
		System.out.println("���س����������˵���");
		br1.readLine();
		return true;
	}
	/**
	* ����
	* @return true �����ɹ�
	*/
	private static boolean deposit() throws Exception {
		System.out.println("������Ҫ�����ʺźʹ�����Կո�ֿ�");
		Scanner sin = new Scanner(System.in);
		String temp = sin.nextLine();
		//���δ�����������ȫ�ǿո�ȡ�����β���
		if (temp == null || temp.trim().equals("")) {
			System.out.println("������Ч��");
			return false;
		}
		String id, money;
		//��һ���ո�Ϊ�ָ���
		//�������ĵ����Ƿ�����
		if (countWords(temp) != 2) {
			System.out.println("������Ч��");
			return false;
		}
		//��������ID��ID��������ֻ�ܰ���Ӣ�ġ����ֺ��»��ߵļ����ȥ��
		id = temp.substring(0, temp.indexOf(" "));
		//�������Ľ��
		money = temp.substring(temp.lastIndexOf(" ") + 1).trim();

		//���
		if(!bt.deposit(id,Double.parseDouble(money))) {
			//��ʧ�����ӡ������Ϣ
			System.out.println("��������");
			return false;
		}
		System.out.println("ף���������ɹ�!");
		System.out.println("���س����������˵���");
		sin.nextLine();
		return true;
	}
	
	/**
	 * ���������Ϣ
	 */
	public static void mainMenu() {
		System.out.println("*********************************");
		System.out.println("        �����˻�����ϵͳ");
		System.out.println("*********************************");
		System.out.println("1.�����ʻ���2.ע���ʺţ�3.��4.ȡ�5.ת�ʣ�6.��ӡ�����ʺ�");
		System.out.println("help:������quit���˳�");
		System.out.println("-------------------------------");
		System.out.println("��ѡ��������ࣺ");
	}
	
	/** 
	 * �����ַ����еĵ��ʸ���
	 * Ĭ���Կո�TAB�����з����Ʊ��Ϊ�ָ�
	 */
	public static int countWords(String str) {
		if (str == null || str.trim().equals("")) return 0;
		StringTokenizer st = new StringTokenizer(str);
		return st.countTokens();		
	}
}
