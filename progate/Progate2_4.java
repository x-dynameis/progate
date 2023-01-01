	package progate;

class Progate2_4 {
	public static void main(String[] args) {
		int x = 51;
//		ifのテスト
		if(x>8) {
			System.out.println("xは８より大きい");
		}else {
			System.out.println("xは8より小さい");
		}
//		switch文のテスト
		switch(x){
			case 5:
				System.out.println("大吉です");
				break;
			case 4:
				System.out.println("中吉です");
				break;
			case 3:
				System.out.println("小吉です");
				break;
			case 2:
				System.out.println("凶です");
				break;
			case 1:
				System.out.println("大凶です");
				break;
			default:
				System.out.println("おみくじはやりません");
				break;
		}
	}
}
