class FamilyAccount{
	public static void main(String[] args){
		String detail = "";
		int money = 10000;
		
		lable:while(true){
			System.out.println("\n-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出\n");
			System.out.print("                   请选择(1-4)：");
			//接受用户输入的数字：
			char meanu = Utility.readMenuSelection();
			switch(meanu){
				case '1':
					System.out.println("\n-----------------当前收支明细记录-----------------");
					System.out.println("收支\t收支金额\t账户金额\t说明\n");
					System.out.println(detail);					
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("本次收入金额：");
					int addMoney = Utility.readNumber();
					money += addMoney;
					
					System.out.print("本次收入说明：");
					String addInfo = Utility.readString();
					
					detail += ("收入\t"+ addMoney + "\t\t" + money + "\t\t" + addInfo + "\n");			
					System.out.println("---------------------登记完成---------------------");
					
					break;
					
				case '3':
					System.out.print("本次支出金额：");
					int payMoney = Utility.readNumber();
					if(payMoney >= money){
						System.out.print("咱家余额不够花啦！");	
						continue;
					}else{
						money -= payMoney;						
					}
					
					System.out.print("本次支出说明：");
					String payInfo = Utility.readString();	

					detail += ("支出\t"+ payMoney + "\t\t" + money + "\t\t" + payInfo + "\n");			
					System.out.println("---------------------登记完成---------------------");
										
					break;
					
				case '4':
					System.out.print("确认是否退出(Y/N)：");
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
