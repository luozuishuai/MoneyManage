class FamilyAccount{
	public static void main(String[] args){
		String detail = "";
		int money = 10000;
		
		lable:while(true){
			System.out.println("\n-----------------��ͥ��֧�������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��\n");
			System.out.print("                   ��ѡ��(1-4)��");
			//�����û���������֣�
			char meanu = Utility.readMenuSelection();
			switch(meanu){
				case '1':
					System.out.println("\n-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println("��֧\t��֧���\t�˻����\t˵��\n");
					System.out.println(detail);					
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("���������");
					int addMoney = Utility.readNumber();
					money += addMoney;
					
					System.out.print("��������˵����");
					String addInfo = Utility.readString();
					
					detail += ("����\t"+ addMoney + "\t\t" + money + "\t\t" + addInfo + "\n");			
					System.out.println("---------------------�Ǽ����---------------------");
					
					break;
					
				case '3':
					System.out.print("����֧����");
					int payMoney = Utility.readNumber();
					if(payMoney >= money){
						System.out.print("�ۼ�����������");	
						continue;
					}else{
						money -= payMoney;						
					}
					
					System.out.print("����֧��˵����");
					String payInfo = Utility.readString();	

					detail += ("֧��\t"+ payMoney + "\t\t" + money + "\t\t" + payInfo + "\n");			
					System.out.println("---------------------�Ǽ����---------------------");
										
					break;
					
				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y/N)��");
					char choose = Utility.readConfirmSelection();
					if(choose == 'Y'){
						break lable;
					}else{
						break;
					}
					
			}
		}
	}
}
