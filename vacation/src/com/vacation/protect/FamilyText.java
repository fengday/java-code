package com.vacation.protect;


public class FamilyText {        
	
	public static void main(String[] args) {
		boolean isFlag = true;
		String details = "��֧\t�˻����\t\t��֧���\t˵    ��\n";
		double balance = 10000;//��ʼ�˻� ���

		do {
			System.out
					.println("\n-----------------��ͥ��֧�������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��\n");
			System.out.print("                   ��ѡ��(1-4)��");

			// Ҫ���û�����1-4ѡ��
			char menu = Utility.readMenuSelection();
			switch (menu) {
			case '1':
//				System.out.println("��ʾ����");
				System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
				System.out.println(details);
				
				System.out.println();
				System.out.println("---------------------------------------------");
				
				break;
			case '2':
//				System.out.println("�������");
				System.out.print("���������");
				int money = Utility.readNumber();//�Ӽ��̻�ȡ����Ľ��
				
				System.out.print("��������˵����");
				String desc = Utility.readString();//�Ӽ��̻�ȡ�����˵��
				
				//���ݻ�ȡ�Ľ�������˵���޸��û�����Ϣ
				balance += money;
				
				details += ("����\t" + balance + "\t\t" + money + "\t" +desc + "\n");
				
				System.out.println("---------------------�Ǽ����-------------------");
				break;
			case '3':
//				System.out.println("֧�����");
				System.out.print("����֧����");
				int money1 = Utility.readNumber();//�Ӽ��̻�ȡ֧���Ľ��
				
				System.out.print("����֧��˵����");
				String desc1 = Utility.readString();//�Ӽ��̻�ȡ֧����˵��
				
				//���ݻ�ȡ�Ľ���֧��˵���޸��û�����Ϣ
				if(balance >= money1){
					balance -= money1;
					details += ("֧��\t" + balance + "\t\t" + money1 + "\t" +desc1 + "\n");
					System.out.println("---------------------�Ǽ����-------------------");
				}else{
					System.out.println("���㣬֧��ʧ��");
				}
				
				break;
			case '4':
				System.out.print("ȷ���Ƿ��˳�(Y/N)��");
				char exit = Utility.readConfirmSelection();
				if(exit == 'Y'){
					isFlag = false;
				}
				
				break;

			}

		} while (isFlag);


	}

}
