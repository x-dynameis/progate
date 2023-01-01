package progate;

class Progate2_9 {
	public static void main(String[] args) {
		int number=10;
		while(number > 0) {
			if(number%3==0) {
				System.out.println("haw!");
				break;
			}
			System.out.println(number);
			number--;
		}
		for(int i=1;i<=10;i++) {
			//3の倍数のときにアホになります
			if(i%3==0) {
				System.out.println("foo!");
				continue;
			}
			System.out.println(i+ "回目のループです");
		}
	}
}
