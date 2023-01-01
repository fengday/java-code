package com.vacation.protect;

public class FamilyProtect {
	public static void main(String[] args) {
		boolean isflag=true;
		String details = "��֧\t�˻����\t\t��֧���\t˵    ��\n";
		double balance=10000;
		do
		{
			
		System.out.println("----------��ͥ��֧�������---------------\n");
		System.out.println("          1��֧��ϸ");
		System.out.println("          2�Ǽ�����");
		System.out.println("          3�Ǽ�֧��");
		System.out.println("          4��        ��\n");
		System.out.println("          ��ѡ��(1~4):�밴���������");
		char menu=Utility.readMenuSelection();
		switch(menu) {
		case '1'://System.out.println("          1��֧��ϸ");
		         System.out.println(details);
		break;
		case '2'://System.out.println("          2�Ǽ�����");
			System.out.println("�������");
			System.out.print("���������");
			int money = Utility.readNumber();
			
			System.out.print("��������˵����");
			String desc = Utility.readString();
			balance += money;
			details += ("����\t" + balance + "\t\t" + money + "\t" +desc + "\n");
			System.out.println("---------------------�Ǽ����-------------------");
		break;
		case '3':System.out.println("          3�Ǽ�֧��");
		System.out.println("֧�����");
		System.out.print("����֧����");
		int money1 = Utility.readNumber();
		
		System.out.print("����֧��˵����");
		String desc1 = Utility.readString();
		balance -= money1;
		details += ("����\t" + balance + "\t\t" + money1 + "\t" +desc1 + "\n");
		System.out.println("---------------------�Ǽ����-------------------");break;
		case '4':System.out.println("          4��        ��");
		System.out.print("ȷ���Ƿ��˳�(Y/N)��");
		char exit = Utility.readConfirmSelection();
		if(exit == 'Y'){
			isflag = false;
		}
		
		break;

		}
		}while(isflag);
	}

}
