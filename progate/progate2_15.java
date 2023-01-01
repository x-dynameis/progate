package progate;

class progate2_15 {
	public static void main(String[] args) {
		int[] numbers= {1,4,6,9,13,16};
		
		int oddSum=0;
		int evenSum =0;
		
		for(int number:numbers) {
			if(number%2==0) {
				oddSum+=number;
			}else {
				evenSum +=number;
			}

		}
		System.out.println("奇数の和は"+oddSum);
		System.out.println("偶数の和は"+evenSum);
	}
}
